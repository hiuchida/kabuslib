package com.github.hiuchida.api.consts;

/**
 * 気配フラグコード。
 * 
 * @see io.swagger.client.model.BoardSuccess.bidSign:時価情報・板情報／最良売気配フラグ。
 * @see io.swagger.client.model.BoardSuccess.askSign:時価情報・板情報／最良買気配フラグ。
 * @see io.swagger.client.model.BoardSuccessSell1.sign:時価情報・板情報／売気配数量1本目／気配フラグ。
 * @see io.swagger.client.model.BoardSuccessBuy1.sign:時価情報・板情報／買気配数量1本目／気配フラグ。
 */
public enum SignCode {
	事象なし("0000"), 一般気配("0101"), 特別気配("0102"), 注意気配("0103"), 寄前気配("0107"), 停止前特別気配("0108"), 引け後気配("0109"),
	寄前気配約定成立ポイントなし("0116"), 寄前気配約定成立ポイントあり("0117"), 連続約定気配("0118"), 停止前の連続約定気配("0119"), 買い上がり売り下がり中("0120");

	private String code;

	private SignCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return code;
	}

	public static SignCode valueOfCode(String code) {
		if (code == null) {
			return null;
		}
		for (SignCode e : values()) {
			if (e.code.equals(code)) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant code=" + code);
	}

}
