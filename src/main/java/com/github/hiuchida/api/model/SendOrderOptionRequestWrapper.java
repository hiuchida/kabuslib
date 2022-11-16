package com.github.hiuchida.api.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.client.model.PositionsDeriv;
import io.swagger.client.model.RequestSendOrderDerivFutureReverseLimitOrder;
import io.swagger.client.model.RequestSendOrderDerivOption;

/**
 * SendoderOptionApiの引数。
 * 
 * Integer型をenum型に変更。
 * String passwordは、SendoderOptionApi側で設定するため、不要。
 * 
 * @see io.swagger.client.model.RequestSendOrderDerivOption
 * @see io.swagger.client.model.RequestSendOrderDerivFutureReverseLimitOrder
 */
public class SendOrderOptionRequestWrapper extends SendOrderDerivRequestWrapper {

	public RequestSendOrderDerivOption toRequestSendOrderDerivOption() {
		RequestSendOrderDerivOption body = new RequestSendOrderDerivOption();
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SendOrderOptionRequestWrapper {\n");
	    
//		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
		sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
		sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
		sb.append("    side: ").append(toIndentedString(side)).append("\n");
		sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
		sb.append("    closePositionOrder: ").append(toIndentedString(closePositionOrder)).append("\n");
		sb.append("    closePositions: ").append(toIndentedString(closePositions)).append("\n");
		sb.append("    frontOrderType: ").append(toIndentedString(frontOrderType)).append("\n");
		sb.append("    price: ").append(toIndentedString(price)).append("\n");
		sb.append("    expireDay: ").append(toIndentedString(expireDay)).append("\n");
		sb.append("    reverseLimitOrder: ").append(toIndentedString(reverseLimitOrder)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
