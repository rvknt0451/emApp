package com.easymove.emApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@Entity
@Table(name="area")
public class Area {
	
	public Area() {
		
	}
	@Id
	@Column(name = "area_id")
	private long areaId;
	@Column(name = "area_name")
	private String areaName;
	@Column(name = "description")
	private String description;
	@Column(name = "safety_level")
	private String safetyLevel;
	@Column(name = "city_id")
	private long city_id;
	@ManyToOne
	@JsonInclude(value=Include.NON_NULL)
	private City city;
	public long getAreaId() {
		return areaId;
	}
	public void setAreaId(long areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSafetyLevel() {
		return safetyLevel;
	}
	public void setSafetyLevel(String safetyLevel) {
		this.safetyLevel = safetyLevel;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public long getCity_id() {
		return city_id;
	}
	public void setCity_id(long city_id) {
		this.city_id = city_id;
	}
	
	
}
