package com.github.hiuchida.api.model;

import java.util.ArrayList;
import java.util.List;

import com.github.hiuchida.api.consts.ExchangeCode;

import io.swagger.client.model.RegistSuccess;
import io.swagger.client.model.RequestRegisterSymbols;

/**
 * RegisterApiWrapperの戻り値。
 * 
 * List<RequestRegisterSymbols>型を、List<RegisterSymbolWrapper>型に変更。
 * 
 * @see io.swagger.client.model.RegistSuccess
 */
public class RegistSuccessWrapper {

	private List<RegisterSymbolWrapper> registList = null;

	public RegistSuccessWrapper(RegistSuccess response) {
		List<RequestRegisterSymbols> list = response.getRegistList();
		if (list != null) {
			registList = new ArrayList<>();
			for (RequestRegisterSymbols item : list) {
				ExchangeCode ec = ExchangeCode.valueOf(item.getExchange());
				RegisterSymbolWrapper regist = new RegisterSymbolWrapper(item.getSymbol(), ec);
				registList.add(regist);
			}
		}
	}

	public List<RegisterSymbolWrapper> getRegistList() {
		return registList;
	}

	public void setRegistList(List<RegisterSymbolWrapper> registList) {
		this.registList = registList;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RegistSuccessWrapper {\n");

		sb.append("    registList: ").append(toIndentedString(registList)).append("\n");
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
