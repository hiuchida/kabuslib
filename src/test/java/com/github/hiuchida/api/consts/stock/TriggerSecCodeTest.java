package com.github.hiuchida.api.consts.stock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriggerSecCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(1, TriggerSecCode.発注銘柄.intValue());
		assertEquals(2, TriggerSecCode.NK225指数.intValue());
		assertEquals(3, TriggerSecCode.TOPIX指数.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("1", TriggerSecCode.発注銘柄.toString());
		assertEquals("2", TriggerSecCode.NK225指数.toString());
		assertEquals("3", TriggerSecCode.TOPIX指数.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(TriggerSecCode.発注銘柄, TriggerSecCode.valueOf(1));
		assertEquals(TriggerSecCode.NK225指数, TriggerSecCode.valueOf(2));
		assertEquals(TriggerSecCode.TOPIX指数, TriggerSecCode.valueOf(3));
	}

}
