package com.github.hiuchida.api;

import java.util.List;

import com.github.hiuchida.api.model.RegistSuccessWrapper;
import com.github.hiuchida.api.model.RegisterSymbolWrapper;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.RegisterApi;
import io.swagger.client.model.RegistSuccess;
import io.swagger.client.model.RequestRegister;
import io.swagger.client.model.RequestRegisterSymbols;
import io.swagger.client.model.RequestUnregister;
import io.swagger.client.model.UnregisterAllSuccess;

public class RegisterApiWrapper {
	private RegisterApi api;

	public RegisterApiWrapper() {
		api = new RegisterApi();
	}

	public RegisterApiWrapper(ApiClient apiClient) {
		api = new RegisterApi(apiClient);
	}

	public RegistSuccessWrapper registerPut(RegisterSymbolWrapper req, String X_API_KEY) throws ApiException {
		RequestRegister body = new RequestRegister();
		RequestRegisterSymbols rrs = req.toRequestRegisterSymbols();
		body.addSymbolsItem(rrs);
		RegistSuccess response = api.registerPut(body, X_API_KEY);
		return new RegistSuccessWrapper(response);
	}

	public RegistSuccessWrapper registerPut(List<RegisterSymbolWrapper> reqList, String X_API_KEY) throws ApiException {
		RequestRegister body = new RequestRegister();
		for (RegisterSymbolWrapper req : reqList) {
			RequestRegisterSymbols rrs = req.toRequestRegisterSymbols();
			body.addSymbolsItem(rrs);
		}
		RegistSuccess response = api.registerPut(body, X_API_KEY);
		return new RegistSuccessWrapper(response);
	}

	public UnregisterAllSuccess unregisterAllPut(String X_API_KEY) throws ApiException {
		UnregisterAllSuccess response = api.unregisterAllPut(X_API_KEY);
		return response;
	}

	public RegistSuccessWrapper unregisterPut(RegisterSymbolWrapper req, String X_API_KEY) throws ApiException {
		RequestUnregister body = new RequestUnregister();
		RequestRegisterSymbols rrs = req.toRequestRegisterSymbols();
		body.addSymbolsItem(rrs);
		RegistSuccess response = api.unregisterPut(body, X_API_KEY);
		return new RegistSuccessWrapper(response);
	}

	public RegistSuccessWrapper unregisterPut(List<RegisterSymbolWrapper> reqList, String X_API_KEY) throws ApiException {
		RequestUnregister body = new RequestUnregister();
		for (RegisterSymbolWrapper req : reqList) {
			RequestRegisterSymbols rrs = req.toRequestRegisterSymbols();
			body.addSymbolsItem(rrs);
		}
		RegistSuccess response = api.unregisterPut(body, X_API_KEY);
		return new RegistSuccessWrapper(response);
	}

}
