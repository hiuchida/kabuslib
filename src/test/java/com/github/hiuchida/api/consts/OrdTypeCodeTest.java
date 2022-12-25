package com.github.hiuchida.api.consts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrdTypeCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(0, OrdTypeCode.ZERO.intValue());
		assertEquals(1, OrdTypeCode.ザラバ.intValue());
		assertEquals(2, OrdTypeCode.寄り.intValue());
		assertEquals(3, OrdTypeCode.引け.intValue());
		assertEquals(4, OrdTypeCode.不成.intValue());
		assertEquals(5, OrdTypeCode.対当指値.intValue());
		assertEquals(6, OrdTypeCode.IOC.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("0", OrdTypeCode.ZERO.toString());
		assertEquals("1", OrdTypeCode.ザラバ.toString());
		assertEquals("2", OrdTypeCode.寄り.toString());
		assertEquals("3", OrdTypeCode.引け.toString());
		assertEquals("4", OrdTypeCode.不成.toString());
		assertEquals("5", OrdTypeCode.対当指値.toString());
		assertEquals("6", OrdTypeCode.IOC.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(OrdTypeCode.ZERO, OrdTypeCode.valueOf(0));
		assertEquals(OrdTypeCode.ザラバ, OrdTypeCode.valueOf(1));
		assertEquals(OrdTypeCode.寄り, OrdTypeCode.valueOf(2));
		assertEquals(OrdTypeCode.引け, OrdTypeCode.valueOf(3));
		assertEquals(OrdTypeCode.不成, OrdTypeCode.valueOf(4));
		assertEquals(OrdTypeCode.対当指値, OrdTypeCode.valueOf(5));
		assertEquals(OrdTypeCode.IOC, OrdTypeCode.valueOf(6));
	}

}
