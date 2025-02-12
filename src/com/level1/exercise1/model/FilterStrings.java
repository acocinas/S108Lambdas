package com.level1.exercise1.model;

import java.util.*;
import java.util.stream.Collectors;

public class FilterStrings {
    public static void run(){
        List<String> words = Arrays.asList("Backend Developer", "Frontend Developer","Data Science",
                "QA Tester", "Full Stack Developer", "Security Analyst",
                "Engineer DevOps", "System Analyst", "Project Manager");

        System.out.println("Esta es la lista original:\n" + words);

        List<String> filteredWords = words.stream()
                .filter(word -> word.contains("o"))
                .collect(Collectors.toList());

        System.out.println("\nEsta es la lista filtrada por la letra 'o' :\n" + filteredWords);

        List<String> filteredWords2 = words.stream()
                .filter(word -> word.toLowerCase().contains("o"))
                .collect(Collectors.toList());

        System.out.println("\nEsta es la lista filtrada por la letra 'o' independientemente " +
                "sea mayúscula o minúscula:\n" + filteredWords2);

    }
}
