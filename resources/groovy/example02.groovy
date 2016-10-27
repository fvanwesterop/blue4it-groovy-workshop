import groovy.transform.*

@ToString
@TupleConstructor
class Person {
    def firstName
    def lastName
}

def p = new Person('James', 'Gosling')

println p