package com.company.Lesson_2;

import java.io.IOException;
import java.util.Scanner;

public class Lesson_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String variant;
        do {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            variant = scanner.next();

            int[] ourNums = {a, b};

        if (variant.equals("1")){ //equals - сравнение
            System.out.println(sum(ourNums));
        } else if (variant.equals("2")){
            System.out.println(minus(ourNums));
        } else if (variant.equals("3")){
            System.out.println(multiply(ourNums));
        } else if (variant.equals("4")) {
            try {
                System.out.println(divide(ourNums));
            } catch (ArithmeticException ae) { //создаём исключение
                ae.printStackTrace();
                System.out.println("Вы сделали хрень");
            } catch (ArrayIndexOutOfBoundsException ae){
                System.out.println(a + " " + b);
                ae.printStackTrace();
                System.out.println("Ты чево наделол..");
            } finally { //финальная команда (сюрприз).
                System.out.println("я обязательно выполнюсь");
            }
        }else if (variant.equals("5")){
            try {
                System.out.println(divideAsFormula(ourNums));
            } catch (MyCalculusException e) {
                e.printStackTrace();
            }

        } else if(variant.equals("6")){
            break;
        }
        else {
            System.out.println("Вы ввели не то");
        }

        }
        while (true);
        System.out.println("Спасибо за драники.");
        System.out.println("Поддержи проект и дай пять тыщ.");
        }
        public static int sum(int[] arr){
            return arr[0] + arr[1];
        }
        public static int minus(int[] arr){
            return arr[0] - arr[1];
    }
        public static int multiply(int[] arr){
            return arr[0] * arr[1];
    }
        public static int divide(int[] arr){
            return arr[0] / arr[1];
    }
    public static int divideAsFormula(int[] arr) throws MyCalculusException {

        Integer integer;
        //Класс Integer упаковывает значение примитивного типа int в объект.
        // Объект типа Integer содержит одно поле типа int.
        if (arr[1] == 7){
            throw new MyCalculusException("Hello there");
        } // создаём новое исключение, своё собственное, родное, воот
            // throw new ArithmeticException();

            //Сигналы о том, что произошло какое-то исключение ввода-вывода.
            // Этот класс является общим классом исключений,
            // создаваемых неудачными или прерванными операциями ввода-вывода.


        return (arr[0] + 2) - arr[1];
    }
}