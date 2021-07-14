package edu.sjsu.assignment3;
import java.time.LocalDate;

/**
 * This class inherited from Appointment.
 * endDate must be equals to startDate
 */
public class OnetimeAppointment extends Appointment{
    public OnetimeAppointment(String description, LocalDate startDate) {
        super(description, startDate, startDate);
    }

    @Override
    public boolean occursOn(LocalDate date){
        if(date.equals(getStartDate())){
            return true;
        }
        else return false;
    }
}
