package org.fasttrackit;

public class TemperatureConverter

{

    //a.
    //1.creati doua metode care sa primeasca o valoare numerica (temperatura)
    //si sa o transforme din Celsius in Fahrenheit
    //2.creati doua metode care sa primeasca o valoare numerica (temperatura)
    //si sa o transforme din Fahrenheit in Celsius
    //3. Apelati fiecare metoda din main () cu diferite valor.
    //Metodele ar trebui sa afiseze valorile inainte si dupa conversie

    //b.
    //1.creati o singura metoda care sa primeasca temperatura (numeric) si tipul de temperatura dorit (string)
    //si sa realizeze conversia necesara
    //2.Apelati metoda din main pentru fiecare caz

    //Formulele sunt
    // C = (F-32) * 5 / 9
    // F = (C* 9/5) + 32



    TemperatureConverter temperatureConverter = new TemperatureConverter();
    double celsius;
    double fahrenheit;

    public static void main (String [] args) {

    convertToCelsius(30);
    convertToFahrenheit(20);

    }


    public static void convertToCelsius (double fahrenheit) {
        double c = (fahrenheit-32)*5/9;
        System.out.println(c);
    }

    public static void convertToFahrenheit (double celsius) {
        double f = (celsius*9/5) + 32;
        System.out.println(f);
    }



}
