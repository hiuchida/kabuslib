package com.github.hiuchida.api.consts;

/**
 * 以上／以下コード。
 * 
 * @see io.swagger.client.model.RequestSendOrder.reverseLimitOrder.underOver:注文発注（株式）情報／以上／以下。
 * @see io.swagger.client.model.RequestSendOrderDerivFuture.reverseLimitOrder.underOver:注文発注（先物）情報／以上／以下。
 * @see io.swagger.client.model.RequestSendOrderDerivOption.reverseLimitOrder.underOver:注文発注（オプション）情報／以上／以下。
 */
public enum UnderOverCode {
	以下(1), 以上(2);

	private int id;

	private UnderOverCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static UnderOverCode valueOf(int id) {
		for (UnderOverCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
