package com.github.hiuchida.api;

import com.github.hiuchida.api.model.SendOrderFutureRequestWrapper;
import com.github.hiuchida.api.model.SendOrderOptionRequestWrapper;
import com.github.hiuchida.api.model.SendOrderRequestWrapper;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.OrderApi;
import io.swagger.client.model.OrderSuccess;
import io.swagger.client.model.RequestCancelOrder;
import io.swagger.client.model.RequestSendOrder;
import io.swagger.client.model.RequestSendOrderDerivFuture;
import io.swagger.client.model.RequestSendOrderDerivOption;

public class OrderApiWrapper {
	private OrderApi api;

	public OrderApiWrapper() {
		api = new OrderApi();
	}

	public OrderApiWrapper(ApiClient apiClient) {
		api = new OrderApi(apiClient);
	}

	public OrderSuccess cancelorderPut(String orderId, String password, String X_API_KEY) throws ApiException {
		RequestCancelOrder body = new RequestCancelOrder();
		body.setOrderId(orderId);
		body.setPassword(password);
		OrderSuccess response = api.cancelorderPut(body, X_API_KEY);
		return response;
	}

	public OrderSuccess sendoderFuturePost(SendOrderFutureRequestWrapper req, String password, String X_API_KEY)
			throws ApiException {
		RequestSendOrderDerivFuture body = req.toRequestSendOrderDerivFuture();
		body.setPassword(password);
		OrderSuccess response = api.sendoderFuturePost(body, X_API_KEY);
		return response;
	}

	public OrderSuccess sendorderOptionPost(SendOrderOptionRequestWrapper req, String password, String X_API_KEY)
			throws ApiException {
		RequestSendOrderDerivOption body = req.toRequestSendOrderDerivOption();
		body.setPassword(password);
		OrderSuccess response = api.sendorderOptionPost(body, X_API_KEY);
		return response;
	}

	public OrderSuccess sendorderPost(SendOrderRequestWrapper req, String password, String X_API_KEY)
			throws ApiException {
		RequestSendOrder body = req.toRequestSendOrder();
		body.setPassword(password);
		OrderSuccess response = api.sendorderPost(body, X_API_KEY);
		return response;
	}

}
