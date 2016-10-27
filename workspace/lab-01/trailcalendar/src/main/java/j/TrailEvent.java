package j;

import java.util.Date;

public class TrailEvent {

    private String eventName;
    private Date eventDate;
    private String raceDirector;
    private String eventType;

    public TrailEvent() {
    }

    public TrailEvent(String eventName, Date eventDate, String director) {
        setEventName(eventName);
        setEventDate(eventDate);
        setRaceDirector(director);
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.getClass().getName())
                .append("(")
                .append("eventName: ")
                .append(eventName == null ? "null" : eventName.toString())
                .append(", ")
                .append("eventDate: ")
                .append(eventDate == null ? "null" : eventDate.toString())
                .append(", ")
                .append("raceDirector: ")
                .append(raceDirector == null ? "null" : raceDirector.toString())
                .append(", ")
                .append("eventType: ")
                .append(eventType == null ? "null" : eventType.toString())
                .append(")")
                .toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (eventName != null) {
            hashCode = 31 * hashCode + eventName.hashCode();
        }
        if (eventDate != null) {
            hashCode = 31 * hashCode + eventDate.hashCode();
        }
        if (raceDirector != null) {
            hashCode = 31 * hashCode + raceDirector.hashCode();
        }
        if (eventType != null) {
            hashCode = 31 * hashCode + eventType.hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        } else if (!(obj instanceof TrailEvent)) {
            return false;
        } else {
            TrailEvent otherEvent = (TrailEvent) obj;

            int equals = 0;

            if (eventName == otherEvent.getEventName()) {
                equals++;
            } else if (eventName != null) {
                if (eventName.equals(otherEvent.getEventName())) {
                    equals++;
                }
            }

            if (eventDate == otherEvent.getEventDate()) {
                equals++;
            } else if (eventDate != null) {
                if (eventDate.equals(otherEvent.getEventDate())) {
                    equals++;
                }
            }

            if (raceDirector == otherEvent.getRaceDirector()) {
                equals++;
            } else if (raceDirector != null) {
                if (raceDirector.equals(otherEvent.getRaceDirector())) {
                    equals++;
                }
            }

            if (eventType == otherEvent.getEventType()) {
                equals++;
            } else if (eventType != null) {
                if (eventType.equals(otherEvent.getEventType())) {
                    equals++;
                }
            }

            return equals == 4;
        }

    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String name) {
        this.eventName = name;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date date) {
        this.eventDate = date;
    }

    public String getRaceDirector() {
        return raceDirector;
    }

    public void setRaceDirector(String director) {
        this.raceDirector = director;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

}