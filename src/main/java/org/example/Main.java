package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main (String [] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

public static void checkSumSign() {
        int a = 3;
        int b = 4;

        if (a+b>=0)
         System.out.println("Сумма положительная");
        if (a+b<0)
         System.out.println("Сумма отрицательная");


    }

public static void printColor() {
        int value = 50;
        if (value <=0) {
          System.out.println("Красный");
        }
        if (value>=1 && value<=100) {
          System.out.println("Желтый");
        }
        if (value>=101) {
          System.out.println("Зеленый");
        }
    }

public static void compareNumbers() {
        int a = 15;
        int b = 35;
        if  (a>=b) {
          System.out.println("a >= b");
        }
        if (a<b) {
          System.out.println("a < b");
        }
    }

}