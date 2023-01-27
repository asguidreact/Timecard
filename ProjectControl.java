package com.timecard.Timecard.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timecard.Timecard.model.*;
import com.timecard.Timecard.Service.ProjectService;


@RestController
public class ProjectControl {
	
	@Autowired
	private ProjectService pservice;
	
	@GetMapping(path="/getprojectlist")
	public List<Project> getAllProjects()
	{
		return pservice.getAllProjects();
	}
	
}
