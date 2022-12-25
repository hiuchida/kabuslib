package com.github.hiuchida.api.consts;

public enum SecurityTypeCode {
	指数(0), 現物(1), 日経225先物(101), 日経225OP(103), TOPIX先物(107), JPX400先物(121), NYダウ(144), 日経平均VI(145), 東証マザーズ指数先物(154),
	TOPIX_REIT(155), TOPIX_CORE30(171), 日経平均225ミニ先物(901), TOPIXミニ先物(907);

	private int id;

	private SecurityTypeCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static SecurityTypeCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (SecurityTypeCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
