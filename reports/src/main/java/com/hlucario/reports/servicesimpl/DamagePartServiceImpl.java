package com.hlucario.reports.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlucario.reports.models.DamagePart;
import com.hlucario.reports.repositories.DamagePartsRepository;
import com.hlucario.reports.services.DamagePartService;

@Service
public class DamagePartServiceImpl implements DamagePartService{

	@Autowired
	DamagePartsRepository damagePartsRepository;
	
	@Override
	public DamagePart getDamageReport(Long id) {
		DamagePart damagePart = damagePartsRepository.findById(id).get();
		return damagePart;
	}

	@Override
	public List<DamagePart> getDamageReports() {
		List<DamagePart> damageParts = damagePartsRepository.findAll();
		return damageParts;
	}

	@Override
	public DamagePart createDamageReport(DamagePart damagePart) {
		DamagePart damagePartN = damagePartsRepository.save(damagePart);
		return damagePartN;
	}

	@Override
	public DamagePart updatePart(Long damagePartId, DamagePart damagePart) {
		DamagePart damagePartU = damagePartsRepository.findById(damagePartId).get();
		return damagePart;
	}

	@Override
	public void deleteDamageReport(Long damagePartId) {
		// TODO Auto-generated method stub
		
	}

}
