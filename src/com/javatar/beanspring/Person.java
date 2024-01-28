package com.javatar.beanspring;

public class Person {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createdTable() {
        System.out.println("Created Table");
    }

    public void connectionClose(){
        System.out.println("Connection Close");
    }
}