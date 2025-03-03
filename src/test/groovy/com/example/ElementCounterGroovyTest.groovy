package com.example

import spock.lang.Specification

class ElementCounterGroovyTest extends Specification {

    def "countElementsGroovy тест на корректных значениях"() {
        setup:
        def list = [1, 3, 4, 5, 1, 5, 4]

        when:
        def result =  CountElements.countElementsGroovy(list)

        then:
        result == [1: 2, 3: 1, 4: 2, 5: 2]
    }

    def "countElementsGroovy тест на пустой список"() {
        setup:
        def list = []

        when:
        def result = CountElements.countElementsGroovy(list)

        then:
        result == [:]
    }

    def "countElementsGroovy тест на обработку null"() {
        when:
        def result = CountElements.countElementsGroovy(null)

        then:
        result == [:]
    }

    def "countElementsGroovy тест на лист с одним элементом"() {
        setup:
        def list = [42]

        when:
        def result = CountElements.countElementsGroovy(list)

        then:
        result == [42: 1]
    }

    def "countElementsJava тест на корректных значениях"() {
        setup:
        def list = [1, 3, 4, 5, 1, 5, 4]

        when:
        def result = CountElements.countElementsJava(list)

        then:
        result == [1: 2, 3: 1, 4: 2, 5: 2]
    }

    def "countElementsJava тест на пустой список"() {
        setup:
        def list = []

        when:
        def result = CountElements.countElementsJava(list)

        then:
        result == [:]
    }

    def "countElementsJava тест на обработку null"() {
        when:
        CountElements.countElementsJava(null)

        then:
        def exception = thrown (IllegalArgumentException)
        exception.message == "List cannot be null"
    }

    def "countElementsJava тест на лист с одним элементом"() {
        setup:
        def list = [42]

        when:
        def result = CountElements.countElementsJava(list)

        then:
        result == [42: 1]
    }
}
