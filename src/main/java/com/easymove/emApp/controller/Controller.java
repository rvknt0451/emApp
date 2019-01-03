package com.easymove.emApp.controller;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.easymove.emApp.model.Area;
import com.easymove.emApp.repository.AreaReposetory;

import antlr.collections.List;

@RestController
@RequestMapping(path = "/test")
public class Controller {
	 @Autowired
	    DataSource dataSource;
	 
	    @Autowired
	    AreaReposetory areaRepository;
	public Controller() {
		// TODO Auto-generated constructor stub
	}
	
	/*@GetMapping(value= "/sample",  	method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ArrayList<Sample> run(){
        System.out.println("Our DataSource is = " + dataSource);
        Iterable<Sample> systemlist = systemRepository.findAll();
        ArrayList<Sample> sList = new ArrayList<>();
        for(Sample systemmodel:systemlist){
        	sList.add(systemmodel);
            System.out.println("Here is a system: " + systemmodel.toString());
        }
        return sList;
    }*/
	@RequestMapping(
			value = "/findall",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
		)
		public ResponseEntity<Iterable<Area>> findAll() {
			//try {
				//throw new RuntimeException("CREATED EXCEPTION");
				return new ResponseEntity<Iterable<Area>>(areaRepository.findAll(), HttpStatus.OK);
			/*} catch (Exception e) {
				return new ResponseEntity<Iterable<Area>>(HttpStatus.BAD_REQUEST);
			}
*/
		}
}
