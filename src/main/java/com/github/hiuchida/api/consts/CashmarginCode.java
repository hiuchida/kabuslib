package com.github.hiuchida.api.consts;

/**
 * 取引区分コード。
 * @see com.github.hiuchida.api.InfoApiWrapper cashmargin:取引区分
 */
public enum CashmarginCode {
	新規(2), 返済(3);

	private int id;

	private CashmarginCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static CashmarginCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (CashmarginCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
