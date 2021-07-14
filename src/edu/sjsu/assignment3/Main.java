package edu.sjsu.assignment3;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* for part2
	// write your code here
        LocalDate startDate = LocalDate.parse("2021-06-01");
        LocalDate endDate = LocalDate.parse("2021-08-05");

        LocalDate testDate1 = LocalDate.parse("2021-06-05");
        LocalDate testDate2 = LocalDate.parse("2021-07-01");
        LocalDate testDate3 = LocalDate.parse("2021-08-15");

        //Example 1: if the appointment is a one-time appointment (end date is the same as startDate),
        Appointment appointment = new OnetimeAppointment("Class starts", startDate);
        System.out.println(appointment.occursOn(testDate1)); // returns false, same for other test dates


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

         */

        Appointment a1= new OnetimeAppointment("Class Starts", LocalDate.of(2021, 6, 1));
        Appointment a2=new OnetimeAppointment("Class Ends",LocalDate.of(2021, 8, 5));
        Appointment a3=new DailyAppointment("Class",LocalDate.of(2021, 6, 1),LocalDate.of(2021, 8, 5));
        Appointment a4=new MonthlyAppointment("code meeeting",LocalDate.of(2021, 6, 1),LocalDate.of(2021,8,1));
        Appointment a5=new MonthlyAppointment("Assignment",LocalDate.of(2021,6,1),LocalDate.of(2021,8,5));

        Appointment[] arr={a1,a2,a3,a4,a5};

        //for part 3 - sorting with comparator
        Arrays.sort(arr);

        //for part 4 -sorting with Comparator
        Arrays.sort(arr,new DesComparator());

        //print out arr
        for(Appointment a:arr) {
            System.out.println(a.toString());
        }

    }
}
