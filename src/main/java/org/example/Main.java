package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String [] args) {
        printThreeWords();
        checkSumSign();
        printCol();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange Banana Apple");
    }

    public static void checkSumSign() {
        int a = 3;
        int b = 4;

    if (a+b>=0)
            System.out.println("sum is positive");
  if (a+b<0)
        System.out.println("sum is negative");


    }

    public static void printCol() {
        int value = 50;
        if (value <=0) {
            System.out.println("red");
        } if (value>0 && value<100) {
            System.out.println("yellow");
        } if (value>100) {
            System.out.println("green");
        }
    }

    public static void compareNumbers() {
        int a = 15;
        int b = 35;
        if  (a>=b) {
            System.out.println("a>=b");
        } if (a<b) {
            System.out.println("a<b");
        }
    }

}
