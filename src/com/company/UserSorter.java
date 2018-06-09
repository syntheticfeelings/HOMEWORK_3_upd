package com.company;

import java.util.Comparator;

public abstract class UserSorter implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int result;
        if (o1.getSurname() != o2.getSurname()) {
            if (o1.getSurname() == User.Surname.IVANOV && o2.getSurname() == User.Surname.DUBKOV) {
                result = -1;
            } else {
                result = +1;
            }
        } else {
            result = Integer.compare(o1.getYears(), o2.getYears());
        }
        return result;
    }

}