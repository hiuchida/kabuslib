package com.github.hiuchida.api.consts;

/**
 * 状態コード。
 * @see com.github.hiuchida.api.InfoApiWrapper state:状態
 */
public enum StateCode {
	待機(1), 処理中(2), 処理済(3), 訂正取消送信中(4), 終了(5);

	private int id;

	private StateCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static StateCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (StateCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
