package org.example;

public class Main {
    public static void main(String[] args) {
        double celsius= 25;//temperatur i celsius
        double fahrenheit= (celsius * 1.8) + 32;//omvandla celsius till fahrenheit
        double kelvin= celsius + 273.15; // omvandla celsius till kelvin

        // utskrift

        System.out.println("Celsius: " + celsius + " grader");
        System.out.println("Fahrenheit: " + fahrenheit+" grader");
        System.out.println("Kelvin:  " + kelvin + " grader");


    }
}