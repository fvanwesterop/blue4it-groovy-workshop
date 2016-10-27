package nl.blue4it.groovy.workshop.app

import nl.blue4it.groovy.workshop.persistence.TrailCalendarRepo
import nl.blue4it.groovy.workshop.rest.CalendarServlet
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.servlet.ServletHolder

public class TrailCalendarRestService {

    static final String CONTEXT_PATH = '/trailcalendar'

    public static void main(String[] args) {
        new TrailCalendarRestService().startService(4000)
    }

    def repository = new TrailCalendarRepo();

    def startService = { int listenPort ->

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.NO_SESSIONS)
        context.setContextPath(CONTEXT_PATH)

        Server server = new Server(listenPort);
        server.setHandler(context)

        context.addServlet(new ServletHolder(new CalendarServlet(trailCalendar: repository)), '/find/*')
        context.addServlet(new ServletHolder(new CalendarServlet(trailCalendar: repository)), '/findAll/*')

        server.start();
        server.join();
    }

}
