package com.github.hiuchida.api.model;

import java.util.ArrayList;
import java.util.List;

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

import io.swagger.client.model.Positions;
import io.swagger.client.model.RequestSendOrder;
import io.swagger.client.model.RequestSendOrderReverseLimitOrder;

/**
 * SendoderApiの引数。
 * 
 * Integer型やString型を、enum型に変更。
 * String passwordは、SendoderFutureApi側で設定するため不要。
 * 
 * @see io.swagger.client.model.RequestSendOrder
 * @see io.swagger.client.model.RequestSendOrderReverseLimitOrder
 */
public class SendOrderRequestWrapper extends SendOrderCommonRequestWrapper {

	public static class ReverseLimitOrder {
		private TriggerSecCode triggerSec = null;

		private Double triggerPrice = null;

		private UnderOverCode underOver = null;

		private AfterHitOrderTypeSCode afterHitOrderType = null;

		private Double afterHitPrice = null;

		public ReverseLimitOrder(TriggerSecCode triggerSec, Double triggerPrice, UnderOverCode underOver, AfterHitOrderTypeSCode afterHitOrderType, Double afterHitPrice) {
			this.triggerSec = triggerSec;
			this.triggerPrice = triggerPrice;
			this.underOver = underOver;
			this.afterHitOrderType = afterHitOrderType;
			this.afterHitPrice = afterHitPrice;
		}

		public TriggerSecCode getTriggerSec() {
			return triggerSec;
		}

		public void setTriggerSec(TriggerSecCode triggerSec) {
			this.triggerSec = triggerSec;
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

		public AfterHitOrderTypeSCode getAfterHitOrderType() {
			return afterHitOrderType;
		}

		public void setAfterHitOrderType(AfterHitOrderTypeSCode afterHitOrderType) {
			this.afterHitOrderType = afterHitOrderType;
		}

		public Double getAfterHitPrice() {
			return afterHitPrice;
		}

		public void setAfterHitPrice(Double afterHitPrice) {
			this.afterHitPrice = afterHitPrice;
		}

		public RequestSendOrderReverseLimitOrder toRequestSendOrderReverseLimitOrder() {
			RequestSendOrderReverseLimitOrder rlo = new RequestSendOrderReverseLimitOrder();
			rlo.setTriggerSec(triggerSec.intValue());
			rlo.setTriggerPrice(triggerPrice);
			rlo.setUnderOver(underOver.intValue());
			rlo.setAfterHitOrderType(afterHitOrderType.intValue());
			rlo.setAfterHitPrice(afterHitPrice);
			return rlo;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("class ReverseLimitOrder {\n");
			
			sb.append("    triggerSec: ").append(toIndentedString(triggerSec)).append("\n");
			sb.append("    triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
			sb.append("    underOver: ").append(toIndentedString(underOver)).append("\n");
			sb.append("    afterHitOrderType: ").append(toIndentedString(afterHitOrderType)).append("\n");
			sb.append("    afterHitPrice: ").append(toIndentedString(afterHitPrice)).append("\n");
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

//	  private String password = null;

	private String symbol = null;

	private ExchangeSCode exchange = null;

	private SecurityTypeCode securityType = null;

	private SideCode side = null;

	private CashmarginStockCode cashMargin = null;

	private MarginTradeTypeCode marginTradeType = null;

	private Double marginPremiumUnit = null;

	private DelivTypeCode delivType = null;

	private FundTypeCode fundType = null;

	private AccountTypeCode accountType = null;

	private Integer qty = null;

	private ClosePositionOrderCode closePositionOrder = null;

	private List<ClosePosition> closePositions = null;

	private FrontOrderTypeSCode frontOrderType = null;

	private Double price = null;

	private Integer expireDay = null;

	private ReverseLimitOrder reverseLimitOrder = null;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public ExchangeSCode getExchange() {
		return exchange;
	}

	public void setExchange(ExchangeSCode exchange) {
		this.exchange = exchange;
	}

	public SecurityTypeCode getSecurityType() {
		return securityType;
	}

	public void setSecurityType(SecurityTypeCode securityType) {
		this.securityType = securityType;
	}

	public SideCode getSide() {
		return side;
	}

	public void setSide(SideCode side) {
		this.side = side;
	}

	public CashmarginStockCode getCashMargin() {
		return cashMargin;
	}

	public void setCashMargin(CashmarginStockCode cashMargin) {
		this.cashMargin = cashMargin;
	}

	public MarginTradeTypeCode getMarginTradeType() {
		return marginTradeType;
	}

	public void setMarginTradeType(MarginTradeTypeCode marginTradeType) {
		this.marginTradeType = marginTradeType;
	}

	public Double getMarginPremiumUnit() {
		return marginPremiumUnit;
	}

	public void setMarginPremiumUnit(Double marginPremiumUnit) {
		this.marginPremiumUnit = marginPremiumUnit;
	}

	public DelivTypeCode getDelivType() {
		return delivType;
	}

	public void setDelivType(DelivTypeCode delivType) {
		this.delivType = delivType;
	}

	public FundTypeCode getFundType() {
		return fundType;
	}

	public void setFundType(FundTypeCode fundType) {
		this.fundType = fundType;
	}

	public AccountTypeCode getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeCode accountType) {
		this.accountType = accountType;
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

	public void addClosePosition(String holdID, Integer qty) {
		if (closePositions == null) {
			closePositions = new ArrayList<>();
		}
		ClosePosition cp = new ClosePosition(holdID, qty);
		closePositions.add(cp);
	}

	public void setClosePositions(List<ClosePosition> closePositions) {
		this.closePositions = closePositions;
	}

	public FrontOrderTypeSCode getFrontOrderType() {
		return frontOrderType;
	}

	public void setFrontOrderType(FrontOrderTypeSCode frontOrderType) {
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

	public RequestSendOrder toRequestSendOrder() {
		RequestSendOrder body = new RequestSendOrder();
		body.setSymbol(symbol);
		body.setExchange(exchange.intValue());
		body.setSecurityType(securityType.intValue());
		body.setSide(side.toString());
		body.setCashMargin(cashMargin.intValue());
		if (marginTradeType != null) {
			body.setMarginTradeType(marginTradeType.intValue());
		}
		body.setMarginPremiumUnit(marginPremiumUnit);
		body.setDelivType(delivType.intValue());
		if (fundType != null) {
			body.setFundType(fundType.toString());
		}
		body.setAccountType(accountType.intValue());
		body.setQty(qty);
		if (closePositionOrder != null) {
			body.setClosePositionOrder(closePositionOrder.intValue());
		}
		if (closePositions != null) {
			List<Positions> pl = new ArrayList<>();
			for (ClosePosition cp : closePositions) {
				Positions p = cp.toPositions();
				pl.add(p);
			}
			body.setClosePositions(pl);
		}
		body.setFrontOrderType(frontOrderType.intValue());
		body.setPrice(price);
		body.setExpireDay(expireDay);
		if (reverseLimitOrder != null) {
			RequestSendOrderReverseLimitOrder rlo = reverseLimitOrder.toRequestSendOrderReverseLimitOrder();
			body.setReverseLimitOrder(rlo);
		}
		return body;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SendOrderRequestWrapper {\n");
		
//	    sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
		sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
		sb.append("    side: ").append(toIndentedString(side)).append("\n");
		sb.append("    cashMargin: ").append(toIndentedString(cashMargin)).append("\n");
		sb.append("    marginTradeType: ").append(toIndentedString(marginTradeType)).append("\n");
		sb.append("    marginPremiumUnit: ").append(toIndentedString(marginPremiumUnit)).append("\n");
		sb.append("    delivType: ").append(toIndentedString(delivType)).append("\n");
		sb.append("    fundType: ").append(toIndentedString(fundType)).append("\n");
		sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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
