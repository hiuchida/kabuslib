package com.github.hiuchida.api.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.github.hiuchida.api.consts.ExchangeCode;

import io.swagger.client.model.RegistSuccess;
import io.swagger.client.model.RequestRegisterSymbols;

public class RegistSuccessWrapperTest {

	@Test
	public void toStringTest() {
		String symbol = "symbol";
		ExchangeCode exchange = ExchangeCode.東証;

		RequestRegisterSymbols item1 = new RequestRegisterSymbols();
		item1.setSymbol(symbol);
		item1.setExchange(exchange.intValue());

		RegistSuccess o1 = new RegistSuccess();
		o1.addRegistListItem(item1);

		String a1 = o1.toString();
		assertNotNull(a1);
		System.out.println(a1);
	}

}
