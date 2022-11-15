package com.github.hiuchida.api.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.client.model.PositionsDeriv;
import io.swagger.client.model.RequestSendOrderDerivFuture;
import io.swagger.client.model.RequestSendOrderDerivFutureReverseLimitOrder;

/**
 * SendoderFutureApiの引数。
 * 
 * Integer型やString型を、enum型に変更。
 * String passwordは、SendoderFutureApi側で設定するため不要。
 * 
 * @see io.swagger.client.model.RequestSendOrderDerivFuture
 * @see io.swagger.client.model.RequestSendOrderDerivFutureReverseLimitOrder
 */
public class SendOrderFutureRequestWrapper extends SendOrderDerivRequestWrapper {

	public RequestSendOrderDerivFuture toRequestSendOrderDerivFuture() {
		RequestSendOrderDerivFuture body = new RequestSendOrderDerivFuture();
		body.setSymbol(symbol);
		body.setExchange(exchange.intValue());
		body.setTradeType(tradeType.intValue());
		body.setTimeInForce(timeInForce.intValue());
		body.setSide(side.toString());
		body.setQty(qty);
		if (closePositionOrder != null) {
			body.setClosePositionOrder(closePositionOrder.intValue());
		}
		if (closePositions != null) {
			List<PositionsDeriv> pdl = new ArrayList<>();
			for (ClosePosition cp : closePositions) {
				PositionsDeriv pd = cp.toPositionsDeriv();
				pdl.add(pd);
			}
			body.setClosePositions(pdl);
		}
		body.setFrontOrderType(frontOrderType.intValue());
		body.setPrice(price);
		body.setExpireDay(expireDay);
		if (reverseLimitOrder != null) {
			RequestSendOrderDerivFutureReverseLimitOrder rlo = reverseLimitOrder.toRequestSendOrderDerivFutureReverseLimitOrder();
			body.setReverseLimitOrder(rlo);
		}
		return body;
	}

}
