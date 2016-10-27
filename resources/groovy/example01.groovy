#!/usr/bin/env groovy

File f = new File('example01.groovy')

f.readLines().indexed().collect { lineNr, line ->
	println "line $lineNr: $line"
}
