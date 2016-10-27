package nl.blue4it.groovy.workshop.rest

import nl.blue4it.groovy.workshop.persistence.TrailCalendarRepo

import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import groovy.json.JsonBuilder
import org.slf4j.LoggerFactory

class CalendarServlet extends HttpServlet {

    def log = LoggerFactory.getLogger(CalendarServlet.class)
    TrailCalendarRepo trailCalendar
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        def command = parseCommand(request)
        def id = parseParam(request)

        def events = []

        switch (command) {
            case 'find':
                events << findById(id)
                break
            case 'findAll':
                events.addAll(findAll())
                break
            default:
                log.warn "Command ${command} not implemented."
        }


        response.setContentType('application/json');
        try {
            def json  = new JsonBuilder(['events': events])
            response.setStatus(HttpServletResponse.SC_OK)
            response.writer.println json.toPrettyString()

        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR)
            response.getWriter().println "{\"error\":\"${e.getMessage()}\"}"
        }
    }

    private String parseParam(HttpServletRequest request) {
        return request.pathInfo.substring(1)
    }

    private String parseCommand(HttpServletRequest request) {
        return request.servletPath.substring(1)
    }


    // Returns EventWrapper item including technical key.
    // How can we remove the wrapper (including key) and just return TrailEvent objects?
    // (hint: collections collect method)
    private def findById(String id) {
        def wrappers = trailCalendar.find  { wrapper ->
                wrapper.id == id
        }
    }

    // Same here: Strip the EventWrapper from around the TrailEvent objects
    private def findAll() {
        def wrappers = trailCalendar.find {
            true
        }
    }

}