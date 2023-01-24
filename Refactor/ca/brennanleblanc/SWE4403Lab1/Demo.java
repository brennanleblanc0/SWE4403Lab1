package ca.brennanleblanc.SWE4403Lab1;

import java.util.Date;

public class Demo {
    public static void main (String[] args) {
        Date date = new Date();
        String title = "SWE4403 Lab 1";
        String time = "4:00 PM";

        Event event = new Event(date, title, time);

        GregorianScheduler schedule = new GregorianScheduler();
        ArabianScheduler schedule2 = new ArabianScheduler();

        schedule.schedule(event);

        System.out.println(schedule.getEvent(title));

        if (schedule2.getEvent(title) == null) {
            System.out.println("Null as expected");
        } else {
            System.out.println("Check again: Not null");
        }

    }
}
