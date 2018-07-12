package com.company;


public class User implements Comparable<User> {

    @Override
    public int compareTo(User o) {
        return Integer.compare(this.getYears(), o.getYears());
    }

    public enum Surname {PETROV, IVANOV, GOLUBKOV, ZUBKOV, VASILIEV, DUBKOV}

    public enum Name {VASYA, JORA, PETYA, GOSHA, IVAN, GENNADIY}

    private int years;
    private Surname surname;
    private Name name;

    public User(int years) {
        this.years = years;
    }

    public User(int years, Surname surname, Name name) {
        this.years = years;
        this.surname = surname;
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public Surname getSurname() {
        return surname;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "years=" + years +
                ", surname=" + surname +
                ", name=" + name +
                '}';
    }
}