package edu.sjsu.assignment3;

import java.time.LocalDate;

/**
 * This class inherited from Appointment.
 */
public class MonthlyAppointment extends Appointment{
    public MonthlyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    @Override
    public boolean occursOn(LocalDate date){
        /**
         * check if the input is between the start and end date (inclusive) AND the day of the input date is the same as the day of the start date of the appointment
         */
        if(date.isAfter(getStartDate())&&date.isBefore(getEndDate())&&date.getDayOfMonth()==getStartDate().getDayOfMonth()){
            return true;
        }
        else return false;
    }
}
