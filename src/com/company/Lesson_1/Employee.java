package com.company.Lesson_1;

public class Employee {
    String name;            //создаём класс сотрудника;
    String profession;
    int age;
    int salary;

    Employee(String name, String profession, int age, int salary){
        this.name = name;
        this.profession = profession;
        this.age = age;
        this.salary = salary;
        this.getBonus();
        System.out.println("Работник создан в системе");
    }


    public void getBonus() {   //добавляем метод, который будет умножать зарплату на 2;
        System.out.println(salary * 2);
    }
}
