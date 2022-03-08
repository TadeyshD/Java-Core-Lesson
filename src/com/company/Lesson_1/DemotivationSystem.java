package com.company.Lesson_1;

public interface DemotivationSystem {

    default void sayAtata(){
        System.out.println("Atata");
    }


    void getTax();

    private void saySomething(String message){
        System.out.println(message);
    }
}
