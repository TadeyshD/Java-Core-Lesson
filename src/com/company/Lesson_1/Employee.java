package com.company.Lesson_1;

public abstract class Employee {
    private String name;            //создаём класс сотрудника;
    private String profession;
    private int age;
    private int salary;
    private static int count = 0; //static - модификатор, который делает переменную общей для всего класса;


//модификаторы доступа:
    //public -> protected -> default -> private
    //public -> из любой точки программы
    //protected -> из одного package или наследники
    //default -> только из одного package
    //private -> только внутри класса

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }




    public int getSalary() {
        return salary;
    }


    public int getCount() {
        return count;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}


