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

import com.hlucario.reports.models.DamageReport;
import com.hlucario.reports.repositories.DamageReportsRepository;
import com.hlucario.reports.services.DamageReportService;

@RestController
@RequestMapping("/damagereports")
public class DamageReportsController {

	@Autowired
	DamageReportService damageReportService;
	
	public DamageReportsController(DamageReportService damageReportService) {
		this.damageReportService = damageReportService;
	}
	
	@GetMapping(path="/{damageReportId}")
	public DamageReport get(@PathVariable(value = "damageReportId") Long damageReportId) {
		return damageReportService.getDamageReport(damageReportId);
	}
	
	@PostMapping("")
	public DamageReport post(@RequestBody DamageReport damageReport) {
		return damageReportService.createDamageReport(damageReport);
	}
	
	@GetMapping("")
	public List<DamageReport> getAll() {
		return damageReportService.getDamageReports();
	}
	
	@PutMapping(path="/{damageReportId}")
	public DamageReport put(@PathVariable(value = "damageReportId") Long damageReportId, @RequestBody DamageReport damageReport) {
		return damageReportService.updateDamageReport(damageReportId, damageReport);
	}
	
	@DeleteMapping(path="/{damageReportId}")
	public void put(@PathVariable(value = "damageReportId") Long damageReportId) {
		damageReportService.deleteDamageReport(damageReportId);
	}
}
