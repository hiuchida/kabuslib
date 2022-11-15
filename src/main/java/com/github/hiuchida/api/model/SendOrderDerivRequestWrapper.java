package com.github.hiuchida.api.model;

import java.util.List;

import com.github.hiuchida.api.consts.ClosePositionOrderCode;
import com.github.hiuchida.api.consts.SideCode;
import com.github.hiuchida.api.consts.UnderOverCode;
import com.github.hiuchida.api.consts.deliv.AfterHitOrderTypeDCode;
import com.github.hiuchida.api.consts.deliv.ExchangeDCode;
import com.github.hiuchida.api.consts.deliv.FrontOrderTypeDCode;
import com.github.hiuchida.api.consts.deliv.TimeInForceCode;
import com.github.hiuchida.api.consts.deliv.TradeTypeCode;

import io.swagger.client.model.RequestSendOrderDerivFutureReverseLimitOrder;

/**
 * SendoderFutureApi,SendoderOptionApi共通の引数。
 * 
 * Integer型やString型を、enum型に変更。
 * String passwordは、SendoderFutureApi側で設定するため不要。
 * 
 * @see io.swagger.client.model.RequestSendOrderDerivFuture
 * @see io.swagger.client.model.RequestSendOrderDerivFutureReverseLimitOrder
 * @see io.swagger.client.model.RequestSendOrderDerivOption
 */
public class SendOrderDerivRequestWrapper extends SendOrderCommonRequestWrapper {

	public static class ReverseLimitOrder {
		private Double triggerPrice = null;

		private UnderOverCode underOver = null;

		private AfterHitOrderTypeDCode afterHitOrderType = null;

		private Double afterHitPrice = null;

		public ReverseLimitOrder(Double triggerPrice, UnderOverCode underOver, AfterHitOrderTypeDCode afterHitOrderType, Double afterHitPrice) {
			this.triggerPrice = triggerPrice;
			this.underOver = underOver;
			this.afterHitOrderType = afterHitOrderType;
			this.afterHitPrice = afterHitPrice;
		}

		public Double getTriggerPrice() {
			return triggerPrice;
		}

		public void setTriggerPrice(Double triggerPrice) {
			this.triggerPrice = triggerPrice;
		}

		public UnderOverCode getUnderOver() {
			return underOver;
		}

		public void setUnderOver(UnderOverCode underOver) {
			this.underOver = underOver;
		}

		public AfterHitOrderTypeDCode getAfterHitOrderType() {
			return afterHitOrderType;
		}

		public void setAfterHitOrderType(AfterHitOrderTypeDCode afterHitOrderType) {
			this.afterHitOrderType = afterHitOrderType;
		}

		public Double getAfterHitPrice() {
			return afterHitPrice;
		}

		public void setAfterHitPrice(Double afterHitPrice) {
			this.afterHitPrice = afterHitPrice;
		}

		public RequestSendOrderDerivFutureReverseLimitOrder toRequestSendOrderDerivFutureReverseLimitOrder() {
			RequestSendOrderDerivFutureReverseLimitOrder rlo = new RequestSendOrderDerivFutureReverseLimitOrder();
			rlo.setTriggerPrice(triggerPrice);
			rlo.setUnderOver(underOver.intValue());
			rlo.setAfterHitOrderType(afterHitOrderType.intValue());
			rlo.setAfterHitPrice(afterHitPrice);
			return rlo;
		}

	}


//	protected String password = null;

	protected String symbol = null;

	protected ExchangeDCode exchange = null;

	protected TradeTypeCode tradeType = null;

	protected TimeInForceCode timeInForce = null;

	protected SideCode side = null;

	protected Integer qty = null;

	protected ClosePositionOrderCode closePositionOrder = null;

	protected List<ClosePosition> closePositions = null;

	protected FrontOrderTypeDCode frontOrderType = null;

	protected Double price = null;

	protected Integer expireDay = null;

	protected ReverseLimitOrder reverseLimitOrder = null;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public ExchangeDCode getExchange() {
		return exchange;
	}

	public void setExchange(ExchangeDCode exchange) {
		this.exchange = exchange;
	}

	public TradeTypeCode getTradeType() {
		return tradeType;
	}

	public void setTradeType(TradeTypeCode tradeType) {
		this.tradeType = tradeType;
	}

	public TimeInForceCode getTimeInForce() {
		return timeInForce;
	}

	public void setTimeInForce(TimeInForceCode timeInForce) {
		this.timeInForce = timeInForce;
	}

	public SideCode getSide() {
		return side;
	}

	public void setSide(SideCode side) {
		this.side = side;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public ClosePositionOrderCode getClosePositionOrder() {
		return closePositionOrder;
	}

	public void setClosePositionOrder(ClosePositionOrderCode closePositionOrder) {
		this.closePositionOrder = closePositionOrder;
	}

	public List<ClosePosition> getClosePositions() {
		return closePositions;
	}

	public void setClosePositions(List<ClosePosition> closePositions) {
		this.closePositions = closePositions;
	}

	public FrontOrderTypeDCode getFrontOrderType() {
		return frontOrderType;
	}

	public void setFrontOrderType(FrontOrderTypeDCode frontOrderType) {
		this.frontOrderType = frontOrderType;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getExpireDay() {
		return expireDay;
	}

	public void setExpireDay(Integer expireDay) {
		this.expireDay = expireDay;
	}

	public ReverseLimitOrder getReverseLimitOrder() {
		return reverseLimitOrder;
	}

	public void setReverseLimitOrder(ReverseLimitOrder reverseLimitOrder) {
		this.reverseLimitOrder = reverseLimitOrder;
	}

}
