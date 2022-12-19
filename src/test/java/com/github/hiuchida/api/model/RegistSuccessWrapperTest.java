package com.github.hiuchida.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.github.hiuchida.api.consts.ExchangeCode;

import io.swagger.client.model.RegistSuccess;
import io.swagger.client.model.RequestRegisterSymbols;

public class RegistSuccessWrapperTest {

	@Test
	public void newRegistSuccessWrapperTest() {
		String symbol = "symbol";
		ExchangeCode exchange = ExchangeCode.東証;

		RequestRegisterSymbols item1 = new RequestRegisterSymbols();
		item1.setSymbol(symbol);
		item1.setExchange(exchange.intValue());

		RegistSuccess rs = new RegistSuccess();
		rs.addRegistListItem(item1);

		RegistSuccessWrapper a1 = new RegistSuccessWrapper(rs);
		assertEquals(1, a1.getRegistList().size());
		RegisterSymbolWrapper w1 = a1.getRegistList().get(0);
		assertEquals(symbol, w1.getSymbol());
		assertEquals(exchange, w1.getExchange());
	}

	@Test
	public void toStringTest() {
		String symbol = "symbol";
		ExchangeCode exchange = ExchangeCode.東証;

		RequestRegisterSymbols item1 = new RequestRegisterSymbols();
		item1.setSymbol(symbol);
		item1.setExchange(exchange.intValue());

		RegistSuccess rs = new RegistSuccess();
		rs.addRegistListItem(item1);

		RegistSuccessWrapper o1 = new RegistSuccessWrapper(rs);

		String a1 = o1.toString();
		assertNotNull(a1);
		System.out.println(a1);
	}

}
