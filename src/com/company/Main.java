package com.company;

public class Main {

    public static void main(String[] args) {
        UserGenerator userGenerator = new UserGenerator();
        userGenerator.listUsers();
        StudentGenerator studentGenerator = new StudentGenerator();
        studentGenerator.listStudents();

    }
}