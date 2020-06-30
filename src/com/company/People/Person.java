package com.company.People;

public abstract class Person {
    public String name;
    public String surname;
    protected Integer money;

    public Person(){
    }
    public Person(String name, String surname,Integer money){
        this.name = name;
        this.surname = surname;
        this.money = money;
    }
}
