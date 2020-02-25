package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro (int value) {
        return value / 70;
    }

    public static int rubleToDollar (int value) {
        return value / 60;
    }

    public static int euroToRuble (int value) {
        return value * 70;
    }

    public static int dollarToRuble (int value) {
        return value * 60;
    }

        public static void main (String[]args) {
       int euro = rubleToEuro(140);
       System.out.println("140 rubles are " + euro + " euro.");
        int dollar = rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
        int ruble = euroToRuble(4);
        System.out.println("4 euro are " + ruble + " rubles.");
        int rubles = dollarToRuble(5);
        System.out.println("5 dollars are " + ruble + " rubles.");

   int in = 140;
   int expected = 2;
   int out = rubleToEuro (in);
   boolean passed = expected == out;
   System.out.println("140 rubles are 2 euro/ Test result: " + passed);

   int in1 = 180;
   int expected1 = 3;
   int out1 = rubleToDollar(in);
   boolean passed1 = expected1 == out1;
   System.out.println("180 rubles are 3 dollars/ Test result: " + passed1);

   int in2 = 4;
   int expected2 = 280;
   int out2 = euroToRuble(in2);
   boolean passed2 = expected2 == out2;
   System.out.println("280 rubles are 4 euro/ Test result: " + passed2);

   int in3 = 5;
   int expected3 = 300;
   int out3 = dollarToRuble(in3);
   boolean passed3 = expected3 == out3;
   System.out.println("300 rubles are 5 dollars/ Test result: " + passed3);


    }
    }

