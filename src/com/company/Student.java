package com.company;

public class Student extends User {

    public enum Group {JAVA, C, PYTHON, QA, DESIGN, FRONTEND}
    private Group group;

    public Student(int years, Surname surname, Name name, Group group) {
        super(years, surname, name);
        this.group=group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "years=" + getYears() +
                ", surname=" + getSurname() +
                ", name=" + getName() + ", Group="+group+
                '}';
    }

    @Override
    public int compareTo(User o) {
        int result =0;
        if (o instanceof Student){
            Student student=(Student)o;
            result=group.compareTo(student.group);
        } if(result==0){
            return super.compareTo(o);
        } else {
            return result;
        }

    }
}
