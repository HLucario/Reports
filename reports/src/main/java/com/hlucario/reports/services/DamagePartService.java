package com.hlucario.reports.services;

import java.util.List;

import com.hlucario.reports.models.DamagePart;

public interface DamagePartService {

	public DamagePart getDamageReport(Long id);
	
	public List<DamagePart> getDamageReports();
	
	public DamagePart createDamageReport(DamagePart damagePart);
	
	public DamagePart updatePart(Long damagePartId, DamagePart damagePart);
	
	public void deleteDamageReport(Long damagePartId);
}
