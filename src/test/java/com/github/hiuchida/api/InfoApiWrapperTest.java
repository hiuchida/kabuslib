package com.github.hiuchida.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.github.hiuchida.api.consts.FutureCode;
import com.github.hiuchida.api.consts.PutOrCallCode;

import io.swagger.client.api.AuthorizedToken;
import io.swagger.client.model.SymbolNameSuccess;

/**
 * API tests for InfoApiWrapper
 */
// @Disabled
public class InfoApiWrapperTest {

	private final InfoApiWrapper api = new InfoApiWrapper();

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
