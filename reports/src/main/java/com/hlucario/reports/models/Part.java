package com.hlucario.reports.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Part")
public class Part {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native", strategy="native")
	@Column(name="id")
	@NotNull
	public Long id;
	
	@Column(name = "name")
	@NotNull
	public String name;
	
	@Column(name = "description")
	@NotNull
	public String description;
	
	@Column(name="part_number")
	@NotNull
	public String partNumber;
	
	@Column(name="unit_price")
	@NotNull
	public Double unitPrice;
	
	@OneToMany(mappedBy = "partId", orphanRemoval = false)
	@JsonIgnore
	private List<DamagePart> damagePart;
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
