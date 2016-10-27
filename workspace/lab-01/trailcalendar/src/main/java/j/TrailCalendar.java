package j;

import java.util.ArrayList;
import java.util.List;

public class TrailCalendar {

    private List<TrailEvent> events = new ArrayList<TrailEvent>();
    private int year;

    public TrailCalendar() {
    }

    public TrailCalendar(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.getClass().getName())
                .append("(")
                .append("year: ")
                .append(year)
                .append(", ")
                .append("events: ")
                .append(events.toString())
                .append(")")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        } else {
            TrailCalendar that = (TrailCalendar) o;

            if (year != that.year) return false;
            return events != null ? events.equals(that.events) : that.events == null;
        }

    }

    @Override
    public int hashCode() {
        int result = events != null ? events.hashCode() : 0;
        result = 31 * result + year;
        return result;
    }

    public List<TrailEvent> getEvents() {
        return events;
    }

    public void setEvents(List<TrailEvent> events) {
        this.events = events;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}