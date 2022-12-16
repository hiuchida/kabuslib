package com.github.hiuchida.api.model;

import com.github.hiuchida.api.consts.ExchangeCode;

import io.swagger.client.model.RequestRegisterSymbols;

/**
 * RegisterApiWrapperの引数。
 * 
 * Integer型を、enum型に変更。
 * 
 * @see io.swagger.client.model.RequestRegisterSymbols
 */
public class RegisterSymbolWrapper {

	private String symbol = null;

	private ExchangeCode exchange = null;

	public RegisterSymbolWrapper(String symbol, ExchangeCode exchange) {
		this.symbol = symbol;
		this.exchange = exchange;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public ExchangeCode getExchange() {
		return exchange;
	}

	public void setExchange(ExchangeCode exchange) {
		this.exchange = exchange;
	}

	public RequestRegisterSymbols toRequestRegisterSymbols() {
		RequestRegisterSymbols rrs = new RequestRegisterSymbols();
		rrs.setSymbol(symbol);
		rrs.setExchange(exchange.intValue());
		return rrs;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RegisterSymbolWrapper {\n");

		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
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
