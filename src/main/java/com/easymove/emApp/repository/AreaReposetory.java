package com.easymove.emApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.easymove.emApp.model.Area;

@Repository
public interface AreaReposetory extends CrudRepository<Area, Long>{

}
