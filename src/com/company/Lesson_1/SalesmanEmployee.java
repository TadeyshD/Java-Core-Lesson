package com.company.Lesson_1;

public class SalesmanEmployee extends Employee implements DemotivationSystem, MotivationSystem{

    private int sales;

    SalesmanEmployee(String name, int age, int salary){
        super(name, age, salary);
        this.setProfession("Salesman");
        System.out.println("Работник " + getProfession() + " создан в системе");
    }
@Override
    public void getBonus() {   //добавляем метод, который будет умножать зарплату на 2;
        System.out.println(this.getSalary() + (sales * 4000));
    }

    @Override
    public void getBonus(int extraBonus){
        System.out.println(this.getSalary() + (sales * 4000) + extraBonus);
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
    @Override
    public void getTax(){
        System.out.println("-10к");
    }
}

