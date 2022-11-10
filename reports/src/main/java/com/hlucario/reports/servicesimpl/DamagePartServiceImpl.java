package com.hlucario.reports.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlucario.reports.models.DamagePart;
import com.hlucario.reports.repositories.DamagePartsRepository;
import com.hlucario.reports.repositories.DamageReportsRepository;
import com.hlucario.reports.repositories.PartsRepository;
import com.hlucario.reports.services.DamagePartService;

@Service
public class DamagePartServiceImpl implements DamagePartService{

	@Autowired
	DamagePartsRepository damagePartsRepository;
	
	@Override
	public DamagePart getDamagePart(Long id) {
		DamagePart damagePart = damagePartsRepository.findById(id).get();
		return damagePart;
	}

	@Override
	public List<DamagePart> getDamageParts() {
		List<DamagePart> damageParts = damagePartsRepository.findAll();
		return damageParts;
	}

	@Override
	public DamagePart createDamagePart(DamagePart damagePart) {		
		DamagePart damagePartN = damagePartsRepository.save(damagePart);
		return damagePartN;
	}

	@Override
	public DamagePart updateDamagePart(Long damagePartId, DamagePart damagePart) {
		DamagePart damagePartU = damagePartsRepository.findById(damagePartId).get();
		damagePartU.setDamageReportId(damagePart.getDamageReportId());
		damagePartU.setPartId(damagePart.getPartId());
		damagePartU.setQuantity(damagePart.getQuantity());
		DamagePart damagePartN = damagePartsRepository.save(damagePartU);
		return damagePartN;
	}

	@Override
	public void deleteDamagePart(Long damagePartId) {
		// TODO Auto-generated method stub
		
	}

}
