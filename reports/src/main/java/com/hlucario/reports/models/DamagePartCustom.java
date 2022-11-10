package com.hlucario.reports.models;

public class DamagePartCustom {

	public Long damageReportId;
	
	public Long partId;
	
	public Long quantity;

	public Long getDamageReportId() {
		return damageReportId;
	}

	public Long getPartId() {
		return partId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setDamageReportId(Long damageReportId) {
		this.damageReportId = damageReportId;
	}

	public void setPartId(Long partId) {
		this.partId = partId;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	
}
