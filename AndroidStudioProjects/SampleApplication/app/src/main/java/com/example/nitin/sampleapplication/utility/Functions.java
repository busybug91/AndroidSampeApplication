package com.example.nitin.sampleapplication.utility;

import com.example.nitin.sampleapplication.model.User;

import java.util.ArrayList;

/**
 * Created by nitin on 8/10/14.
 */
public class Functions {

    public static ArrayList<User> getSampleUsers(int n) {
        ArrayList<User> users = new ArrayList<User>();
        for (int i = 0; i < n; i++) {
            char name = (char) (65 + i);
            users.add(new User("Computer Science", i, String.valueOf(name)));
        }
        return users;
    }
}
