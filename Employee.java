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
@Table(name="Employee_tbl")
public class Employee {

	
	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String empName;
	private String email;
	private String approverName;
	private String bu;
	private String sbu;
	private String buHeadName;
	
//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "project_id", referencedColumnName = "project_id")
	
	
	@OneToMany(mappedBy="emp")
	private Set<Project> project;
	
	@ManyToOne
	@JoinColumn(name = "project_id",nullable=false)
	private Project proj;
	
	
	
	
	public Set<Project> getProject() {
		return project;
	}
	public void setProject(Set<Project> project) {
		this.project = project;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getApproverName() {
		return approverName;
	}
	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public String getSbu() {
		return sbu;
	}
	public void setSbu(String sbu) {
		this.sbu = sbu;
	}
	public String getBuHeadName() {
		return buHeadName;
	}
	public void setBuHeadName(String buHeadName) {
		this.buHeadName = buHeadName;
	}
	

}
