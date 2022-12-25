package com.github.hiuchida.api.consts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SignCodeTest {

	@Test
	public void toStringTest() {
		assertEquals("0000", SignCode.事象なし.toString());
		assertEquals("0101", SignCode.一般気配.toString());
		assertEquals("0102", SignCode.特別気配.toString());
		assertEquals("0103", SignCode.注意気配.toString());
		assertEquals("0107", SignCode.寄前気配.toString());
		assertEquals("0108", SignCode.停止前特別気配.toString());
		assertEquals("0109", SignCode.引け後気配.toString());
		assertEquals("0116", SignCode.寄前気配約定成立ポイントなし.toString());
		assertEquals("0117", SignCode.寄前気配約定成立ポイントあり.toString());
		assertEquals("0118", SignCode.連続約定気配.toString());
		assertEquals("0119", SignCode.停止前の連続約定気配.toString());
		assertEquals("0120", SignCode.買い上がり売り下がり中.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(SignCode.事象なし, SignCode.valueOfCode("0000"));
		assertEquals(SignCode.一般気配, SignCode.valueOfCode("0101"));
		assertEquals(SignCode.特別気配, SignCode.valueOfCode("0102"));
		assertEquals(SignCode.注意気配, SignCode.valueOfCode("0103"));
		assertEquals(SignCode.寄前気配, SignCode.valueOfCode("0107"));
		assertEquals(SignCode.停止前特別気配, SignCode.valueOfCode("0108"));
		assertEquals(SignCode.引け後気配, SignCode.valueOfCode("0109"));
		assertEquals(SignCode.寄前気配約定成立ポイントなし, SignCode.valueOfCode("0116"));
		assertEquals(SignCode.寄前気配約定成立ポイントあり, SignCode.valueOfCode("0117"));
		assertEquals(SignCode.連続約定気配, SignCode.valueOfCode("0118"));
		assertEquals(SignCode.停止前の連続約定気配, SignCode.valueOfCode("0119"));
		assertEquals(SignCode.買い上がり売り下がり中, SignCode.valueOfCode("0120"));
	}

}
