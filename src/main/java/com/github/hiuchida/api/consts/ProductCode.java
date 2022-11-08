package com.github.hiuchida.api.consts;

/**
 * 商品コード。
 * @see com.github.hiuchida.api.InfoApiWrapper product:取得する商品
 */
public enum ProductCode {
	すべて(0), 現物(1), 信用(2), 先物(3), OP(4);

	private int id;

	private ProductCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static ProductCode valueOf(int id) {
		for (ProductCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
