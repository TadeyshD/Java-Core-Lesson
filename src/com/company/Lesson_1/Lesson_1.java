package com.company.Lesson_1;

public class Lesson_1 {
    public static void main(String[] args) {
    Employee employee = new Employee("Slave", "cleaner", 35, 8000); //создаём объект класса;

        System.out.println(employee.name);
        employee.getBonus();

        Employee employee2 = new Employee("Andrei", "cleaner", 23, 10000); //создаём объект класса;

        employee2.getBonus();


    }

}
