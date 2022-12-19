package com.github.hiuchida.api.consts.stock;

/**
 * 商品種別。
 * 
 * @see io.swagger.client.model.RequestSendOrder.securityType:注文発注（株式）情報／商品種別。
 */
public enum SecurityTypeSCode {
	株式(1);

	private int id;

	private SecurityTypeSCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static SecurityTypeSCode valueOf(int id) {
		for (SecurityTypeSCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
