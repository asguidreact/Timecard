package com.timecard.Timecard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timecard.Timecard.Repository.EmployeeRepos;
import com.timecard.Timecard.Repository.ProjectRepos;
import com.timecard.Timecard.model.*;

@Service
public class ProjectService {

	@Autowired
	private EmployeeRepos emprepos;
	
	@Autowired
	private ProjectRepos prepos;
	
	public List<Project> getAllProjects()
	{
		return prepos.findAll();
	}
}
