package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class UserGenerator {

    List<User> users = new ArrayList<>();

    public UserGenerator() {
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            User.Surname surname = getRandomSurname();
            User.Name name = getRandomName();
            users.add(new User(random.nextInt(40) + 10, surname, name));
        }
    }

    private User.Surname getRandomSurname() {
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

    private User.Name getRandomName() {
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

    


    public void listUsers() {
        Collections.sort(users);
        System.out.println("Apples: " + users);
    }

}