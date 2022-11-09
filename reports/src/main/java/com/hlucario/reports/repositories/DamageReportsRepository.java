package com.hlucario.reports.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hlucario.reports.models.DamageReport;

@RepositoryRestResource(collectionResourceRel = "damagereports", path = "damagereports")
public interface DamageReportsRepository extends JpaRepository<DamageReport,Long>{

}
