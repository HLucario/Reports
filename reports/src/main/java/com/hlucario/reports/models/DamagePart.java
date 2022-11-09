package com.hlucario.reports.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "damage_part")
public class DamagePart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native", strategy="native")
	@Column(name="id")
	public Long id;
		
	@ManyToOne
	@JoinColumn(name = "damage_report_id")
	public DamageReport damageReportId;
	
	@ManyToOne
	@JoinColumn(name = "part_id")
	public Part part;
	
	@Column(name="quantity")
	public Long quantity;

	public Long getId() {
		return id;
	}

	public DamageReport getDamageReportId() {
		return damageReportId;
	}

	public Part getPart() {
		return part;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDamageReportId(DamageReport damageReportId) {
		this.damageReportId = damageReportId;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
}
