package g

import groovy.transform.Canonical;

@Canonical
class TrailCalendar {
    def events = new ArrayList<TrailEvent>()
    def year = 0
}