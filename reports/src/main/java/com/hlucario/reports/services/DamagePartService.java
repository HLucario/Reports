package com.hlucario.reports.services;

import java.util.List;

import com.hlucario.reports.models.DamagePart;
import com.hlucario.reports.models.DamagePartCustom;

public interface DamagePartService {

	public DamagePart getDamagePart(Long id);
	
	public List<DamagePart> getDamageParts();
	
	public DamagePart createDamagePart(DamagePart damagePart);
	
	public DamagePart updateDamagePart(Long damagePartId, DamagePart damagePart);
	
	public void deleteDamagePart(Long damagePartId);
}
