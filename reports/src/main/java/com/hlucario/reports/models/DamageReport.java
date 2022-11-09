package com.hlucario.reports.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "damage_report")
public class DamageReport {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native", strategy="native")
	@Column(name="id")
	public Long id;
	
	@Column(name = "created_date")
	@JsonProperty(access = Access.READ_ONLY)
	public LocalDate createdDate;
	
	@Column(name = "severity")
	public String severity;
	
	@Column(name = "estimated_repair_time")
	@JsonProperty(access = Access.READ_ONLY)
	public LocalDate estimatedRepairTime;
	
	@Column(name = "description")
	public String description;
	
	@Column(name="workshop_id")
	public Long workshopId;

	public Long getId() {
		return id;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public String getSeverity() {
		return severity;
	}

	public LocalDate getEstimatedRepairTime() {
		return estimatedRepairTime;
	}

	public String getDescription() {
		return description;
	}

	public Long getWorkshopId() {
		return workshopId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public void setEstimatedRepairTime(LocalDate estimatedReapirTime) {
		this.estimatedRepairTime = estimatedReapirTime;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setWorkshopId(Long workshopId) {
		this.workshopId = workshopId;
	}

}
