package com.github.hiuchida.api;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.AuthApi;
import io.swagger.client.model.RequestToken;
import io.swagger.client.model.TokenSuccess;

public class AuthApiWrapper {
	private AuthApi api;

	public AuthApiWrapper() {
		api = new AuthApi();
	}

	public AuthApiWrapper(ApiClient apiClient) {
		api = new AuthApi(apiClient);
	}

	public TokenSuccess tokenPost(String apIPassword) throws ApiException {
		RequestToken body = new RequestToken();
		body.setApIPassword(apIPassword);
		TokenSuccess response = api.tokenPost(body);
		return response;
	}

}
