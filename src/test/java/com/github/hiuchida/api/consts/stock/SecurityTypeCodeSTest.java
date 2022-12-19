package com.github.hiuchida.api.consts.stock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SecurityTypeCodeSTest {

	@Test
	public void intValueTest() {
		assertEquals(1, SecurityTypeSCode.株式.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("1", SecurityTypeSCode.株式.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(SecurityTypeSCode.株式, SecurityTypeSCode.valueOf(1));
	}

}
