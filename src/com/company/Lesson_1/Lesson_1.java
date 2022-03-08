package com.company.Lesson_1;

public class Lesson_1 {
    public static void main(String[] args) {
    EngineerEmployee employee = new EngineerEmployee("Slave", 25, 8000); //создаём объект класса;
    employee.setFixed(10);
    employee.getBonus();
    employee.getBonus(10000);
        System.out.println(employee.getCount());

        SalesmanEmployee employee2 = new SalesmanEmployee("Andrei", 35, 10000); //создаём объект класса;
        employee2.setSales(10);
        employee2.getBonus();
        employee2.getBonus(10000);
        System.out.println(employee.getCount());
        employee2.sayAtata();


        final int num; //final позволяет создавать константы (запрещает переопределять метод)
        num = 50;
        System.out.println(num);
    }

}
