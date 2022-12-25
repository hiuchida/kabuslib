package com.github.hiuchida.api.consts.stock;

/**
 * 受渡区分。
 * @see api.SendoderApi body.delivType:注文発注（株式）情報／受渡区分。
 */
public enum DelivTypeCode {
	指定なし(0), 自動振替(1), お預り金(2);

	private int id;

	private DelivTypeCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static DelivTypeCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (DelivTypeCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
