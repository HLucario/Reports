package com.hlucario.reports.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlucario.reports.models.DamageReport;
import com.hlucario.reports.repositories.DamageReportsRepository;
import com.hlucario.reports.services.DamageReportService;

@Service
public class DamageReportServiceImpl implements DamageReportService{

	@Autowired
	DamageReportsRepository damageReportsRepository;
	
	@Override
	public DamageReport getDamageReport(Long id) {
		DamageReport damageReport = damageReportsRepository.findById(id).get();
		return damageReport;
	}

	@Override
	public List<DamageReport> getDamageReports() {
		List<DamageReport> damageReports = damageReportsRepository.findAll();
		return damageReports;
	}

	@Override
	public DamageReport createDamageReport(DamageReport damageReport) {
		DamageReport damageReportN = damageReportsRepository.save(damageReport);
		return damageReportN;
	}

	@Override
	public DamageReport updatePart(Long damageReportId, DamageReport damageReport) {
		DamageReport damageReportU = damageReportsRepository.findById(damageReportId).get();
		damageReportU.setDescription(damageReport.getDescription());
		damageReportU.setEstimatedRepairTime(damageReport.getEstimatedRepairTime());
		damageReportU.setSeverity(damageReport.getSeverity());
		damageReportU.setWorkshopId(damageReport.getWorkshopId());
		return damageReportsRepository.save(damageReportU);
	}

	@Override
	public void deleteDamageReport(Long damageReportId) {
		damageReportsRepository.deleteById(damageReportId);
	}

	
}
