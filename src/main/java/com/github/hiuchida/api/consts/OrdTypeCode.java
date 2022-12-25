package com.github.hiuchida.api.consts;

/**
 * 執行条件コード。
 * 
 * @see io.swagger.client.model.OrdersSuccess.ordType:注文約定情報／執行条件。
 */
public enum OrdTypeCode {
	ZERO(0), ザラバ(1), 寄り(2), 引け(3), 不成(4), 対当指値(5), IOC(6);

	private int id;

	private OrdTypeCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static OrdTypeCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (OrdTypeCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
