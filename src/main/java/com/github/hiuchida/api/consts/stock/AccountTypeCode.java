package com.github.hiuchida.api.consts.stock;

/**
 * 口座種別。
 * 
 * @see io.swagger.client.model.RequestSendOrder.accountType:注文発注（株式）情報／口座種別。
 */
public enum AccountTypeCode {
	一般(2), 特定(4), 法人(12);

	private int id;

	private AccountTypeCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static AccountTypeCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (AccountTypeCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
