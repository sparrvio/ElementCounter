package com.example

class CountElements {
    static def countElementsGroovy(List<Integer> list) {
        def result = [:]
        list?.each { element ->
            result[element] = result.getOrDefault(element, 0) + 1
        }
        result
    }

    static HashMap<Integer, Integer> countElementsJava(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null")
        }
        if (list.isEmpty()) {
            return new HashMap<>()
        }

        HashMap<Integer, Integer> result = new HashMap<>()

        for (Integer element : list) {
            result.put(element, result.getOrDefault(element, 0) + 1)
        }
        return result
    }
}