package ca.brennanleblanc.SWE4403Lab1;

public class ArabianScheduler extends Scheduler {
    public ArabianScheduler() {
        super();
    }

    @Override
    public Calendar createCalendar() {
        return new ArabianCalendar();
    }
}