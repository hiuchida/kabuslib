package com.github.hiuchida.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.threeten.bp.OffsetDateTime;

import com.github.hiuchida.api.consts.CashmarginCode;
import com.github.hiuchida.api.consts.ExchangeCode;
import com.github.hiuchida.api.consts.OrdTypeCode;
import com.github.hiuchida.api.consts.RecTypeCode;
import com.github.hiuchida.api.consts.SideCode;
import com.github.hiuchida.api.consts.StateCode;
import com.github.hiuchida.api.consts.deliv.TimeInForceCode;
import com.github.hiuchida.api.consts.stock.AccountTypeCode;
import com.github.hiuchida.api.consts.stock.DelivTypeCode;
import com.github.hiuchida.api.consts.stock.MarginTradeTypeCode;

import io.swagger.client.model.OrdersSuccess;
import io.swagger.client.model.OrdersSuccessDetails;

public class OrdersSuccessWrapperTest {

	@Test
	public void newOrdersSuccessWrapperTest() {
		String ID = "ID";
		StateCode state = StateCode.待機;
		StateCode orderState = StateCode.処理済;
		OrdTypeCode ordType = OrdTypeCode.ザラバ;
		String recvTime = "2022-04-04T18:00:51.763683+09:00";
		String symbol = "symbol";
		String symbolName = "symbolName";
		ExchangeCode exchange = ExchangeCode.東証;
		String exchangeName = "exchangeName";
		TimeInForceCode timeInForce = TimeInForceCode.FAS;
		Double price = 123.4;
		Double orderQty = 12.0;
		Double cumQty = 1.0;
		SideCode side = SideCode.売;
		CashmarginCode cashMargin = CashmarginCode.新規;
		AccountTypeCode accountType = AccountTypeCode.特定;
		DelivTypeCode delivType = DelivTypeCode.お預り金;
		Integer expireDay = 20221230;
		MarginTradeTypeCode marginTradeType = MarginTradeTypeCode.制度信用;
		Double marginPremium = 1.2;

		Integer seqNum = 123;
		RecTypeCode recType = RecTypeCode.受付;
		String exchangeID = "exchangeID";
		StateCode state2 = StateCode.終了;
		String transactTime = "2022-04-04T18:00:51.763683+09:00";
		Double qty = 13.0;
		String executionID = "executionID";
		Integer delivDay = 20221210;
		Double commission = 12.3;
		Double commissionTax = 12.4;
		OffsetDateTime executionDay = OffsetDateTime.now();

		OrdersSuccess os = new OrdersSuccess();
		os.setID(ID);
		os.setState(state.intValue());
		os.setOrderState(orderState.intValue());
		os.setOrdType(ordType.intValue());
		os.setRecvTime(recvTime);
		os.setSymbol(symbol);
		os.setSymbolName(symbolName);
		os.setExchange(exchange.intValue());
		os.setExchangeName(exchangeName);
		os.setTimeInForce(timeInForce.intValue());
		os.setPrice(price);
		os.setOrderQty(orderQty);
		os.setCumQty(cumQty);
		os.setSide(side.toString());
		os.setCashMargin(cashMargin.intValue());
		os.setAccountType(accountType.intValue());
		os.setDelivType(delivType.intValue());
		os.setExpireDay(expireDay);
		os.setMarginTradeType(marginTradeType.intValue());
		os.setMarginPremium(marginPremium);

		List<OrdersSuccessDetails> details = new ArrayList<>();
		OrdersSuccessDetails osd = new OrdersSuccessDetails();
		osd.setSeqNum(seqNum);
		osd.setID(ID);
		osd.setRecType(recType.intValue());
		osd.setExchangeID(exchangeID);
		osd.setState(state2.intValue());
		osd.setTransactTime(transactTime);
		osd.setOrdType(ordType.intValue());
		osd.setPrice(price);
		osd.setQty(qty);
		osd.setExecutionID(executionID);
		osd.setExecutionDay(executionDay);
		osd.setDelivDay(delivDay);
		osd.setCommission(commission);
		osd.setCommissionTax(commissionTax);
		details.add(osd);
		os.setDetails(details);

		OrdersSuccessWrapper a1 = new OrdersSuccessWrapper(os);
		assertEquals(ID, a1.getID());
		assertEquals(state, a1.getState());
		assertEquals(orderState, a1.getOrderState());
		assertEquals(ordType, a1.getOrdType());
		assertEquals(recvTime, a1.getRecvTime());
		assertEquals(symbol, a1.getSymbol());
		assertEquals(symbolName, a1.getSymbolName());
		assertEquals(exchange, a1.getExchange());
		assertEquals(exchangeName, a1.getExchangeName());
		assertEquals(timeInForce, a1.getTimeInForce());
		assertEquals(price, a1.getPrice());
		assertEquals(orderQty, a1.getOrderQty());
		assertEquals(cumQty, a1.getCumQty());
		assertEquals(side, a1.getSide());
		assertEquals(cashMargin, a1.getCashMargin());
		assertEquals(accountType, a1.getAccountType());
		assertEquals(delivType, a1.getDelivType());
		assertEquals(expireDay, a1.getExpireDay());
		assertEquals(marginTradeType, a1.getMarginTradeType());
		assertEquals(marginPremium, a1.getMarginPremium());

		assertEquals(1, a1.getDetails().size());
		OrdersSuccessWrapper.Detail a2 = a1.getDetails().get(0);
		assertEquals(seqNum, a2.getSeqNum());
		assertEquals(ID, a2.getID());
		assertEquals(recType, a2.getRecType());
		assertEquals(exchangeID, a2.getExchangeID());
		assertEquals(state2, a2.getState());
		assertEquals(transactTime, a2.getTransactTime());
		assertEquals(ordType, a2.getOrdType());
		assertEquals(price, a2.getPrice());
		assertEquals(qty, a2.getQty());
		assertEquals(executionID, a2.getExecutionID());
		assertEquals(executionDay, a2.getExecutionDay());
		assertEquals(delivDay, a2.getDelivDay());
		assertEquals(commission, a2.getCommission());
		assertEquals(commissionTax, a2.getCommissionTax());
	}

	@Test
	public void toStringTest() {
		String ID = "ID";
		StateCode state = StateCode.待機;
		StateCode orderState = StateCode.処理済;
		OrdTypeCode ordType = OrdTypeCode.ザラバ;
		String recvTime = "2022-04-04T18:00:51.763683+09:00";
		String symbol = "symbol";
		String symbolName = "symbolName";
		ExchangeCode exchange = ExchangeCode.東証;
		String exchangeName = "exchangeName";
		TimeInForceCode timeInForce = TimeInForceCode.FAS;
		Double price = 123.4;
		Double orderQty = 12.0;
		Double cumQty = 1.0;
		SideCode side = SideCode.売;
		CashmarginCode cashMargin = CashmarginCode.新規;
		AccountTypeCode accountType = AccountTypeCode.特定;
		DelivTypeCode delivType = DelivTypeCode.お預り金;
		Integer expireDay = 20221230;
		MarginTradeTypeCode marginTradeType = MarginTradeTypeCode.制度信用;
		Double marginPremium = 1.2;

		Integer seqNum = 123;
		RecTypeCode recType = RecTypeCode.受付;
		String exchangeID = "exchangeID";
		StateCode state2 = StateCode.終了;
		String transactTime = "2022-04-04T18:00:51.763683+09:00";
		Double qty = 13.0;
		String executionID = "executionID";
		Integer delivDay = 20221210;
		Double commission = 12.3;
		Double commissionTax = 12.4;
		OffsetDateTime executionDay = OffsetDateTime.now();

		OrdersSuccess os = new OrdersSuccess();
		os.setID(ID);
		os.setState(state.intValue());
		os.setOrderState(orderState.intValue());
		os.setOrdType(ordType.intValue());
		os.setRecvTime(recvTime);
		os.setSymbol(symbol);
		os.setSymbolName(symbolName);
		os.setExchange(exchange.intValue());
		os.setExchangeName(exchangeName);
		os.setTimeInForce(timeInForce.intValue());
		os.setPrice(price);
		os.setOrderQty(orderQty);
		os.setCumQty(cumQty);
		os.setSide(side.toString());
		os.setCashMargin(cashMargin.intValue());
		os.setAccountType(accountType.intValue());
		os.setDelivType(delivType.intValue());
		os.setExpireDay(expireDay);
		os.setMarginTradeType(marginTradeType.intValue());
		os.setMarginPremium(marginPremium);

		List<OrdersSuccessDetails> details = new ArrayList<>();
		OrdersSuccessDetails osd = new OrdersSuccessDetails();
		osd.setSeqNum(seqNum);
		osd.setID(ID);
		osd.setRecType(recType.intValue());
		osd.setExchangeID(exchangeID);
		osd.setState(state2.intValue());
		osd.setTransactTime(transactTime);
		osd.setOrdType(ordType.intValue());
		osd.setPrice(price);
		osd.setQty(qty);
		osd.setExecutionID(executionID);
		osd.setExecutionDay(executionDay);
		osd.setDelivDay(delivDay);
		osd.setCommission(commission);
		osd.setCommissionTax(commissionTax);
		details.add(osd);
		os.setDetails(details);

		OrdersSuccessWrapper o1 = new OrdersSuccessWrapper(os);

		String a1 = o1.toString();
		assertNotNull(a1);
		System.out.println(a1);
	}

}
