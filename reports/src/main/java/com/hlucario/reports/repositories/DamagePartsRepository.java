package com.hlucario.reports.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hlucario.reports.models.DamagePart;

@RepositoryRestResource(collectionResourceRel = "damageparts", path = "damageparts")
public interface DamagePartsRepository extends  JpaRepository<DamagePart,Long>{

}
