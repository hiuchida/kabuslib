package com.github.hiuchida.api;

import org.junit.jupiter.api.Test;

import com.github.hiuchida.api.consts.SideCode;
import com.github.hiuchida.api.consts.deliv.ExchangeDCode;
import com.github.hiuchida.api.consts.deliv.FrontOrderTypeDCode;
import com.github.hiuchida.api.consts.deliv.TimeInForceCode;
import com.github.hiuchida.api.consts.deliv.TradeTypeCode;
import com.github.hiuchida.api.consts.stock.AccountTypeCode;
import com.github.hiuchida.api.consts.stock.CashmarginStockCode;
import com.github.hiuchida.api.consts.stock.DelivTypeCode;
import com.github.hiuchida.api.consts.stock.ExchangeSCode;
import com.github.hiuchida.api.consts.stock.FrontOrderTypeSCode;
import com.github.hiuchida.api.consts.stock.FundTypeCode;
import com.github.hiuchida.api.consts.stock.MarginTradeTypeCode;
import com.github.hiuchida.api.consts.stock.SecurityTypeSCode;
import com.github.hiuchida.api.model.SendOrderFutureRequestWrapper;
import com.github.hiuchida.api.model.SendOrderOptionRequestWrapper;
import com.github.hiuchida.api.model.SendOrderRequestWrapper;

import io.swagger.client.api.AuthorizedToken;
import io.swagger.client.api.TestConsts;
import io.swagger.client.model.OrderSuccess;

/**
 * API tests for OrderApiWrapper
 */
// @Disabled
public class OrderApiWrapperTest {
	private static final String PWD = TestConsts.TRADE_PASSWORD;

	private OrderApiWrapper api = new OrderApiWrapper();

    /**
     * 注文取消
     *
     * 注文を取消します
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cancelorderPutTest() throws Exception {
    	String orderId = "20220317A02N52384855";
        String X_API_KEY = AuthorizedToken.getToken();
        OrderSuccess response = api.cancelorderPut(orderId, PWD, X_API_KEY);

        // TODO: test validations
        System.out.println(response);        
    }

    /**
     * 注文発注（先物）
     *
     * 先物銘柄の注文を発注します。&lt;br&gt; 同一の銘柄に対しての注文は同時に5件ほどを上限としてご利用ください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sendoderFuturePostTest() throws Exception {
    	SendOrderFutureRequestWrapper req = new SendOrderFutureRequestWrapper();
        req.setSymbol("167060019"); // 日経225mini 22/06
        req.setExchange(ExchangeDCode.日通し);
        req.setTradeType(TradeTypeCode.新規);
        req.setTimeInForce(TimeInForceCode.FAS);
        req.setSide(SideCode.買);
        req.setQty(1); // 注文数量
        req.setFrontOrderType(FrontOrderTypeDCode.指値);
        req.setPrice(24500.0); // 注文価格
        req.setExpireDay(0); // 注文有効期限
        String X_API_KEY = AuthorizedToken.getToken();
        OrderSuccess response = api.sendoderFuturePost(req, PWD, X_API_KEY);

        // TODO: test validations
        System.out.println(response);        
    }

    /**
     * 注文発注（オプション）
     *
     * オプション銘柄の注文を発注します。&lt;br&gt; 同一の銘柄に対しての注文は同時に5件ほどを上限としてご利用ください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sendorderOptionPostTest() throws Exception {
    	SendOrderOptionRequestWrapper req = new SendOrderOptionRequestWrapper();
        req.setSymbol("147047518"); // 日経平均オプション 22/04 コール 27500
        req.setExchange(ExchangeDCode.日通し);
        req.setTradeType(TradeTypeCode.新規);
        req.setTimeInForce(TimeInForceCode.FAS);
        req.setSide(SideCode.買);
        req.setQty(1); // 注文数量
        req.setFrontOrderType(FrontOrderTypeDCode.指値);
        req.setPrice(1.0); // 注文価格
        req.setExpireDay(0); // 注文有効期限
        String X_API_KEY = AuthorizedToken.getToken();
        OrderSuccess response = api.sendorderOptionPost(req, PWD, X_API_KEY);

        // TODO: test validations
        System.out.println(response);        
    }

    /**
     * 注文発注（現物・信用）
     *
     * 注文を発注します。&lt;br&gt; 同一の銘柄に対しての注文は同時に5件ほどを上限としてご利用ください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sendorderPostTest() throws Exception {
    	SendOrderRequestWrapper req = new SendOrderRequestWrapper();
        req.setSymbol("9433@" + ExchangeSCode.東証.toString()); // ＫＤＤＩ
        req.setExchange(ExchangeSCode.東証);
        req.setSecurityType(SecurityTypeSCode.株式);
        req.setSide(SideCode.買);
        req.setCashMargin(CashmarginStockCode.現物);
        req.setMarginTradeType(MarginTradeTypeCode.制度信用);
        req.setDelivType(DelivTypeCode.指定なし);
        req.setFundType(FundTypeCode.信用代用);
        req.setAccountType(AccountTypeCode.特定);
        req.setQty(100); // 注文数量
        req.setFrontOrderType(FrontOrderTypeSCode.指値);
        req.setPrice(100.0); // 注文価格
        req.setExpireDay(0); // 注文有効期限
        String X_API_KEY = AuthorizedToken.getToken();
        OrderSuccess response = api.sendorderPost(req, PWD, X_API_KEY);

        // TODO: test validations
        System.out.println(response);        
    }

}
