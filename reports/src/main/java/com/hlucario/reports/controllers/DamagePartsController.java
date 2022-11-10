package com.hlucario.reports.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hlucario.reports.models.DamagePart;
import com.hlucario.reports.models.DamagePartCustom;
import com.hlucario.reports.models.DamageReport;
import com.hlucario.reports.models.Part;
import com.hlucario.reports.repositories.DamagePartsRepository;
import com.hlucario.reports.repositories.DamageReportsRepository;
import com.hlucario.reports.repositories.PartsRepository;
import com.hlucario.reports.services.DamagePartService;
import com.hlucario.reports.services.DamageReportService;
import com.hlucario.reports.services.PartService;

@RestController
@RequestMapping("/damageparts")
public class DamagePartsController {

	@Autowired
	DamagePartService damagePartService;
	DamageReportService damageReportService;
	PartService partService;
	
	public DamagePartsController(DamagePartService damagePartService,
			DamageReportService damageReportService,
			PartService partService) {
		this.damagePartService = damagePartService;
		this.damageReportService = damageReportService;
		this.partService= partService;
	}
	
	@GetMapping(path="/{damagePartId}")
	public DamagePart get(@PathVariable(value = "damagePartId") Long damagePartId) {
		return damagePartService.getDamagePart(damagePartId);
	}
	
	@PostMapping("")
	public DamagePart post(@RequestBody DamagePartCustom damagePartCustom) {
		Part partAux = partService.getPart(damagePartCustom.getPartId());
		DamageReport damageReportAux = damageReportService.getDamageReport(damagePartCustom.getDamageReportId());
		DamagePart damagePart = new DamagePart();
		damagePart.setDamageReportId(damageReportAux);
		damagePart.setPartId(partAux);
		damagePart.setQuantity(damagePartCustom.getQuantity());
		return damagePartService.createDamagePart(damagePart);
	}
	
	@GetMapping("")
	public List<DamagePart> getAll() {
		return damagePartService.getDamageParts();
	}
	
	@PutMapping(path="/{damagePartId}")
	public DamagePart put(@PathVariable(value = "damagePartId") Long damagePartId, @RequestBody DamagePartCustom damagePartCustom) {
		Part partAux = partService.getPart(damagePartCustom.getPartId());
		DamageReport damageReportAux = damageReportService.getDamageReport(damagePartCustom.getDamageReportId());
		DamagePart damagePart = new DamagePart();
		damagePart.setDamageReportId(damageReportAux);
		damagePart.setPartId(partAux);
		damagePart.setQuantity(damagePartCustom.getQuantity());	
		return damagePartService.updateDamagePart(damagePartId, damagePart);
	}
	
	@DeleteMapping(path="/{damagePartId}")
	public void put(@PathVariable(value = "damagePartId") Long damagePartId) {
		damagePartService.deleteDamagePart(damagePartId);
	}
}
