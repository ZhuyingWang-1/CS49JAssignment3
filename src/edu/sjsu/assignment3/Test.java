
/*
package edu.sjsu.assignment3;

import java.time.LocalDate;
import org.junit.Assert;


public class Test {
    LocalDate startDate = LocalDate.parse("2021-06-01");
    LocalDate endDate = LocalDate.parse("2021-08-05");

    LocalDate testDate1 = LocalDate.parse("2021-06-05");
    LocalDate testDate2 = LocalDate.parse("2021-07-01");
    LocalDate testDate3 = LocalDate.parse("2021-08-15");
    private  Appointment appointment = new OnetimeAppointment("Class starts", startDate);


    @Test
    void test_OccursOn() {
        // Appointment appointment = new OnetimeAppointment("Class starts", startDate);

        assertEquals(false, appointment.occursOn(testDate1);


        //Example 2: if the appointment is a daily appointment
        Appointment appointment2 = new DailyAppointment("Class", startDate, endDate);
        System.out.println(appointment2.occursOn(testDate1));// returns true
        System.out.println(appointment2.occursOn(testDate2)); // returns true
        System.out.println(appointment2.occursOn(testDate3)); // returns false (after the end date)

        //Example 3: if the appointment is a monthly appointment
        Appointment appointment3 = new MonthlyAppointment("Meeting", startDate, endDate);
        System.out.println(appointment3.occursOn(testDate1)); // returns false (day of month not same)
        System.out.println(appointment3.occursOn(testDate2)); // returns true
        System.out.println(appointment3.occursOn(testDate3)); // returns false (after the end date)

             }
}
*/