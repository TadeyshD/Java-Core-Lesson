package com.company.Lesson_3;

import java.lang.reflect.Type;

public class Lesson_3 {
    public static void main(String[] args) {

Employee employee = new Employee();
        employee.param[0] = 15;
        employee.param[1] = 20;
        employee.param[2] = 35;
        employee.param[3] = 15;

        System.out.println(employee.param[0]);
        System.out.println(employee.param[1]);
        System.out.println(employee.param[2]);
        System.out.println(employee.param[3]);
        System.out.println();
        for (int i = 0; i < 4; i++){
            System.out.println((Integer) employee.param[i] * 2);
        }


//        Employee<String> employee = new Employee<>(); //делаем параметр строковым
//        employee.param = "String";
//        System.out.println(employee.param);
//
//        Employee<Integer> employee2 = new Employee<>(); //делаем параметр интовым
//        employee2.param = 15;
//        System.out.println(employee2.param);
    MyArray<String> myArray = new MyArray<>();
        myArray.add("Slava1");
        myArray.add("Slava2");
        myArray.add("Slava3");
        myArray.add("Slava4");
        myArray.add("Slava5");
        myArray.add("Slava6");
        myArray.add("Slava7");
        myArray.add("Slava8");
        myArray.add("Slava9");


        }
    }


