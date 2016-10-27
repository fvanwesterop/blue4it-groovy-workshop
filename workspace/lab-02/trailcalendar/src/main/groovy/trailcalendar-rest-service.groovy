#!/usr/bin/env groovyclient -Cq
import nl.blue4it.groovy.workshop.app.TrailCalendarRestService

@Grapes([
        @Grab(group='org.slf4j', module='slf4j-api', version='1.7.21'),
        @Grab(group='org.eclipse.jetty', module='jetty-server', version='9.3.10.v20160621'),
        @Grab(group='org.eclipse.jetty', module='jetty-servlet', version='9.3.10.v20160621'),
        @Grab(group='ch.qos.logback', module='logback-classic', version='1.1.7'),
        @Grab(group='javax.servlet', module='javax.servlet-api', version='3.1.0')])

def service = new TrailCalendarRestService().startService(4000)
