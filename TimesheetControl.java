package com.timecard.Timecard.control;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.timecard.Timecard.Service.TimeSheetService;
import com.timecard.Timecard.model.timesheetfill;


@RestController
@CrossOrigin
public class TimesheetControl {

	
	Scanner sc = new Scanner(System.in);
	
	
	
	@Autowired
	private TimeSheetService tservice;
	
	@PostMapping(path="/fillTimesheet")
	public timesheetfill fillTimecard(@RequestBody timesheetfill tfill)
	{
		/*timesheetfill tcard = new timesheetfill();
		System.out.println("Enter timecard id: ");
		int id = sc.nextInt();
		//sc.nextLine();
		tcard.setTid(id);
		System.out.println("Enter hours per day: ");
		int h = sc.nextInt();
		//sc.nextLine();
		tcard.setHours(h);
		System.out.println("Enter total hours: ");
		int th = sc.nextInt();
		sc.nextLine();
		tcard.setTotal_hours(th);
		System.out.println("Enter day of the week: ");
		String day = sc.nextLine();
		tcard.setDay(day);*/
		return tservice.fillTimecard(tfill);
	}
	
	@PostMapping(path="/testposttimecard")
	public void testfillTimecard()
	{
		timesheetfill tcard = new timesheetfill();
		System.out.println("Enter hours per day: ");
		int h = sc.nextInt();
		//sc.nextLine();
		tcard.setHours(h);
		System.out.println("Enter total hours: ");
		int th = sc.nextInt();
		sc.nextLine();
		tcard.setTotal_hours(th);
		System.out.println("Enter day of the week: ");
		String day = sc.nextLine();
		tcard.setDay(day);
		tservice.fillTimecard(tcard);
	}
	
	
	@GetMapping(path="/getTimecards")
	public List<timesheetfill> getTimecard()
	{
		return tservice.getAllTimecards();
	}
	
	
	@DeleteMapping(path="/deleteTimesheet/{tid}")
	public void deleteTimesheet(@PathVariable int tid)
	{
		tservice.deleteTimesheet(tid);
	}

}










































															





						