package edu.sjsu.assignment3;

import java.time.LocalDate;

/**
 * This class inherited from Appointment.
 */
public class DailyAppointment extends Appointment{

    public DailyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    @Override
    public boolean occursOn(LocalDate date){
        /**
         * check if the input is between the start and end date (inclusive)
         */
        if(date.isAfter(getStartDate())&&date.isBefore(getEndDate())){
            return true;
        }
        else return false;
    }
}
