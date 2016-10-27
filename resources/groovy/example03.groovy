
def leesplankje = ['aap', 'noot', 'mies', 'wim', 'zus', 'jet', 'teun']

println '\nKlassieke Java-style for-loop:'
for (int i = 0; i < leesplankje.size(); i++) {
	print '  '; println leesplankje[i];
}

println '\nHybride Java/Groovy-style for-loop met Groovy range:'
for (String woord in leesplankje) {
	print '  '; println woord

}

println '\nGroovy-style iteratie: each-method met closure'
leesplankje.each() { woord ->
	print '  '; println woord
}

