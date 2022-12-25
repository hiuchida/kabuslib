package com.github.hiuchida.api;

import java.util.ArrayList;
import java.util.List;

import com.github.hiuchida.api.consts.CashmarginCode;
import com.github.hiuchida.api.consts.ExchangeCode;
import com.github.hiuchida.api.consts.FutureCode;
import com.github.hiuchida.api.consts.ProductCode;
import com.github.hiuchida.api.consts.PutOrCallCode;
import com.github.hiuchida.api.consts.SideCode;
import com.github.hiuchida.api.consts.StateCode;
import com.github.hiuchida.api.model.PositionsSuccessWrapper;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.InfoApi;
import io.swagger.client.model.ApiSoftLimitResponse;
import io.swagger.client.model.BoardSuccess;
import io.swagger.client.model.OrdersSuccess;
import io.swagger.client.model.PositionsSuccess;
import io.swagger.client.model.SymbolNameSuccess;

public class InfoApiWrapper {
	private InfoApi api;

	public InfoApiWrapper() {
		api = new InfoApi();
	}

	public InfoApiWrapper(ApiClient apiClient) {
		api = new InfoApi(apiClient);
	}

	public ApiSoftLimitResponse apisoftlimitGet(String X_API_KEY) throws ApiException {
		ApiSoftLimitResponse response = api.apisoftlimitGet(X_API_KEY);
		return response;
	}

	public BoardSuccess boardGet(String X_API_KEY, String symbol, ExchangeCode ec) throws ApiException {
		String symbolStr = symbol + "@" + ec.toString();
		BoardSuccess response = api.boardGet(X_API_KEY, symbolStr);
		return response;
	}

	public List<OrdersSuccess> ordersGet(String X_API_KEY, ProductCode product, String id, String updtime, String details, String symbol, StateCode state, SideCode side, CashmarginCode cashmargin)
			throws ApiException {
		String productStr = (product != null) ? product.toString() : null;
		String stateStr = (state != null) ? state.toString() : null;
		String sideStr = (side != null) ? side.toString() : null;
		String cashmarginStr = (cashmargin != null) ? cashmargin.toString() : null;
		List<OrdersSuccess> response = api.ordersGet(X_API_KEY, productStr, id, updtime, details, symbol, stateStr, sideStr, cashmarginStr);
		return response;
	}

	public List<PositionsSuccessWrapper> positionsGet(String X_API_KEY, ProductCode product, String symbol, SideCode side, String addinfo)
			throws ApiException {
		String productStr = (product != null) ? product.toString() : null;
		String sideStr = (side != null) ? side.toString() : null;
		List<PositionsSuccess> response = api.positionsGet(X_API_KEY, productStr, symbol, sideStr, addinfo);
		if (response == null) {
			return null;
		}
		List<PositionsSuccessWrapper> list = new ArrayList<>();
		for (PositionsSuccess ps : response) {
			PositionsSuccessWrapper item = new PositionsSuccessWrapper(ps);
			list.add(item);
		}
		return list;
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
