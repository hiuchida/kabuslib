package com.github.hiuchida.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.github.hiuchida.api.consts.ClosePositionOrderCode;
import com.github.hiuchida.api.consts.SideCode;
import com.github.hiuchida.api.consts.UnderOverCode;
import com.github.hiuchida.api.consts.stock.AccountTypeCode;
import com.github.hiuchida.api.consts.stock.AfterHitOrderTypeSCode;
import com.github.hiuchida.api.consts.stock.CashmarginStockCode;
import com.github.hiuchida.api.consts.stock.DelivTypeCode;
import com.github.hiuchida.api.consts.stock.ExchangeSCode;
import com.github.hiuchida.api.consts.stock.FrontOrderTypeSCode;
import com.github.hiuchida.api.consts.stock.FundTypeCode;
import com.github.hiuchida.api.consts.stock.MarginTradeTypeCode;
import com.github.hiuchida.api.consts.stock.SecurityTypeCode;
import com.github.hiuchida.api.consts.stock.TriggerSecCode;
import com.github.hiuchida.api.model.SendOrderRequestWrapper.ReverseLimitOrder;

import io.swagger.client.model.RequestSendOrder;

public class SendOrderRequestWrapperTest {

	@Test
	public void toRequestSendOrderTest() {
		String symbol = "symbol";
		ExchangeSCode exchange = ExchangeSCode.東証;
		SecurityTypeCode securityType = SecurityTypeCode.株式;
		SideCode side = SideCode.買;
		CashmarginStockCode cashMargin = CashmarginStockCode.新規;
		DelivTypeCode delivType = DelivTypeCode.お預り金;
		AccountTypeCode accountType = AccountTypeCode.特定;
		FrontOrderTypeSCode frontOrderType = FrontOrderTypeSCode.指値;
		
		SendOrderRequestWrapper o1 = new SendOrderRequestWrapper();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setSecurityType(securityType);
		o1.setSide(side);
		o1.setCashMargin(cashMargin);
		o1.setDelivType(delivType);
		o1.setAccountType(accountType);
		o1.setFrontOrderType(frontOrderType);
		
		RequestSendOrder a1 = o1.toRequestSendOrder();
		assertEquals(symbol, a1.getSymbol());
		assertEquals(exchange.intValue(), a1.getExchange());
		assertEquals(securityType.intValue(), a1.getSecurityType());
		assertEquals(side.toString(), a1.getSide());
		assertEquals(cashMargin.intValue(), a1.getCashMargin());
		assertEquals(delivType.intValue(), a1.getDelivType());
		assertEquals(accountType.intValue(), a1.getAccountType());
		assertEquals(frontOrderType.intValue(), a1.getFrontOrderType());
	}

	@Test
	public void toRequestSendOrderTest2() {
		String symbol = "symbol";
		ExchangeSCode exchange = ExchangeSCode.東証;
		SecurityTypeCode securityType = SecurityTypeCode.株式;
		SideCode side = SideCode.買;
		CashmarginStockCode cashMargin = CashmarginStockCode.新規;
		MarginTradeTypeCode marginTradeType = MarginTradeTypeCode.制度信用;
		Double marginPremiumUnit = 1.2;
		DelivTypeCode delivType = DelivTypeCode.お預り金;
		FundTypeCode fundType = FundTypeCode.信用代用;
		AccountTypeCode accountType = AccountTypeCode.特定;
		Integer qty = 12;
		ClosePositionOrderCode closePositionOrder = ClosePositionOrderCode.損益_低い順_日付_古い順;
		String holdID1 = "holdID1";
		Integer qty1 = 1;
		String holdID2 = "holdID2";
		Integer qty2 = 2;
		FrontOrderTypeSCode frontOrderType = FrontOrderTypeSCode.指値;
		Double price = 12.3;
		Integer expireDay = 123;
		TriggerSecCode triggerSec = TriggerSecCode.発注銘柄;
		Double triggerPrice = 12.3;
		UnderOverCode underOver = UnderOverCode.以下;
		AfterHitOrderTypeSCode afterHitOrderType = AfterHitOrderTypeSCode.指値;
		Double afterHitPrice = 12.1;
		ReverseLimitOrder rlo = new ReverseLimitOrder(triggerSec, triggerPrice, underOver, afterHitOrderType, afterHitPrice);
		
		SendOrderRequestWrapper o1 = new SendOrderRequestWrapper();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setSecurityType(securityType);
		o1.setSide(side);
		o1.setCashMargin(cashMargin);
		o1.setMarginTradeType(marginTradeType);
		o1.setMarginPremiumUnit(marginPremiumUnit);
		o1.setDelivType(delivType);
		o1.setFundType(fundType);
		o1.setAccountType(accountType);
		o1.setQty(qty);
		o1.setClosePositionOrder(closePositionOrder);
		o1.addClosePosition(holdID1, qty1);
		o1.addClosePosition(holdID2, qty2);
		o1.setFrontOrderType(frontOrderType);
		o1.setPrice(price);
		o1.setExpireDay(expireDay);
		o1.setReverseLimitOrder(rlo);
		
		RequestSendOrder a1 = o1.toRequestSendOrder();
		assertEquals(symbol, a1.getSymbol());
		assertEquals(exchange.intValue(), a1.getExchange());
		assertEquals(securityType.intValue(), a1.getSecurityType());
		assertEquals(side.toString(), a1.getSide());
		assertEquals(cashMargin.intValue(), a1.getCashMargin());
		assertEquals(marginTradeType.intValue(), a1.getMarginTradeType());
		assertEquals(marginPremiumUnit, a1.getMarginPremiumUnit());
		assertEquals(delivType.intValue(), a1.getDelivType());
		assertEquals(fundType.toString(), a1.getFundType());
		assertEquals(accountType.intValue(), a1.getAccountType());
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
		assertEquals(triggerSec.intValue(), a1.getReverseLimitOrder().getTriggerSec());
		assertEquals(triggerPrice, a1.getReverseLimitOrder().getTriggerPrice());
		assertEquals(underOver.intValue(), a1.getReverseLimitOrder().getUnderOver());
		assertEquals(afterHitOrderType.intValue(), a1.getReverseLimitOrder().getAfterHitOrderType());
		assertEquals(afterHitPrice, a1.getReverseLimitOrder().getAfterHitPrice());
	}

	@Test
	public void toStringTest() {
		String symbol = "symbol";
		ExchangeSCode exchange = ExchangeSCode.東証;
		SecurityTypeCode securityType = SecurityTypeCode.株式;
		SideCode side = SideCode.買;
		CashmarginStockCode cashMargin = CashmarginStockCode.新規;
		DelivTypeCode delivType = DelivTypeCode.お預り金;
		AccountTypeCode accountType = AccountTypeCode.特定;
		FrontOrderTypeSCode frontOrderType = FrontOrderTypeSCode.指値;
		
		SendOrderRequestWrapper o1 = new SendOrderRequestWrapper();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setSecurityType(securityType);
		o1.setSide(side);
		o1.setCashMargin(cashMargin);
		o1.setDelivType(delivType);
		o1.setAccountType(accountType);
		o1.setFrontOrderType(frontOrderType);
		
		String a1 = o1.toString();
		assertNotNull(a1);
		System.out.println(a1);
	}

	@Test
	public void toStringTest2() {
		String symbol = "symbol";
		ExchangeSCode exchange = ExchangeSCode.東証;
		SecurityTypeCode securityType = SecurityTypeCode.株式;
		SideCode side = SideCode.買;
		CashmarginStockCode cashMargin = CashmarginStockCode.新規;
		MarginTradeTypeCode marginTradeType = MarginTradeTypeCode.制度信用;
		Double marginPremiumUnit = 1.2;
		DelivTypeCode delivType = DelivTypeCode.お預り金;
		FundTypeCode fundType = FundTypeCode.信用代用;
		AccountTypeCode accountType = AccountTypeCode.特定;
		Integer qty = 12;
		ClosePositionOrderCode closePositionOrder = ClosePositionOrderCode.損益_低い順_日付_古い順;
		String holdID1 = "holdID1";
		Integer qty1 = 1;
		String holdID2 = "holdID2";
		Integer qty2 = 2;
		FrontOrderTypeSCode frontOrderType = FrontOrderTypeSCode.指値;
		Double price = 12.3;
		Integer expireDay = 123;
		TriggerSecCode triggerSec = TriggerSecCode.発注銘柄;
		Double triggerPrice = 12.3;
		UnderOverCode underOver = UnderOverCode.以下;
		AfterHitOrderTypeSCode afterHitOrderType = AfterHitOrderTypeSCode.指値;
		Double afterHitPrice = 12.1;
		ReverseLimitOrder rlo = new ReverseLimitOrder(triggerSec, triggerPrice, underOver, afterHitOrderType, afterHitPrice);
		
		SendOrderRequestWrapper o1 = new SendOrderRequestWrapper();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setSecurityType(securityType);
		o1.setSide(side);
		o1.setCashMargin(cashMargin);
		o1.setMarginTradeType(marginTradeType);
		o1.setMarginPremiumUnit(marginPremiumUnit);
		o1.setDelivType(delivType);
		o1.setFundType(fundType);
		o1.setAccountType(accountType);
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
