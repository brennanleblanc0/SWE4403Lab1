package ca.brennanleblanc.SWE4403Lab1;

import java.util.Date;

public class Event {
    private Date date;
    private String title;
    private String time;
    private Event next;

    public Event(Date date, String title, String time) {
        this.date = date;
        this.title = title;
        this.time = time;
        this.next = null;
    }

    public Date getDate() {
        return this.date;
    }

    public String getTime() {
        return this.time;
    }

    public String getTitle() {
        return this.title;
    }

    public void setNext(Event next) {
        if (next == null) {
            this.next = next;
        } else {
            this.next.setNext(next);
        }
        
    }

    public Event getNext(String title) {
        if (this.title.equals(title)) {
            return this;
        } else if (next == null) {
            return null;
        } else {
            return next.getNext(title);
        }
    }

    @Override
    public String toString() {
        return "Event: " + this.title + " at " + this.time + " on ms " + this.date.getTime();
    }

}
