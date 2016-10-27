import j.TrailCalendar;
import j.TrailEvent;

import java.util.Date;

class MainJ {
    private static TrailCalendar calendar = new TrailCalendar(2016);

    public static void main(String[] argv) {

        calendar.getEvents().add(new TrailEvent("Rondje Bergen", new Date(), "Le Champion"));
        calendar.getEvents().add(new TrailEvent("Devilstrail Doorn", new Date(), "Stichting OX"));

        System.out.println(calendar);
    }
}