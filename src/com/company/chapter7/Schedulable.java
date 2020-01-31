package com.company.chapter7;

import java.util.Date;

public class Schedulable {
    private Schedule schedule;
    private Date leadDays;

    public boolean schedulable(Date startDate,Date endDate) {
        return schedule.isScheduled(startDate,endDate);
    }

    public void leadDays() {

    }
}
