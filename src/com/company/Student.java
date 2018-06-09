package com.company;

public class Student extends User {

    public enum Group {JAVA, C, PYTHON, QA, DESIGN, FRONTEND}
    private Group group;

    public Student(int years, Surname surname, Name name, Group group) {
        super(years, surname, name);
        this.group=group;
    }
}
