package com.timecard.Timecard.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.timecard.Timecard.Service.EmployeeService;
import com.timecard.Timecard.model.Employee;
import com.timecard.Timecard.model.EmployeeLogin;



@RestController
@CrossOrigin
public class EmployeeControl {

	
	@Autowired
	private EmployeeService eservice;
	
	
	
	@PostMapping(path="/emplployeelogin")
	public ResponseEntity<String> checkLogin(@RequestBody EmployeeLogin emp) {
		ResponseEntity<String> response = null;
		boolean result = eservice.doLoginEmp(emp);
		if(result) {
			response = new ResponseEntity<String>("Email and Password is correct", HttpStatus.OK);
		}else {
			response = new ResponseEntity<String>("Email and Password is incorrect", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
	@PostMapping(path="/createemployee")
	public Employee createEmployee(@RequestBody Employee empl) 
	{
			
			return eservice.createEmployee(empl);
		//return uservice.createAccount(user);
	}
	
	@GetMapping(path="/getAllEmployee")
	public List<Employee> getAllEmployee()
	{
		return eservice.listAllEmployees();
		
	}
	
	@DeleteMapping(path="/deleteEmployee/{emp_id}")
	public void deleteEmployeeData(@PathVariable int empid) 
	{
		//uservice.deleteBookingByCno(confirmationno);
		eservice.deleteAccount(empid);
	}

	

}
