package com.timecard.Timecard.Service;


import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timecard.Timecard.Repository.EmployeeLoginRepository;
import com.timecard.Timecard.Repository.EmployeeRepos;
import com.timecard.Timecard.model.Employee;
import com.timecard.Timecard.model.EmployeeLogin;




@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeLoginRepository elrepos;
	
	@Autowired
	private EmployeeRepos erepos;
	
	
	public boolean doLoginEmp(EmployeeLogin emp) {
		boolean result = false;
		EmployeeLogin emp1 = elrepos.doLogin(emp.getEmail(), emp.getPassword());
		if(emp1 != null) {
			result = true;
		}
		return result;
	}

	
	public List<Employee> listAllEmployees()
	{
		List<Employee> listempl=erepos.findAll();
		return listempl;
	}
	
	
	public Employee createEmployee(Employee empl) 
	{
			
			 return erepos.save(empl);
			
	}
	
	public void deleteAccount(int id) 
	{
			//urepos.deleteById(id);
			erepos.deleteById(id);
	}
	
	
	
	
	
}
