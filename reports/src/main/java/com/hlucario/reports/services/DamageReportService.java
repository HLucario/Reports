package com.hlucario.reports.services;

import java.util.List;

import com.hlucario.reports.models.DamageReport;

public interface DamageReportService {

	public DamageReport getDamageReport(Long id);
	
	public List<DamageReport> getDamageReports();
	
	public DamageReport createDamageReport(DamageReport damageReport);
	
	public DamageReport updatePart(Long damageReportId, DamageReport damageReport);
	
	public void deleteDamageReport(Long damageReportId);
}
