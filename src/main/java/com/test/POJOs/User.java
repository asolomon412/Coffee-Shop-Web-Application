package com.test.POJOs;

import java.util.Arrays;

/**
 * Created by user on 7/21/2017.
 */
public class User extends Person {
    private String password;
    private String userName;
    private String[] coffeePrefs;


    public String[] getCoffeePrefs() {
        return coffeePrefs;
    }

    public void setCoffeePrefs(String[] coffeePrefs) {
        this.coffeePrefs = coffeePrefs;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                ", password='" + password + '\''
                + '\'' +
                ", coffeePrefs=" + Arrays.toString(coffeePrefs);
    }
}
