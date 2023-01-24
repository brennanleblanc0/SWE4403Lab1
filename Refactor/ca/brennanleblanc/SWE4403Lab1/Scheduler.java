package ca.brennanleblanc.SWE4403Lab1;

public abstract class Scheduler {
    private Calendar calendar;

    public Scheduler() {
        this.calendar = createCalendar();
    }

    public abstract Calendar createCalendar();

    public void schedule(Event event) {
        calendar.addEvent(event);
    }

    public Event getEvent(String title) {
        return calendar.getEvent(title);
    }
}
