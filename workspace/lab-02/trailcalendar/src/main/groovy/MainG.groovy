import g.TrailCalendar
import g.TrailEvent

class MainG {

	static void main(String... args) {
		new MainG().run()
	}


    def run() {

        TrailCalendar calendar = new TrailCalendar(year: '2016');

        calendar.events << new TrailEvent(eventDate: new Date(), raceDirector: 'Le Champion', eventName: 'Rondje Bergen')
        calendar.events << new TrailEvent(eventName: 'Devilstrail Doorn', eventDate: new Date(), raceDirector: 'Stichting OX');

        println calendar
    }
}
