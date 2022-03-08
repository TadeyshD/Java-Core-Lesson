package com.company.Lesson_1;

public class EngineerEmployee extends Employee implements MotivationSystem{

    private int fixed;

    EngineerEmployee(String name, int age, int salary) {
        super(name, age, salary);
        this.setProfession("Engineer");
        System.out.println("Работник " + getProfession() + " создан в системе");
    }

@Override
    public void getBonus() {   //переопределение метода с бонусом
        System.out.println(this.getSalary() + (fixed * 400));
    }

@Override
    public void getBonus(int extraBonus){ //перегрузка метода
        System.out.println(this.getSalary() + (fixed * 400) + extraBonus);
    }

    public int getFixed() {
        return fixed;
    }

    public void setFixed(int fixed) {
        this.fixed = fixed;
    }
}
