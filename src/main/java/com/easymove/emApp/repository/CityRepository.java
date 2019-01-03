package com.easymove.emApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.easymove.emApp.model.City;
@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
