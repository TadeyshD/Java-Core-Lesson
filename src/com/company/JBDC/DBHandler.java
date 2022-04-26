package com.company.JBDC;

import org.sqlite.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBHandler { //создаём коннект к БД
    private static final String PATH_TO_DB = "jdbc:sqlite:university.db";
    private Connection connection;

    public DBHandler() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        this.connection = DriverManager.getConnection(PATH_TO_DB);
    }

    public void addStudents(Student student) {
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(
                "INSERT INTO students(name, age, faculty) VALUES (?, ?, ?)"
        )) {
            preparedStatement.setObject(1, student.getName());
            preparedStatement.setObject(2, student.getAge());
            preparedStatement.setObject(3, student.getFaculty());
            preparedStatement.execute();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Statement statement = this.connection.createStatement()) {
           ResultSet resultSet = statement.executeQuery("SELECT name, age, faculty FROM students");
            while (resultSet.next()){
                Student student = new Student();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }
}