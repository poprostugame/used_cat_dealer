package com.company.People;

public class Customer extends Person{
    public String favMark1;
    public String favMark2;
    public String favCarType;
    public Double condition;


    public Customer(String name, String surname, String money,
                    String favMark1, String favMark2, String favCarType,
                    Double condition) {
        super(name, surname, money);
        this.favMark1 = favMark1;
        this.favMark2 = favMark2;
        this.favCarType = favCarType;
        this.condition = condition;
    }
}
