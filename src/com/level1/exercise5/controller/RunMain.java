package com.level1.exercise5.controller;

import com.level1.exercise5.functional.PiValue;

public class RunMain {
    public static void run (){

        PiValue piValue = () -> 3.1415;

        double pi = piValue.getPiValue();
        System.out.println("El valor de PiValue es: " + pi);
    }
}
