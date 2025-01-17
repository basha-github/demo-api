package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@Autowired
	EmpRepo empRepo ;
	
	@PostMapping("/nec/emp/create")
	public Employee createEmp(@RequestBody Employee emp) {
		
		Employee rempRec = empRepo.save(emp);
		
		return rempRec;
	}

}
