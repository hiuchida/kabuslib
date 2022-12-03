package com.github.hiuchida.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.github.hiuchida.api.consts.ExchangeCode;

import io.swagger.client.model.RequestRegisterSymbols;

public class RegisterSymbolWrapperTest {

	@Test
	public void toRequestSendOrderTest() {
		String symbol = "symbol";
		ExchangeCode exchange = ExchangeCode.東証;

		RegisterSymbolWrapper o1 = new RegisterSymbolWrapper();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);

		RequestRegisterSymbols a1 = o1.toRequestRegisterSymbols();
		assertEquals(symbol, a1.getSymbol());
		assertEquals(exchange.intValue(), a1.getExchange());
	}

	@Test
	public void toStringTest() {
		String symbol = "symbol";
		ExchangeCode exchange = ExchangeCode.東証;

		RegisterSymbolWrapper o1 = new RegisterSymbolWrapper();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);

		String a1 = o1.toString();
		assertNotNull(a1);
		System.out.println(a1);
	}

}
