package com.adincuff;

public class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Boolean isAnAdult() {
        return age >= 18;
    }

    public String getName() {
        return name.toUpperCase();
    }
}
