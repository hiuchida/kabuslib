package com.github.hiuchida.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.github.hiuchida.api.consts.ClosePositionOrderCode;
import com.github.hiuchida.api.consts.SideCode;
import com.github.hiuchida.api.consts.UnderOverCode;
import com.github.hiuchida.api.consts.deliv.AfterHitOrderTypeDCode;
import com.github.hiuchida.api.consts.deliv.ExchangeDCode;
import com.github.hiuchida.api.consts.deliv.FrontOrderTypeDCode;
import com.github.hiuchida.api.consts.deliv.TimeInForceCode;
import com.github.hiuchida.api.consts.deliv.TradeTypeCode;
import com.github.hiuchida.api.model.SendOrderDerivRequestWrapper.ReverseLimitOrder;

import io.swagger.client.model.RequestSendOrderDerivOption;

public class SendOrderOptionRequestWrapperTest {

	@Test
	public void toRequestSendOrderDerivOptionTest() {
		String symbol = "symbol";
		ExchangeDCode exchange = ExchangeDCode.日中;
		TradeTypeCode tradeType = TradeTypeCode.新規;
		TimeInForceCode timeInForce = TimeInForceCode.FAS;
		SideCode side = SideCode.買;
		FrontOrderTypeDCode frontOrderType = FrontOrderTypeDCode.指値;
		
		SendOrderOptionRequestWrapper o1 = new SendOrderOptionRequestWrapper();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setTradeType(tradeType);
		o1.setTimeInForce(timeInForce);
		o1.setSide(side);
		o1.setFrontOrderType(frontOrderType);
		
		RequestSendOrderDerivOption a1 = o1.toRequestSendOrderDerivOption();
		assertEquals(symbol, a1.getSymbol());
		assertEquals(exchange.intValue(), a1.getExchange());
		assertEquals(tradeType.intValue(), a1.getTradeType());
		assertEquals(timeInForce.intValue(), a1.getTimeInForce());
		assertEquals(side.toString(), a1.getSide());
		assertEquals(frontOrderType.intValue(), a1.getFrontOrderType());
	}

	@Test
	public void toRequestSendOrderDerivOptionTest2() {
		String symbol = "symbol";
		ExchangeDCode exchange = ExchangeDCode.日中;
		TradeTypeCode tradeType = TradeTypeCode.新規;
		TimeInForceCode timeInForce = TimeInForceCode.FAS;
		SideCode side = SideCode.買;
		Integer qty = 12;
		ClosePositionOrderCode closePositionOrder = ClosePositionOrderCode.損益_低い順_日付_古い順;
		String holdID1 = "holdID1";
		Integer qty1 = 1;
		String holdID2 = "holdID2";
		Integer qty2 = 2;
		FrontOrderTypeDCode frontOrderType = FrontOrderTypeDCode.指値;
		Double price = 12.3;
		Integer expireDay = 123;
		Double triggerPrice = 12.3;
		UnderOverCode underOver = UnderOverCode.以下;
		AfterHitOrderTypeDCode afterHitOrderType = AfterHitOrderTypeDCode.指値;
		Double afterHitPrice = 12.1;
		ReverseLimitOrder rlo = new ReverseLimitOrder(triggerPrice, underOver, afterHitOrderType, afterHitPrice);
		
		SendOrderOptionRequestWrapper o1 = new SendOrderOptionRequestWrapper();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setTradeType(tradeType);
		o1.setTimeInForce(timeInForce);
		o1.setSide(side);
		o1.setQty(qty);
		o1.setClosePositionOrder(closePositionOrder);
		o1.addClosePosition(holdID1, qty1);
		o1.addClosePosition(holdID2, qty2);
		o1.setFrontOrderType(frontOrderType);
		o1.setPrice(price);
		o1.setExpireDay(expireDay);
		o1.setReverseLimitOrder(rlo);
		
		RequestSendOrderDerivOption a1 = o1.toRequestSendOrderDerivOption();
		assertEquals(symbol, a1.getSymbol());
		assertEquals(exchange.intValue(), a1.getExchange());
		assertEquals(tradeType.intValue(), a1.getTradeType());
		assertEquals(timeInForce.intValue(), a1.getTimeInForce());
		assertEquals(side.toString(), a1.getSide());
		assertEquals(qty, a1.getQty());
		assertEquals(closePositionOrder.intValue(), a1.getClosePositionOrder());
		assertEquals(2, a1.getClosePositions().size());
		assertEquals(holdID1, a1.getClosePositions().get(0).getHoldID());
		assertEquals(qty1, a1.getClosePositions().get(0).getQty());
		assertEquals(holdID2, a1.getClosePositions().get(1).getHoldID());
		assertEquals(qty2, a1.getClosePositions().get(1).getQty());
		assertEquals(frontOrderType.intValue(), a1.getFrontOrderType());
		assertEquals(price, a1.getPrice());
		assertEquals(expireDay, a1.getExpireDay());
		assertEquals(triggerPrice, a1.getReverseLimitOrder().getTriggerPrice());
		assertEquals(underOver.intValue(), a1.getReverseLimitOrder().getUnderOver());
		assertEquals(afterHitOrderType.intValue(), a1.getReverseLimitOrder().getAfterHitOrderType());
		assertEquals(afterHitPrice, a1.getReverseLimitOrder().getAfterHitPrice());
	}

	@Test
	public void toStringTest() {
		String symbol = "symbol";
		ExchangeDCode exchange = ExchangeDCode.日中;
		TradeTypeCode tradeType = TradeTypeCode.新規;
		TimeInForceCode timeInForce = TimeInForceCode.FAS;
		SideCode side = SideCode.買;
		FrontOrderTypeDCode frontOrderType = FrontOrderTypeDCode.指値;
		
		SendOrderOptionRequestWrapper o1 = new SendOrderOptionRequestWrapper();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setTradeType(tradeType);
		o1.setTimeInForce(timeInForce);
		o1.setSide(side);
		o1.setFrontOrderType(frontOrderType);
		
		String a1 = o1.toString();
		assertNotNull(a1);
		System.out.println(a1);
	}

	@Test
	public void toStringTest2() {
		String symbol = "symbol";
		ExchangeDCode exchange = ExchangeDCode.日中;
		TradeTypeCode tradeType = TradeTypeCode.新規;
		TimeInForceCode timeInForce = TimeInForceCode.FAS;
		SideCode side = SideCode.買;
		Integer qty = 12;
		ClosePositionOrderCode closePositionOrder = ClosePositionOrderCode.損益_低い順_日付_古い順;
		String holdID1 = "holdID1";
		Integer qty1 = 1;
		String holdID2 = "holdID2";
		Integer qty2 = 2;
		FrontOrderTypeDCode frontOrderType = FrontOrderTypeDCode.指値;
		Double price = 12.3;
		Integer expireDay = 123;
		Double triggerPrice = 12.3;
		UnderOverCode underOver = UnderOverCode.以下;
		AfterHitOrderTypeDCode afterHitOrderType = AfterHitOrderTypeDCode.指値;
		Double afterHitPrice = 12.1;
		ReverseLimitOrder rlo = new ReverseLimitOrder(triggerPrice, underOver, afterHitOrderType, afterHitPrice);
		
		SendOrderOptionRequestWrapper o1 = new SendOrderOptionRequestWrapper();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setTradeType(tradeType);
		o1.setTimeInForce(timeInForce);
		o1.setSide(side);
		o1.setQty(qty);
		o1.setClosePositionOrder(closePositionOrder);
		o1.addClosePosition(holdID1, qty1);
		o1.addClosePosition(holdID2, qty2);
		o1.setFrontOrderType(frontOrderType);
		o1.setPrice(price);
		o1.setExpireDay(expireDay);
		o1.setReverseLimitOrder(rlo);
		
		String a1 = o1.toString();
		assertNotNull(a1);
		System.out.println(a1);
	}

}
