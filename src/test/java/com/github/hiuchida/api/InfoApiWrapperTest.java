package com.github.hiuchida.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.github.hiuchida.api.consts.CashmarginCode;
import com.github.hiuchida.api.consts.ExchangeCode;
import com.github.hiuchida.api.consts.FutureCode;
import com.github.hiuchida.api.consts.ProductCode;
import com.github.hiuchida.api.consts.PutOrCallCode;
import com.github.hiuchida.api.consts.SideCode;
import com.github.hiuchida.api.consts.StateCode;

import io.swagger.client.api.AuthorizedToken;
import io.swagger.client.model.ApiSoftLimitResponse;
import io.swagger.client.model.BoardSuccess;
import io.swagger.client.model.OrdersSuccess;
import io.swagger.client.model.PositionsSuccess;
import io.swagger.client.model.SymbolNameSuccess;

/**
 * API tests for InfoApiWrapper
 */
// @Disabled
public class InfoApiWrapperTest {

	private final InfoApiWrapper api = new InfoApiWrapper();

    /**
     * ソフトリミット
     *
     * kabuステーションAPIのソフトリミット値を取得する
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apisoftlimitGetTest() throws Exception {
        String X_API_KEY = AuthorizedToken.getToken();
        ApiSoftLimitResponse response = api.apisoftlimitGet(X_API_KEY);

        // TODO: test validations
        System.out.println(response);        
    }

    /**
     * 時価情報・板情報
     *
     * 指定した銘柄の時価情報・板情報を取得します&lt;br&gt; レスポンスの一部にnullが発生した場合、該当銘柄を銘柄登録をしてから、 &lt;br&gt;再度時価情報・板情報APIを実行してください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void boardGetTest() throws Exception {
        String X_API_KEY = AuthorizedToken.getToken();
        String symbol = "9433"; // ＫＤＤＩ
        ExchangeCode ec = ExchangeCode.東証;
        BoardSuccess response = api.boardGet(X_API_KEY, symbol, ec);

        // TODO: test validations
        System.out.println(response);        
    }

    /**
     * 注文約定照会
     *
     * 注文一覧を取得します。&lt;br&gt; ※下記Queryパラメータは任意設定となります。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ordersGetTest() throws Exception {
        String X_API_KEY = AuthorizedToken.getToken();
        ProductCode product = ProductCode.先物;
        String id = null;
        String updtime = null;
        String details = null;
        String symbol = null;
        StateCode state = StateCode.処理済;
        SideCode side = SideCode.買;
        CashmarginCode cashmargin = CashmarginCode.新規;
        List<OrdersSuccess> response = api.ordersGet(X_API_KEY, product, id, updtime, details, symbol, state, side, cashmargin);

        // TODO: test validations
//        System.out.println(response);
        System.out.println("List<OrdersSuccess>.size=" + response.size());
        for (int i = 0; i < response.size(); i++) {
        	OrdersSuccess order = response.get(i);
        	if (order.getState() == 5) {
        		continue;
        	}
        	System.out.println((i + 1) + ": " + order);
        }
    }

    /**
     * 残高照会
     *
     * 残高一覧を取得します。&lt;br&gt;※下記Queryパラメータは任意設定となります。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void positionsGetTest() throws Exception {
        String X_API_KEY = AuthorizedToken.getToken();
        ProductCode product = ProductCode.先物;
        String symbol = null;
        SideCode side = SideCode.買;
        String addinfo = null;
        List<PositionsSuccess> response = api.positionsGet(X_API_KEY, product, symbol, side, addinfo);

        // TODO: test validations
        System.out.println(response);        
    }

    /**
     * 先物銘柄コード取得
     *
     * 先物銘柄コード取得
     *
     * @throws Exception
     *          if the Api call fails
     */
	@Test
	public void symbolnameFutureGetTest() throws Exception {
		String X_API_KEY = AuthorizedToken.getToken();
		Integer derivMonth = 202211;
		FutureCode futureCode = FutureCode.日経225mini先物;
		SymbolNameSuccess response = api.symbolnameFutureGet(X_API_KEY, derivMonth, futureCode);

		// TODO: test validations
//        System.out.println(response);
		assertEquals("167110019", response.getSymbol());
		assertEquals("日経225mini 22/11", response.getSymbolName());
	}
    /**
     * オプション銘柄コード取得
     *
     * オプション銘柄コード取得
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void symbolnameOptionGetTest() throws Exception {
        String X_API_KEY = AuthorizedToken.getToken();
        Integer derivMonth = 202211;
        PutOrCallCode putOrCall = PutOrCallCode.CALL;
        Integer strikePrice = 26000;
        SymbolNameSuccess response = api.symbolnameOptionGet(X_API_KEY, derivMonth, putOrCall, strikePrice);

        // TODO: test validations
//        System.out.println(response);
        assertEquals("147116018", response.getSymbol());
        assertEquals("日経平均オプション 22/11 コール 26000", response.getSymbolName());
    }
}
