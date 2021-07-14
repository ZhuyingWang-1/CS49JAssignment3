package edu.sjsu.assignment3;
import java.util.Comparator;

/**
 *  this class compares Appointment.
 */
public class DesComparator implements Comparator<Appointment>{

    /**
     * This is the function that compares two appointments.
     * @param  a1, a2
     * compares Description strings first, if string are same, then compares StartDate and endDate.
     * @return int
     */
    public int compare(Appointment a1, Appointment a2)
    {
        if(!a1.getDescription().equals(a2.getDescription())) return a1.getDescription().compareTo(a2.getDescription());
        else if(!a1.getStartDate().equals(a2.getStartDate())) return a1.getStartDate().compareTo(a2.getStartDate());
        else if(!a1.getEndDate().equals(a2.getEndDate())) return a1.getEndDate().compareTo(a2.getEndDate());
        else return 0;
    }
}
