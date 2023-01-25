package com.timecard.Timecard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timecard.Timecard.model.Project;

public interface ProjectRepos extends JpaRepository<Project, Integer> {

	
	
}
