package com.company.chapter7;

import java.util.Date;

public class Schedule implements ScheduleInterface {

    Date startDate;
    Date endDate;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Schedule(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public boolean isScheduled(Date starting, Date ending) {
        System.out.println("not scheduled");
        return false;
    }
}
