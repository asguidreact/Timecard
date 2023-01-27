package com.timecard.Timecard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timecard.Timecard.model.timesheetfill;

@Repository
public interface TimesheetFillRepository extends JpaRepository<timesheetfill,Integer> {

}
