package org.example.java;

import java.util.*;

public class ElementCounter {
    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer element : list) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> result = countElements(list);
        System.out.println(result);
    }
}
