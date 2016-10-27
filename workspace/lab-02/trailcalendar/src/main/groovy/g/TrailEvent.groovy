package g

import groovy.transform.Canonical;

@Canonical
public class TrailEvent {
    String eventName;
    Date eventDate;
    String raceDirector;
}