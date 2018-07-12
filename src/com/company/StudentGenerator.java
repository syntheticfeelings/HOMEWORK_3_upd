package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StudentGenerator {

    List<Student> students = new ArrayList<>();

    public StudentGenerator() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Student.Surname surname = getRandomSurname();
            Student.Name name = getRandomName();
            Student.Group group = getRandomGroup();
            students.add(new Student(random.nextInt(40) + 10, surname, name,group));
        }
    }


    private Student.Surname getRandomSurname() {
        Random random = new Random();
        if (random.nextInt(5) == 0) {
            return User.Surname.PETROV;
        }
        if (random.nextInt(5) == 1) {
            return User.Surname.IVANOV;
        }
        if (random.nextInt(5) == 2) {
            return User.Surname.ZUBKOV;
        }
        if (random.nextInt(5) == 3) {
            return User.Surname.VASILIEV;
        }
        if (random.nextInt(5) == 4) {
            return User.Surname.GOLUBKOV;
        } else {
            return User.Surname.DUBKOV;
        }
    }

    private Student.Name getRandomName() {
        Random random = new Random();
        if (random.nextInt(5) == 0) {
            return User.Name.GOSHA;
        }
        if (random.nextInt(5) == 1) {
            return User.Name.GENNADIY;
        }
        if (random.nextInt(5) == 2) {
            return User.Name.IVAN;
        }
        if (random.nextInt(5) == 3) {
            return User.Name.PETYA;
        }
        if (random.nextInt(5) == 4) {
            return User.Name.JORA;
        } else {
            return User.Name.VASYA;
        }
    }

    private Student.Group getRandomGroup() {
        Random random = new Random();
        if (random.nextInt(5) == 0) {
            return Student.Group.C;
        }
        if (random.nextInt(5) == 1) {
            return Student.Group.DESIGN;
        }
        if (random.nextInt(5) == 2) {
            return Student.Group.FRONTEND;
        }
        if (random.nextInt(5) == 3) {
            return Student.Group.JAVA;
        }
        if (random.nextInt(5) == 4) {
            return Student.Group.PYTHON;
        } else {
            return Student.Group.QA;
        }
    }



    public void listStudents() {
        Collections.sort(students);
        System.out.println("Students : " + students);
    }
}
