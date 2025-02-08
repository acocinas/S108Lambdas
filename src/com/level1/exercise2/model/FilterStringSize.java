package com.level1.exercise2.model;

import java.util.*;
import java.util.stream.Collectors;


public class FilterStringSize {
    public static void run(){
        List<String> words = Arrays.asList("Java", "C","Python", "PHP", "JavaScript", "Go",
                "HTML", "Swift", "Kotlin", "Objective-C");

        System.out.println("Esta es la lista original:\n" + words);


        List<String> filteredWords = words.stream()
                .filter(word -> word.toLowerCase().contains("o") && word.length() > 5)
                .collect(Collectors.toList());

        System.out.println("\nEsta es la lista filtrada por la letra 'o' :\n" + filteredWords);

    }
}
