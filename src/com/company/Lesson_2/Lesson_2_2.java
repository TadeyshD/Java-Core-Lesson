package com.company.Lesson_2;

import java.util.Scanner;

public class Lesson_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String variant;
        do {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            variant = scanner.next();

        if (variant.equals("1")){ //equals - сравнение
            System.out.println(a + b);
        } else if (variant.equals("2")){
            System.out.println(a -b);
        } else if (variant.equals("3")){
            System.out.println(a * b);
        } else if (variant.equals("4")) {
            try {
                System.out.println(a / b);
            } catch (ArithmeticException ae) { //создаём исключение
                System.out.println("Вы сделали хрень");
            }
        }else if (variant.equals("5")){
            break;
        } else {
            System.out.println("Вы ввели не то");
        }

        }
        while (true);
        System.out.println("Спасибо за драники.");
        System.out.println("Поддержи проект и дай пять тыщ.");
        }
}