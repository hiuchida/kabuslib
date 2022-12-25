package com.github.hiuchida.api.consts;

/**
 * 明細種別コード。
 * 
 * @see io.swagger.client.model.OrdersSuccess.Details.recType:注文約定情報／注文詳細／明細種別。
 */
public enum RecTypeCode {
	受付(1), 繰越(2), 期限切れ(3), 発注(4), 訂正(5), 取消(6), 失効(7), 約定(8);

	private int id;

	private RecTypeCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static RecTypeCode valueOf(int id) {
		for (RecTypeCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
