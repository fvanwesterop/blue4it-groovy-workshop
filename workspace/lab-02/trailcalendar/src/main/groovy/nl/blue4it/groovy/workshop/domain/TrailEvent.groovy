package nl.blue4it.groovy.workshop.domain

import groovy.transform.Canonical;

@Canonical
public class TrailEvent {
    String eventName;
    Date eventDate;
    String raceDirector;
}