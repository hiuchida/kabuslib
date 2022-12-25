package com.github.hiuchida.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.github.hiuchida.api.consts.ExchangeCode;
import com.github.hiuchida.api.consts.SecurityTypeCode;
import com.github.hiuchida.api.consts.SideCode;
import com.github.hiuchida.api.consts.stock.AccountTypeCode;
import com.github.hiuchida.api.consts.stock.MarginTradeTypeCode;
import com.github.hiuchida.api.consts.stock.SecurityTypeSCode;

import io.swagger.client.model.PositionsSuccess;

public class PositionsSuccessWrapperTest {

	@Test
	public void newPositionsSuccessWrapperTest() {
		String executionID = "executionID";
		AccountTypeCode accountType = AccountTypeCode.特定;
		String symbol = "symbol";
		String symbolName = "symbolName";
		ExchangeCode exchange = ExchangeCode.東証;
		String exchangeName = "exchangeName";
		SecurityTypeCode securityType = SecurityTypeCode.現物;
		Integer executionDay = 20221201;
		Double price = 123.4;
		Double leavesQty = 12.0;
		Double holdQty = 1.0;
		SideCode side = SideCode.売;
		Double expenses = 12.1;
		Double commission = 12.2;
		Double commissionTax = 12.3;
		Integer expireDay = 20221230;
		MarginTradeTypeCode marginTradeType = MarginTradeTypeCode.制度信用;
		Double currentPrice = 123.5;
		Double valuation = 123.6;
		Double profitLoss = 123.7;
		Double profitLossRate = 12.4;

		PositionsSuccess ps = new PositionsSuccess();
		ps.setExecutionID(executionID);
		ps.setAccountType(accountType.intValue());
		ps.setSymbol(symbol);
		ps.setSymbolName(symbolName);
		ps.setExchange(exchange.intValue());
		ps.setExchangeName(exchangeName);
		ps.setSecurityType(securityType.intValue());
		ps.setExecutionDay(executionDay);
		ps.setPrice(price);
		ps.setLeavesQty(leavesQty);
		ps.setHoldQty(holdQty);
		ps.setSide(side.toString());
		ps.setExpenses(expenses);
		ps.setCommission(commission);
		ps.setCommissionTax(commissionTax);
		ps.setExpireDay(expireDay);
		ps.setMarginTradeType(marginTradeType.intValue());
		ps.setCurrentPrice(currentPrice);
		ps.setValuation(valuation);
		ps.setProfitLoss(profitLoss);
		ps.setProfitLossRate(profitLossRate);

		PositionsSuccessWrapper a1 = new PositionsSuccessWrapper(ps);
		assertEquals(executionID, a1.getExecutionID());
		assertEquals(accountType, a1.getAccountType());
		assertEquals(symbol, a1.getSymbol());
		assertEquals(symbolName, a1.getSymbolName());
		assertEquals(exchange, a1.getExchange());
		assertEquals(exchangeName, a1.getExchangeName());
		assertEquals(securityType, a1.getSecurityType());
		assertEquals(executionDay, a1.getExecutionDay());
		assertEquals(price, a1.getPrice());
		assertEquals(leavesQty, a1.getLeavesQty());
		assertEquals(holdQty, a1.getHoldQty());
		assertEquals(side, a1.getSide());
		assertEquals(expenses, a1.getExpenses());
		assertEquals(commission, a1.getCommission());
		assertEquals(commissionTax, a1.getCommissionTax());
		assertEquals(expireDay, a1.getExpireDay());
		assertEquals(marginTradeType, a1.getMarginTradeType());
		assertEquals(currentPrice, a1.getCurrentPrice());
		assertEquals(valuation, a1.getValuation());
		assertEquals(profitLoss, a1.getProfitLoss());
		assertEquals(profitLossRate, a1.getProfitLossRate());
	}

	@Test
	public void toStringTest() {
		String executionID = "executionID";
		AccountTypeCode accountType = AccountTypeCode.特定;
		String symbol = "symbol";
		String symbolName = "symbolName";
		ExchangeCode exchange = ExchangeCode.東証;
		String exchangeName = "exchangeName";
		SecurityTypeSCode securityType = SecurityTypeSCode.株式;
		Integer executionDay = 20221201;
		Double price = 123.4;
		Double leavesQty = 12.0;
		Double holdQty = 1.0;
		SideCode side = SideCode.売;
		Double expenses = 12.1;
		Double commission = 12.2;
		Double commissionTax = 12.3;
		Integer expireDay = 20221230;
		MarginTradeTypeCode marginTradeType = MarginTradeTypeCode.制度信用;
		Double currentPrice = 123.5;
		Double valuation = 123.6;
		Double profitLoss = 123.7;
		Double profitLossRate = 12.4;

		PositionsSuccess ps = new PositionsSuccess();
		ps.setExecutionID(executionID);
		ps.setAccountType(accountType.intValue());
		ps.setSymbol(symbol);
		ps.setSymbolName(symbolName);
		ps.setExchange(exchange.intValue());
		ps.setExchangeName(exchangeName);
		ps.setSecurityType(securityType.intValue());
		ps.setExecutionDay(executionDay);
		ps.setPrice(price);
		ps.setLeavesQty(leavesQty);
		ps.setHoldQty(holdQty);
		ps.setSide(side.toString());
		ps.setExpenses(expenses);
		ps.setCommission(commission);
		ps.setCommissionTax(commissionTax);
		ps.setExpireDay(expireDay);
		ps.setMarginTradeType(marginTradeType.intValue());
		ps.setCurrentPrice(currentPrice);
		ps.setValuation(valuation);
		ps.setProfitLoss(profitLoss);
		ps.setProfitLossRate(profitLossRate);

		PositionsSuccessWrapper o1 = new PositionsSuccessWrapper(ps);

		String a1 = o1.toString();
		assertNotNull(a1);
		System.out.println(a1);
	}

}
