package ca.brennanleblanc.SWE4403Lab1;

public class ArabianCalendar implements Calendar {
    private Event head;

    public ArabianCalendar() {
        head = null;
    }

    public void addEvent(Event event) {
        if (head == null) {
            head = event;
        } else {
            head.setNext(event);
        }
    }

    public Event getEvent(String title) {
        if (head == null) {
            return null;
        } else {
            return head.getNext(title);
        }
    }
}
