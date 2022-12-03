package com.github.hiuchida.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.github.hiuchida.api.consts.ExchangeCode;
import com.github.hiuchida.api.model.RegisterSymbolWrapper;

import io.swagger.client.api.AuthorizedToken;
import io.swagger.client.model.RegistSuccess;
import io.swagger.client.model.UnregisterAllSuccess;

public class RegisterApiWrapperTest {

	private final RegisterApiWrapper api = new RegisterApiWrapper();

    /**
     * 銘柄登録
     *
     * PUSH配信する銘柄を登録します。&lt;br&gt; API登録銘柄リストを開くには、kabuステーションAPIインジケーターを右クリックし「API登録銘柄リスト」を選択してください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void registerPut1Test() throws Exception {
    	RegisterSymbolWrapper req = new RegisterSymbolWrapper();
        String symbol = "9433"; // ＫＤＤＩ
        ExchangeCode ec = ExchangeCode.東証;
        req.setSymbol(symbol);
        req.setExchange(ec);
        String X_API_KEY = AuthorizedToken.getToken();
        RegistSuccess response = api.registerPut(req, X_API_KEY);

        // TODO: test validations
        System.out.println(response);        
    }

    /**
     * 銘柄登録
     *
     * PUSH配信する銘柄を登録します。&lt;br&gt; API登録銘柄リストを開くには、kabuステーションAPIインジケーターを右クリックし「API登録銘柄リスト」を選択してください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void registerPut2Test() throws Exception {
    	List<RegisterSymbolWrapper> reqList = new ArrayList<>();
    	RegisterSymbolWrapper req = new RegisterSymbolWrapper();
        String symbol = "9433"; // ＫＤＤＩ
        ExchangeCode ec = ExchangeCode.東証;
        req.setSymbol(symbol);
        req.setExchange(ec);
        reqList.add(req);
        String X_API_KEY = AuthorizedToken.getToken();
        RegistSuccess response = api.registerPut(reqList, X_API_KEY);

        // TODO: test validations
        System.out.println(response);        
    }

    /**
     * 銘柄登録全解除
     *
     * API登録銘柄リストに登録されている銘柄をすべて解除します
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unregisterAllPutTest() throws Exception {
        String X_API_KEY = AuthorizedToken.getToken();
        UnregisterAllSuccess response = api.unregisterAllPut(X_API_KEY);

        // TODO: test validations
        System.out.println(response);        
    }

    /**
     * 銘柄登録解除
     *
     * API登録銘柄リストに登録されている銘柄を解除します
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unregisterPut1Test() throws Exception {
    	RegisterSymbolWrapper req = new RegisterSymbolWrapper();
        String symbol = "9433"; // ＫＤＤＩ
        ExchangeCode ec = ExchangeCode.東証;
        req.setSymbol(symbol);
        req.setExchange(ec);
        String X_API_KEY = AuthorizedToken.getToken();
        RegistSuccess response = api.unregisterPut(req, X_API_KEY);

        // TODO: test validations
        System.out.println(response);        
    }

    /**
     * 銘柄登録解除
     *
     * API登録銘柄リストに登録されている銘柄を解除します
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unregisterPut2Test() throws Exception {
    	List<RegisterSymbolWrapper> reqList = new ArrayList<>();
    	RegisterSymbolWrapper req = new RegisterSymbolWrapper();
        String symbol = "9433"; // ＫＤＤＩ
        ExchangeCode ec = ExchangeCode.東証;
        req.setSymbol(symbol);
        req.setExchange(ec);
        reqList.add(req);
        String X_API_KEY = AuthorizedToken.getToken();
        RegistSuccess response = api.unregisterPut(reqList, X_API_KEY);

        // TODO: test validations
        System.out.println(response);        
    }

}
