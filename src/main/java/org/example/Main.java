package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Используем цикл FOR");
         int sum = 0 ;
         for (int i = 0; i <= 163;){
             i = i + 5;
             i--;
             sum = sum + 1;

             if (i>163){
                 System.out.println(sum + " итерация");
                 System.out.println("На последней инерации лифит прошел  " + (5 -(i - 163)) +" этажа и застял, вызывайте мастера" );
             }
         }

        System.out.println();
        System.out.println("Используем цикл WHILE");
         int i = 0;
         sum = 0;
         while (i <= 163) {
             i = i + 5;
             i--;
             sum = sum + 1;
         }
             if (i>163){
                 System.out.println(sum + " итерация");
                 System.out.println("На последней инерации лифит прошел  " + (5 -(i - 163)) +" этажа и застял, вызывайте мастера" );
             }


        System.out.println();
        System.out.println("Используем цикл do WHILE");
        sum = 0;
        i = 0;
        do {
            i = i + 5;
            i--;
            sum = sum + 1;
        }
        while (i <= 163) ;
        if (i>163){
            System.out.println(sum + " итерация");
            System.out.println("На последней инерации лифит прошел  " + (5 -(i - 163)) +" этажа и застял, вызывайте мастера" );
        }










    }
}