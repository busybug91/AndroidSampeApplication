package com.example.nitin.sampleapplication.model;

/**
 * Created by nitin on 8/10/14.
 */
public class User {
    private String name;
    private int id;
    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public User(String department, int id, String name) {
        this.department = department;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                '}';
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
