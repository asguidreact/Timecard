package com.timecard.Timecard.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class timesheetfill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	private int hours;
	private int total_hours;
	//private List<String> days;
	private String day;
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getTotal_hours() {
		return total_hours;
	}
	public void setTotal_hours(int total_hours) {
		this.total_hours = total_hours;
	}
	
	
	
	
//	public List<String> getDays() {
//		return days;
//	}
//	public void setDays(List<String> days) {
//		this.days = days;
//	}
	
	 
}
























































































































































































































































































































































































































































                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
