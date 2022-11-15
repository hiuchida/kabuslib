package com.github.hiuchida.api.consts.stock;

/**
 * トリガ銘柄コード。
 * 
 * @see io.swagger.client.model.RequestSendOrder.reverseLimitOrder.triggerSec:注文発注（株式）情報／トリガ銘柄コード。
 */
public enum TriggerSecCode {
	発注銘柄(1), NK225指数(2), TOPIX指数(3);

	private int id;

	private TriggerSecCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static TriggerSecCode valueOf(int id) {
		for (TriggerSecCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
