package com.company.People;

public abstract class Person {
    public String name;
    public String surname;
    protected Double money;

    public Person(){
    }
    public Person(String name, String surname,Double money){
        this.name = name;
        this.surname = surname;
        this.money = money;
    }
}
