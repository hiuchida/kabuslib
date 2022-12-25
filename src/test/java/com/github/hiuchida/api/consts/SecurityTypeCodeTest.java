package com.github.hiuchida.api.consts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SecurityTypeCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(0, SecurityTypeCode.指数.intValue());
		assertEquals(1, SecurityTypeCode.現物.intValue());
		assertEquals(101, SecurityTypeCode.日経225先物.intValue());
		assertEquals(103, SecurityTypeCode.日経225OP.intValue());
		assertEquals(107, SecurityTypeCode.TOPIX先物.intValue());
		assertEquals(121, SecurityTypeCode.JPX400先物.intValue());
		assertEquals(144, SecurityTypeCode.NYダウ.intValue());
		assertEquals(145, SecurityTypeCode.日経平均VI.intValue());
		assertEquals(154, SecurityTypeCode.東証マザーズ指数先物.intValue());
		assertEquals(155, SecurityTypeCode.TOPIX_REIT.intValue());
		assertEquals(171, SecurityTypeCode.TOPIX_CORE30.intValue());
		assertEquals(901, SecurityTypeCode.日経平均225ミニ先物.intValue());
		assertEquals(907, SecurityTypeCode.TOPIXミニ先物.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("0", SecurityTypeCode.指数.toString());
		assertEquals("1", SecurityTypeCode.現物.toString());
		assertEquals("101", SecurityTypeCode.日経225先物.toString());
		assertEquals("103", SecurityTypeCode.日経225OP.toString());
		assertEquals("107", SecurityTypeCode.TOPIX先物.toString());
		assertEquals("121", SecurityTypeCode.JPX400先物.toString());
		assertEquals("144", SecurityTypeCode.NYダウ.toString());
		assertEquals("145", SecurityTypeCode.日経平均VI.toString());
		assertEquals("154", SecurityTypeCode.東証マザーズ指数先物.toString());
		assertEquals("155", SecurityTypeCode.TOPIX_REIT.toString());
		assertEquals("171", SecurityTypeCode.TOPIX_CORE30.toString());
		assertEquals("901", SecurityTypeCode.日経平均225ミニ先物.toString());
		assertEquals("907", SecurityTypeCode.TOPIXミニ先物.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(null, SecurityTypeCode.valueOf((Integer) null));
		assertEquals(SecurityTypeCode.指数, SecurityTypeCode.valueOf(0));
		assertEquals(SecurityTypeCode.現物, SecurityTypeCode.valueOf(1));
		assertEquals(SecurityTypeCode.日経225先物, SecurityTypeCode.valueOf(101));
		assertEquals(SecurityTypeCode.日経225OP, SecurityTypeCode.valueOf(103));
		assertEquals(SecurityTypeCode.TOPIX先物, SecurityTypeCode.valueOf(107));
		assertEquals(SecurityTypeCode.JPX400先物, SecurityTypeCode.valueOf(121));
		assertEquals(SecurityTypeCode.NYダウ, SecurityTypeCode.valueOf(144));
		assertEquals(SecurityTypeCode.日経平均VI, SecurityTypeCode.valueOf(145));
		assertEquals(SecurityTypeCode.東証マザーズ指数先物, SecurityTypeCode.valueOf(154));
		assertEquals(SecurityTypeCode.TOPIX_REIT, SecurityTypeCode.valueOf(155));
		assertEquals(SecurityTypeCode.TOPIX_CORE30, SecurityTypeCode.valueOf(171));
		assertEquals(SecurityTypeCode.日経平均225ミニ先物, SecurityTypeCode.valueOf(901));
		assertEquals(SecurityTypeCode.TOPIXミニ先物, SecurityTypeCode.valueOf(907));
	}

}
