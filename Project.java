package com.timecard.Timecard.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Project_tbl")
public class Project {
	
	@Id
	@Column(name="project_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int projectid;
	private int projectname;
	
//	@OneToMany
//	@JoinColumn(name="emp_id")
//	
	
	@ManyToOne
	@JoinColumn(name="emp_id",nullable=false)
	private Employee emp;
	
	@OneToMany(mappedBy="proj")
	private Set<Employee> empl;
	
	
//	public void setEmp(Set<Employee> emp) {
//		this.emp = emp;
//	}
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public int getProjectname() {
		return projectname;
	}
	public void setProjectname(int projectname) {
		this.projectname = projectname;
	}
	
	
}
