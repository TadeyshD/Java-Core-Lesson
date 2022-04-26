package com.company.JBDC;

import java.sql.SQLException;

public class Lesson_8 {
    public static void main(String[] args) {
        Student studentforDB1 = new Student("Andrei", 17, "Mehmat");
        try {
            DBHandler dbHandler = new DBHandler();
            dbHandler.addStudents(studentforDB1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
