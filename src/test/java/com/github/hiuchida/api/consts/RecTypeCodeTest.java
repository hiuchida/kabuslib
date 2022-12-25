package com.github.hiuchida.api.consts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RecTypeCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(1, RecTypeCode.受付.intValue());
		assertEquals(2, RecTypeCode.繰越.intValue());
		assertEquals(3, RecTypeCode.期限切れ.intValue());
		assertEquals(4, RecTypeCode.発注.intValue());
		assertEquals(5, RecTypeCode.訂正.intValue());
		assertEquals(6, RecTypeCode.取消.intValue());
		assertEquals(7, RecTypeCode.失効.intValue());
		assertEquals(8, RecTypeCode.約定.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("1", RecTypeCode.受付.toString());
		assertEquals("2", RecTypeCode.繰越.toString());
		assertEquals("3", RecTypeCode.期限切れ.toString());
		assertEquals("4", RecTypeCode.発注.toString());
		assertEquals("5", RecTypeCode.訂正.toString());
		assertEquals("6", RecTypeCode.取消.toString());
		assertEquals("7", RecTypeCode.失効.toString());
		assertEquals("8", RecTypeCode.約定.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(null, RecTypeCode.valueOf((Integer) null));
		assertEquals(RecTypeCode.受付, RecTypeCode.valueOf(1));
		assertEquals(RecTypeCode.繰越, RecTypeCode.valueOf(2));
		assertEquals(RecTypeCode.期限切れ, RecTypeCode.valueOf(3));
		assertEquals(RecTypeCode.発注, RecTypeCode.valueOf(4));
		assertEquals(RecTypeCode.訂正, RecTypeCode.valueOf(5));
		assertEquals(RecTypeCode.取消, RecTypeCode.valueOf(6));
		assertEquals(RecTypeCode.失効, RecTypeCode.valueOf(7));
		assertEquals(RecTypeCode.約定, RecTypeCode.valueOf(8));
	}

}
