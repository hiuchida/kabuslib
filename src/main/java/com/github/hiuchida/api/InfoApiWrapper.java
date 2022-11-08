package com.github.hiuchida.api;

import com.github.hiuchida.api.consts.FutureCode;
import com.github.hiuchida.api.consts.PutOrCallCode;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.InfoApi;
import io.swagger.client.model.SymbolNameSuccess;

public class InfoApiWrapper {
	private InfoApi api;

	public InfoApiWrapper() {
		api = new InfoApi();
	}

	public InfoApiWrapper(ApiClient apiClient) {
		api = new InfoApi(apiClient);
	}

	public SymbolNameSuccess symbolnameFutureGet(String X_API_KEY, Integer derivMonth, FutureCode futureCode)
			throws ApiException {
		String futureCodeStr = (futureCode != null) ? futureCode.toString() : null;
		SymbolNameSuccess response = api.symbolnameFutureGet(X_API_KEY, derivMonth, futureCodeStr);
		return response;
	}

	public SymbolNameSuccess symbolnameOptionGet(String X_API_KEY, Integer derivMonth, PutOrCallCode putOrCall, Integer strikePrice)
			throws ApiException {
		String putOrCallStr = (putOrCall != null) ? putOrCall.toString() : null;
		SymbolNameSuccess response = api.symbolnameOptionGet(X_API_KEY, derivMonth, putOrCallStr, strikePrice);
		return response;
	}

}
