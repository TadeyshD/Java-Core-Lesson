package com.company.Lesson_1;

public class Employee {
    String name;            //создаём класс сотрудника;
    String profession;
    int age;
    int salary;




    public void getBonus() {   //добавляем метод, который будет умножать зарплату на 2;
        System.out.println(salary * 2);
    }
}
