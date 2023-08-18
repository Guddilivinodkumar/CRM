package com.codedecode.microservices.CitizenService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.microservices.CitizenService.Entity.Citizen;
import com.codedecode.microservices.CitizenService.repositories.CitizenRepo;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	private CitizenRepo citizenrepo;
	
	@RequestMapping(path= "/test")
	public ResponseEntity<String> test() {
		
		return new ResponseEntity<>("hello",HttpStatus.OK );
	}
	
	@RequestMapping(path ="/id/{id}")
	public ResponseEntity<java.util.List<Citizen>> getById(@PathVariable Integer id){
        List<Citizen> findByVaccinationCenterId = citizenrepo.findByVaccinationCenterId(id);
		return new ResponseEntity<>(findByVaccinationCenterId, HttpStatus.OK);
	}
	
	@PostMapping(path="/add")
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen) {
		Citizen citizen = citizenrepo.save(newCitizen);
		return new ResponseEntity<>(citizen, HttpStatus.OK);
	}
	
	@GetMapping("/id/{id}")
	public void getOneLead(@PathVariable("id") Integer id) {
		 List<Citizen> list = citizenrepo.findByVaccinationCenterId(id);
	       for(Citizen c:list) {
	    	   System.out.println(c.getId());
	    	    System.out.println(c.getName());
               System.out.println(c.getVaccinationCenterId());
               
	       }
		
	}

}