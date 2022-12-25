package com.github.hiuchida.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.threeten.bp.OffsetDateTime;

import com.github.hiuchida.api.consts.ExchangeCode;
import com.github.hiuchida.api.consts.SecurityTypeCode;
import com.github.hiuchida.api.consts.SignCode;

import io.swagger.client.model.BoardSuccess;
import io.swagger.client.model.BoardSuccessBuy1;
import io.swagger.client.model.BoardSuccessBuy10;
import io.swagger.client.model.BoardSuccessBuy2;
import io.swagger.client.model.BoardSuccessBuy3;
import io.swagger.client.model.BoardSuccessBuy4;
import io.swagger.client.model.BoardSuccessBuy5;
import io.swagger.client.model.BoardSuccessBuy6;
import io.swagger.client.model.BoardSuccessBuy7;
import io.swagger.client.model.BoardSuccessBuy8;
import io.swagger.client.model.BoardSuccessBuy9;
import io.swagger.client.model.BoardSuccessSell1;
import io.swagger.client.model.BoardSuccessSell10;
import io.swagger.client.model.BoardSuccessSell2;
import io.swagger.client.model.BoardSuccessSell3;
import io.swagger.client.model.BoardSuccessSell4;
import io.swagger.client.model.BoardSuccessSell5;
import io.swagger.client.model.BoardSuccessSell6;
import io.swagger.client.model.BoardSuccessSell7;
import io.swagger.client.model.BoardSuccessSell8;
import io.swagger.client.model.BoardSuccessSell9;

public class BoardSuccessWrapperTest {

	@Test
	public void newBoardSuccessWrapperTest() {
		String symbol = "symbol";
		String symbolName = "symbolName";
		ExchangeCode exchange = ExchangeCode.東証;
		String exchangeName = "exchangeName";
		Double currentPrice = 123.4;
		OffsetDateTime currentPriceTime = OffsetDateTime.now();
		String currentPriceChangeStatus = "currentPriceChangeStatus";
		Integer currentPriceStatus = 1;
		Double calcPrice = 123.5;
		Double previousClose = 123.3;
		OffsetDateTime previousCloseTime = OffsetDateTime.now();
		Double changePreviousClose = 12.3;
		Double changePreviousClosePer = 1.2;
		Double openingPrice = 123.5;
		OffsetDateTime openingPriceTime = OffsetDateTime.now();
		Double highPrice = 123.9;
		OffsetDateTime highPriceTime = OffsetDateTime.now();
		Double lowPrice = 123.0;
		OffsetDateTime lowPriceTime = OffsetDateTime.now();
		Double tradingVolume = 1234.5;
		OffsetDateTime tradingVolumeTime = OffsetDateTime.now();
		Double VWAP = 123.8;
		Double tradingValue = 1234500.0;
		Double bidQty = 123.0;
		Double bidPrice = 1234.9;
		OffsetDateTime bidTime = OffsetDateTime.now();
		SignCode bidSign = SignCode.一般気配;
		Double marketOrderSellQty = 1234.1;
		BoardSuccessSell1 sell1 = new BoardSuccessSell1();
		sell1.setTime(OffsetDateTime.now());
		sell1.setSign(SignCode.特別気配.toString());
		sell1.setPrice(111.0);
		sell1.setQty(11.0);
		BoardSuccessSell2 sell2 = new BoardSuccessSell2();
		sell2.setPrice(222.0);
		sell2.setQty(22.0);
		BoardSuccessSell3 sell3 = new BoardSuccessSell3();
		sell3.setPrice(333.0);
		sell3.setQty(33.0);
		BoardSuccessSell4 sell4 = new BoardSuccessSell4();
		sell4.setPrice(444.0);
		sell4.setQty(44.0);
		BoardSuccessSell5 sell5 = new BoardSuccessSell5();
		sell5.setPrice(555.0);
		sell5.setQty(55.0);
		BoardSuccessSell6 sell6 = new BoardSuccessSell6();
		sell6.setPrice(666.0);
		sell6.setQty(66.0);
		BoardSuccessSell7 sell7 = new BoardSuccessSell7();
		sell7.setPrice(777.0);
		sell7.setQty(77.0);
		BoardSuccessSell8 sell8 = new BoardSuccessSell8();
		sell8.setPrice(888.0);
		sell8.setQty(88.0);
		BoardSuccessSell9 sell9 = new BoardSuccessSell9();
		sell9.setPrice(999.0);
		sell9.setQty(99.0);
		BoardSuccessSell10 sell10 = new BoardSuccessSell10();
		sell10.setPrice(101010.0);
		sell10.setQty(1010.0);
		Double askQty = 123.9;
		Double askPrice = 1234.1;
		OffsetDateTime askTime = OffsetDateTime.now();
		SignCode askSign = SignCode.特別気配;
		Double marketOrderBuyQty = 1234.9;
		BoardSuccessBuy1 buy1 = new BoardSuccessBuy1();
		buy1.setTime(OffsetDateTime.now());
		buy1.setSign(SignCode.一般気配.toString());
		buy1.setPrice(111.1);
		buy1.setQty(11.1);
		BoardSuccessBuy2 buy2 = new BoardSuccessBuy2();
		buy2.setPrice(222.1);
		buy2.setQty(22.1);
		BoardSuccessBuy3 buy3 = new BoardSuccessBuy3();
		buy3.setPrice(333.1);
		buy3.setQty(33.1);
		BoardSuccessBuy4 buy4 = new BoardSuccessBuy4();
		buy4.setPrice(444.1);
		buy4.setQty(44.1);
		BoardSuccessBuy5 buy5 = new BoardSuccessBuy5();
		buy5.setPrice(555.1);
		buy5.setQty(55.1);
		BoardSuccessBuy6 buy6 = new BoardSuccessBuy6();
		buy6.setPrice(666.1);
		buy6.setQty(66.1);
		BoardSuccessBuy7 buy7 = new BoardSuccessBuy7();
		buy7.setPrice(777.1);
		buy7.setQty(77.1);
		BoardSuccessBuy8 buy8 = new BoardSuccessBuy8();
		buy8.setPrice(888.1);
		buy8.setQty(88.1);
		BoardSuccessBuy9 buy9 = new BoardSuccessBuy9();
		buy9.setPrice(999.1);
		buy9.setQty(99.1);
		BoardSuccessBuy10 buy10 = new BoardSuccessBuy10();
		buy10.setPrice(101010.1);
		buy10.setQty(1010.1);
		Double overSellQty = 9876.1;
		Double underBuyQty = 9876.9;
		Double totalMarketValue = 123456789.0;
		Double clearingPrice = 1234.4;
		Double IV = 20.1;
		Double gamma = 0.0001;
		Double theta = -10.5;
		Double vega = 1.25;
		Double delta = 0.5;
		SecurityTypeCode securityType = SecurityTypeCode.現物;
		
		BoardSuccess bs = new BoardSuccess();
		bs.setSymbol(symbol);
		bs.setSymbolName(symbolName);
		bs.setExchange(exchange.intValue());
		bs.setExchangeName(exchangeName);
		bs.setCurrentPrice(currentPrice);
		bs.setCurrentPriceTime(currentPriceTime);
		bs.setCurrentPriceChangeStatus(currentPriceChangeStatus);
		bs.setCurrentPriceStatus(currentPriceStatus);
		bs.setCalcPrice(calcPrice);
		bs.setPreviousClose(previousClose);
		bs.setPreviousCloseTime(previousCloseTime);
		bs.setChangePreviousClose(changePreviousClose);
		bs.setChangePreviousClosePer(changePreviousClosePer);
		bs.setOpeningPrice(openingPrice);
		bs.setOpeningPriceTime(openingPriceTime);
		bs.setHighPrice(highPrice);
		bs.setHighPriceTime(highPriceTime);
		bs.setLowPrice(lowPrice);
		bs.setLowPriceTime(lowPriceTime);
		bs.setTradingVolume(tradingVolume);
		bs.setTradingVolumeTime(tradingVolumeTime);
		bs.setVWAP(VWAP);
		bs.setTradingValue(tradingValue);
		bs.setBidQty(bidQty);
		bs.setBidPrice(bidPrice);
		bs.setBidTime(bidTime);
		bs.setBidSign(bidSign.toString());
		bs.setMarketOrderSellQty(marketOrderSellQty);
		bs.setSell1(sell1);
		bs.setSell2(sell2);
		bs.setSell3(sell3);
		bs.setSell4(sell4);
		bs.setSell5(sell5);
		bs.setSell6(sell6);
		bs.setSell7(sell7);
		bs.setSell8(sell8);
		bs.setSell9(sell9);
		bs.setSell10(sell10);
		bs.setAskQty(askQty);
		bs.setAskPrice(askPrice);
		bs.setAskTime(askTime);
		bs.setAskSign(askSign.toString());
		bs.marketOrderBuyQty(marketOrderBuyQty);
		bs.setBuy1(buy1);
		bs.setBuy2(buy2);
		bs.setBuy3(buy3);
		bs.setBuy4(buy4);
		bs.setBuy5(buy5);
		bs.setBuy6(buy6);
		bs.setBuy7(buy7);
		bs.setBuy8(buy8);
		bs.setBuy9(buy9);
		bs.setBuy10(buy10);
		bs.setOverSellQty(overSellQty);
		bs.setUnderBuyQty(underBuyQty);
		bs.setTotalMarketValue(totalMarketValue);
		bs.setClearingPrice(clearingPrice);
		bs.setIV(IV);
		bs.setGamma(gamma);
		bs.setTheta(theta);
		bs.setVega(vega);
		bs.setDelta(delta);
		bs.setSecurityType(securityType.intValue());

		BoardSuccessWrapper a1 = new BoardSuccessWrapper(bs);
		assertEquals(symbol, a1.getSymbol());
		assertEquals(symbolName, a1.getSymbolName());
		assertEquals(exchange, a1.getExchange());
		assertEquals(exchangeName, a1.getExchangeName());
		assertEquals(currentPrice, a1.getCurrentPrice());
		assertEquals(currentPriceTime, a1.getCurrentPriceTime());
		assertEquals(currentPriceChangeStatus, a1.getCurrentPriceChangeStatus());
		assertEquals(currentPriceStatus, a1.getCurrentPriceStatus());
		assertEquals(calcPrice, a1.getCalcPrice());
		assertEquals(previousClose, a1.getPreviousClose());
		assertEquals(previousCloseTime, a1.getPreviousCloseTime());
		assertEquals(changePreviousClose, a1.getChangePreviousClose());
		assertEquals(changePreviousClosePer, a1.getChangePreviousClosePer());
		assertEquals(openingPrice, a1.getOpeningPrice());
		assertEquals(openingPriceTime, a1.getOpeningPriceTime());
		assertEquals(highPrice, a1.getHighPrice());
		assertEquals(highPriceTime, a1.getHighPriceTime());
		assertEquals(lowPrice, a1.getLowPrice());
		assertEquals(lowPriceTime, a1.getLowPriceTime());
		assertEquals(tradingVolume, a1.getTradingVolume());
		assertEquals(tradingVolumeTime, a1.getTradingVolumeTime());
		assertEquals(VWAP, a1.getVWAP());
		assertEquals(tradingValue, a1.getTradingValue());
		assertEquals(bidQty, a1.getBidQty());
		assertEquals(bidPrice, a1.getBidPrice());
		assertEquals(bidTime, a1.getBidTime());
		assertEquals(bidSign, a1.getBidSign());
		assertEquals(marketOrderSellQty, a1.getMarketOrderSellQty());
		assertEquals(sell1.getTime(), a1.getSell1().getTime());
		assertEquals(SignCode.特別気配, a1.getSell1().getSign());
		assertEquals(sell1.getPrice(), a1.getSell1().getPrice());
		assertEquals(sell1.getQty(), a1.getSell1().getQty());
		assertEquals(sell2.getPrice(), a1.getSell2().getPrice());
		assertEquals(sell2.getQty(), a1.getSell2().getQty());
		assertEquals(sell3.getPrice(), a1.getSell3().getPrice());
		assertEquals(sell3.getQty(), a1.getSell3().getQty());
		assertEquals(sell4.getPrice(), a1.getSell4().getPrice());
		assertEquals(sell4.getQty(), a1.getSell4().getQty());
		assertEquals(sell5.getPrice(), a1.getSell5().getPrice());
		assertEquals(sell5.getQty(), a1.getSell5().getQty());
		assertEquals(sell6.getPrice(), a1.getSell6().getPrice());
		assertEquals(sell6.getQty(), a1.getSell6().getQty());
		assertEquals(sell7.getPrice(), a1.getSell7().getPrice());
		assertEquals(sell7.getQty(), a1.getSell7().getQty());
		assertEquals(sell8.getPrice(), a1.getSell8().getPrice());
		assertEquals(sell8.getQty(), a1.getSell8().getQty());
		assertEquals(sell9.getPrice(), a1.getSell9().getPrice());
		assertEquals(sell9.getQty(), a1.getSell9().getQty());
		assertEquals(sell10.getPrice(), a1.getSell10().getPrice());
		assertEquals(sell10.getQty(), a1.getSell10().getQty());
		assertEquals(askQty, a1.getAskQty());
		assertEquals(askPrice, a1.getAskPrice());
		assertEquals(askTime, a1.getAskTime());
		assertEquals(askSign, a1.getAskSign());
		assertEquals(marketOrderBuyQty, a1.getMarketOrderBuyQty());
		assertEquals(buy1.getTime(), a1.getBuy1().getTime());
		assertEquals(SignCode.一般気配, a1.getBuy1().getSign());
		assertEquals(buy1.getPrice(), a1.getBuy1().getPrice());
		assertEquals(buy1.getQty(), a1.getBuy1().getQty());
		assertEquals(buy2.getPrice(), a1.getBuy2().getPrice());
		assertEquals(buy2.getQty(), a1.getBuy2().getQty());
		assertEquals(buy3.getPrice(), a1.getBuy3().getPrice());
		assertEquals(buy3.getQty(), a1.getBuy3().getQty());
		assertEquals(buy4.getPrice(), a1.getBuy4().getPrice());
		assertEquals(buy4.getQty(), a1.getBuy4().getQty());
		assertEquals(buy5.getPrice(), a1.getBuy5().getPrice());
		assertEquals(buy5.getQty(), a1.getBuy5().getQty());
		assertEquals(buy6.getPrice(), a1.getBuy6().getPrice());
		assertEquals(buy6.getQty(), a1.getBuy6().getQty());
		assertEquals(buy7.getPrice(), a1.getBuy7().getPrice());
		assertEquals(buy7.getQty(), a1.getBuy7().getQty());
		assertEquals(buy8.getPrice(), a1.getBuy8().getPrice());
		assertEquals(buy8.getQty(), a1.getBuy8().getQty());
		assertEquals(buy9.getPrice(), a1.getBuy9().getPrice());
		assertEquals(buy9.getQty(), a1.getBuy9().getQty());
		assertEquals(buy10.getPrice(), a1.getBuy10().getPrice());
		assertEquals(buy10.getQty(), a1.getBuy10().getQty());
		assertEquals(overSellQty, a1.getOverSellQty());
		assertEquals(underBuyQty, a1.getUnderBuyQty());
		assertEquals(totalMarketValue, a1.getTotalMarketValue());
		assertEquals(clearingPrice, a1.getClearingPrice());
		assertEquals(IV, a1.getIV());
		assertEquals(gamma, a1.getGamma());
		assertEquals(theta, a1.getTheta());
		assertEquals(vega, a1.getVega());
		assertEquals(delta, a1.getDelta());
		assertEquals(securityType, a1.getSecurityType());
	}

	@Test
	public void toStringTest() {
		String symbol = "symbol";
		String symbolName = "symbolName";
		ExchangeCode exchange = ExchangeCode.東証;
		String exchangeName = "exchangeName";
		Double currentPrice = 123.4;
		OffsetDateTime currentPriceTime = OffsetDateTime.now();
		String currentPriceChangeStatus = "currentPriceChangeStatus";
		Integer currentPriceStatus = 1;
		Double calcPrice = 123.5;
		Double previousClose = 123.3;
		OffsetDateTime previousCloseTime = OffsetDateTime.now();
		Double changePreviousClose = 12.3;
		Double changePreviousClosePer = 1.2;
		Double openingPrice = 123.5;
		OffsetDateTime openingPriceTime = OffsetDateTime.now();
		Double highPrice = 123.9;
		OffsetDateTime highPriceTime = OffsetDateTime.now();
		Double lowPrice = 123.0;
		OffsetDateTime lowPriceTime = OffsetDateTime.now();
		Double tradingVolume = 1234.5;
		OffsetDateTime tradingVolumeTime = OffsetDateTime.now();
		Double VWAP = 123.8;
		Double tradingValue = 1234500.0;
		Double bidQty = 123.0;
		Double bidPrice = 1234.9;
		OffsetDateTime bidTime = OffsetDateTime.now();
		SignCode bidSign = SignCode.一般気配;
		Double marketOrderSellQty = 1234.1;
		BoardSuccessSell1 sell1 = new BoardSuccessSell1();
		sell1.setTime(OffsetDateTime.now());
		sell1.setSign(SignCode.特別気配.toString());
		sell1.setPrice(111.0);
		sell1.setQty(11.0);
		BoardSuccessSell2 sell2 = new BoardSuccessSell2();
		sell2.setPrice(222.0);
		sell2.setQty(22.0);
		BoardSuccessSell3 sell3 = new BoardSuccessSell3();
		sell3.setPrice(333.0);
		sell3.setQty(33.0);
		BoardSuccessSell4 sell4 = new BoardSuccessSell4();
		sell4.setPrice(444.0);
		sell4.setQty(44.0);
		BoardSuccessSell5 sell5 = new BoardSuccessSell5();
		sell5.setPrice(555.0);
		sell5.setQty(55.0);
		BoardSuccessSell6 sell6 = new BoardSuccessSell6();
		sell6.setPrice(666.0);
		sell6.setQty(66.0);
		BoardSuccessSell7 sell7 = new BoardSuccessSell7();
		sell7.setPrice(777.0);
		sell7.setQty(77.0);
		BoardSuccessSell8 sell8 = new BoardSuccessSell8();
		sell8.setPrice(888.0);
		sell8.setQty(88.0);
		BoardSuccessSell9 sell9 = new BoardSuccessSell9();
		sell9.setPrice(999.0);
		sell9.setQty(99.0);
		BoardSuccessSell10 sell10 = new BoardSuccessSell10();
		sell10.setPrice(101010.0);
		sell10.setQty(1010.0);
		Double askQty = 123.9;
		Double askPrice = 1234.1;
		OffsetDateTime askTime = OffsetDateTime.now();
		SignCode askSign = SignCode.特別気配;
		Double marketOrderBuyQty = 1234.9;
		BoardSuccessBuy1 buy1 = new BoardSuccessBuy1();
		buy1.setTime(OffsetDateTime.now());
		buy1.setSign(SignCode.一般気配.toString());
		buy1.setPrice(111.1);
		buy1.setQty(11.1);
		BoardSuccessBuy2 buy2 = new BoardSuccessBuy2();
		buy2.setPrice(222.1);
		buy2.setQty(22.1);
		BoardSuccessBuy3 buy3 = new BoardSuccessBuy3();
		buy3.setPrice(333.1);
		buy3.setQty(33.1);
		BoardSuccessBuy4 buy4 = new BoardSuccessBuy4();
		buy4.setPrice(444.1);
		buy4.setQty(44.1);
		BoardSuccessBuy5 buy5 = new BoardSuccessBuy5();
		buy5.setPrice(555.1);
		buy5.setQty(55.1);
		BoardSuccessBuy6 buy6 = new BoardSuccessBuy6();
		buy6.setPrice(666.1);
		buy6.setQty(66.1);
		BoardSuccessBuy7 buy7 = new BoardSuccessBuy7();
		buy7.setPrice(777.1);
		buy7.setQty(77.1);
		BoardSuccessBuy8 buy8 = new BoardSuccessBuy8();
		buy8.setPrice(888.1);
		buy8.setQty(88.1);
		BoardSuccessBuy9 buy9 = new BoardSuccessBuy9();
		buy9.setPrice(999.1);
		buy9.setQty(99.1);
		BoardSuccessBuy10 buy10 = new BoardSuccessBuy10();
		buy10.setPrice(101010.1);
		buy10.setQty(1010.1);
		Double overSellQty = 9876.1;
		Double underBuyQty = 9876.9;
		Double totalMarketValue = 123456789.0;
		Double clearingPrice = 1234.4;
		Double IV = 20.1;
		Double gamma = 0.0001;
		Double theta = -10.5;
		Double vega = 1.25;
		Double delta = 0.5;
		SecurityTypeCode securityType = SecurityTypeCode.現物;
		
		BoardSuccess bs = new BoardSuccess();
		bs.setSymbol(symbol);
		bs.setSymbolName(symbolName);
		bs.setExchange(exchange.intValue());
		bs.setExchangeName(exchangeName);
		bs.setCurrentPrice(currentPrice);
		bs.setCurrentPriceTime(currentPriceTime);
		bs.setCurrentPriceChangeStatus(currentPriceChangeStatus);
		bs.setCurrentPriceStatus(currentPriceStatus);
		bs.setCalcPrice(calcPrice);
		bs.setPreviousClose(previousClose);
		bs.setPreviousCloseTime(previousCloseTime);
		bs.setChangePreviousClose(changePreviousClose);
		bs.setChangePreviousClosePer(changePreviousClosePer);
		bs.setOpeningPrice(openingPrice);
		bs.setOpeningPriceTime(openingPriceTime);
		bs.setHighPrice(highPrice);
		bs.setHighPriceTime(highPriceTime);
		bs.setLowPrice(lowPrice);
		bs.setLowPriceTime(lowPriceTime);
		bs.setTradingVolume(tradingVolume);
		bs.setTradingVolumeTime(tradingVolumeTime);
		bs.setVWAP(VWAP);
		bs.setTradingValue(tradingValue);
		bs.setBidQty(bidQty);
		bs.setBidPrice(bidPrice);
		bs.setBidTime(bidTime);
		bs.setBidSign(bidSign.toString());
		bs.setMarketOrderSellQty(marketOrderSellQty);
		bs.setSell1(sell1);
		bs.setSell2(sell2);
		bs.setSell3(sell3);
		bs.setSell4(sell4);
		bs.setSell5(sell5);
		bs.setSell6(sell6);
		bs.setSell7(sell7);
		bs.setSell8(sell8);
		bs.setSell9(sell9);
		bs.setSell10(sell10);
		bs.setAskQty(askQty);
		bs.setAskPrice(askPrice);
		bs.setAskTime(askTime);
		bs.setAskSign(askSign.toString());
		bs.marketOrderBuyQty(marketOrderBuyQty);
		bs.setBuy1(buy1);
		bs.setBuy2(buy2);
		bs.setBuy3(buy3);
		bs.setBuy4(buy4);
		bs.setBuy5(buy5);
		bs.setBuy6(buy6);
		bs.setBuy7(buy7);
		bs.setBuy8(buy8);
		bs.setBuy9(buy9);
		bs.setBuy10(buy10);
		bs.setOverSellQty(overSellQty);
		bs.setUnderBuyQty(underBuyQty);
		bs.setTotalMarketValue(totalMarketValue);
		bs.setClearingPrice(clearingPrice);
		bs.setIV(IV);
		bs.setGamma(gamma);
		bs.setTheta(theta);
		bs.setVega(vega);
		bs.setDelta(delta);
		bs.setSecurityType(securityType.intValue());

		BoardSuccessWrapper o1 = new BoardSuccessWrapper(bs);

		String a1 = o1.toString();
		assertNotNull(a1);
		System.out.println(a1);
	}

}