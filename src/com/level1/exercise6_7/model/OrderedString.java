package com.level1.exercise6_7.model;

import java.util.*;
import java.util.stream.Collectors;

public class OrderedString {
    public static void orderedString (){

        List<Object> list = new ArrayList<>();
        list.add(46);
        list.add("Esto es");
        list.add(79);
        list.add("para probar");
        list.add("que funciona correctamente ");
        list.add(427);
        list.add("el tema de las lambdas");
        list.add("y punto");
        list.add(1986);

        System.out.println("\nImprimimos la lista entera antes de filtrar:\n" + list);

        //Exercise6
        List<String> orderedString = list.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj)
                .sorted((s1 , s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());

        System.out.println("\nAhora imprimimos las cadenas ordenadas de mayor a menor, ejercicio 6");
        orderedString.forEach(System.out::println);

        //Exercise7
        List<String> orderedString2 = list.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj)
                .sorted((s1 , s2) -> Integer.compare(s2.length(), s1.length()))
                .collect(Collectors.toList());

        System.out.println("\nAhora imprimimos las cadenas ordenadas de menor a mayor, ejercicio 7");
        orderedString2.forEach(System.out::println);

    }
}
