package com.easymove.emApp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@Entity
@Table(name="city")
public class City {

	public City() {
		
	}
	@Id
	@Column(name = "city_id")
	private long cityId;
	@Column(name = "city_name")
	private String cityName;
	@Column(name = "language_spoken")
	private String languageSpoken;
	@Column(name = "population")
	private double population;
	@Column(name = "population_level")
	private String populationLevel;
	@Column(name = "polution_level")
	private String polutionLevel;
	@OneToMany(mappedBy="city", cascade = CascadeType.ALL)
	@JsonInclude(value=Include.NON_NULL)
	private List<Area> areas;
	public String getPopulationLevel() {
		return populationLevel;
	}
	public void setPopulationLevel(String populationLevel) {
		this.populationLevel = populationLevel;
	}
	public String getPolutionLevel() {
		return polutionLevel;
	}
	public void setPolutionLevel(String polutionLevel) {
		this.polutionLevel = polutionLevel;
	}
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getLanguageSpoken() {
		return languageSpoken;
	}
	public void setLanguageSpoken(String languageSpoken) {
		this.languageSpoken = languageSpoken;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	public List<Area> getAreas() {
		return areas;
	}
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	
	
}
