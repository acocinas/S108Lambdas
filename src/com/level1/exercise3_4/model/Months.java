package com.level1.exercise3_4.model;

import java.util.Arrays;
import java.util.List;

public class Months {
    public static void run() {
        List<String> months = Arrays.asList("Enero", "Febrero", "Marzo",
                "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre");

        //Exercise3
        System.out.println("Ejercicio 3");
        months.forEach(month -> System.out.println(month));
        //Exercise4
        System.out.println("\nAhora el ejercicio 4 con method reference:");
        months.forEach(System.out::println);

    }
}
