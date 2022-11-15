package com.github.hiuchida.api.model;

import io.swagger.client.model.Positions;
import io.swagger.client.model.PositionsDeriv;

/**
 * SendoderApi,SendoderFutureApi,SendoderOptionApi共通の引数。
 * 
 * PositionsとPositionsDerivを共通のClosePosition。
 * 
 * @see io.swagger.client.model.Positions
 * @see io.swagger.client.model.PositionsDeriv
 */
public abstract class SendOrderCommonRequestWrapper {

	public static class ClosePosition {
		private String holdID = null;

		private Integer qty = null;

		public ClosePosition(String holdID, Integer qty) {
			this.holdID = holdID;
			this.qty = qty;
		}

		public String getHoldID() {
			return holdID;
		}

		public void setHoldID(String holdID) {
			this.holdID = holdID;
		}

		public Integer getQty() {
			return qty;
		}

		public void setQty(Integer qty) {
			this.qty = qty;
		}

		public Positions toPositions() {
			Positions p = new Positions();
			p.setHoldID(holdID);
			p.setQty(qty);
			return p;
		}

		public PositionsDeriv toPositionsDeriv() {
			PositionsDeriv pd = new PositionsDeriv();
			pd.setHoldID(holdID);
			pd.setQty(qty);
			return pd;
		}

	}

}
