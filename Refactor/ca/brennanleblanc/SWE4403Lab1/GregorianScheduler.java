package ca.brennanleblanc.SWE4403Lab1;

public class GregorianScheduler extends Scheduler {
    public GregorianScheduler() {
        super();
    }

    @Override
    public Calendar createCalendar() {
        return new GregorianCalendar();
    }
}
