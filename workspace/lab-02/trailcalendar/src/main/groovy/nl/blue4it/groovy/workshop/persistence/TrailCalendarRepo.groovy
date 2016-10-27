package nl.blue4it.groovy.workshop.persistence

import nl.blue4it.groovy.workshop.domain.TrailEvent
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class TrailCalendarRepo {

    private static Logger log = LoggerFactory.getLogger(TrailCalendarRepo)

    class EventWrapper {
        def id
        def event
    }

    def events = [
            new EventWrapper(id: '1', event: new TrailEvent(eventName: 'Rondje Bergen', eventDate: new Date(), raceDirector: 'Le Champion')),
            new EventWrapper(id: '2', event: new TrailEvent(eventName: 'Devilstrail Doorn', eventDate: new Date(), raceDirector: 'Stichting OX'))
    ] as List<EventWrapper>

    public TrailEvent findById(String id) {

        log.info "Searching for bean with id '$id'..."

        def sentinel = new TrailEvent()
        TrailEvent event = events.findResult(sentinel, { wrapper ->
            if (wrapper.key == id) return wrapper.value
        })
        log.info "${(event.id == null) ? 'NOT found :-(' : 'FOUND! :-)'}"

        return event
    }

    public def find(Closure c) {
        return events.findAll(c)
    }

}