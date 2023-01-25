package com.timecard.Timecard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.timecard.Timecard.model.Employee;

public interface EmployeeRepos extends JpaRepository<Employee, Integer> {
	
//	@Query(value="select ")
//	public Employee findProject(int empid);
}
