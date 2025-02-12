package com.level1.exercise8.controller;

import com.level1.exercise8.functional.ReverseMethod;

public class ReverseString {
    public static void run() {
        ReverseMethod reserver = input -> new
                StringBuilder(input).reverse().toString();

        String originalString = "Probando lambda con el reverse";

        String reverseString = reserver.reverse(originalString);

        System.out.println("Cadena original : " + originalString);
        System.out.println("Cadena invertida : " + reverseString);
    }
}
