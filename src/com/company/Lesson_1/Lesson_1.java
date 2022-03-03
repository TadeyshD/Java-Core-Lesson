package com.company.Lesson_1;

public class Lesson_1 {
    public static void main(String[] args) {
    Employee employee = new Employee(); //создаём объект класса;
        employee.name = "Slava";
        employee.age = 35;
        employee.salary = 8000;

        employee.profession = "cleaner";  //прсваиваем метод
        System.out.println(employee.name);
        employee.getBonus();

        Employee employee2 = new Employee(); //создаём объект класса;
        employee2.name = "Andrei";
        employee2.age = 22;
        employee2.salary = 10000;
        employee2.profession = "cleaner";


        employee2.getBonus();


    }

}
