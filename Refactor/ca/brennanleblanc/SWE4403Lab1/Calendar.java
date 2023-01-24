package ca.brennanleblanc.SWE4403Lab1;

public interface Calendar {
    public void addEvent(Event event);
    public Event getEvent(String title);
}
