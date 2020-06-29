package com.company.People;

public class Customer extends Person{
    public String favMark1;
    public String favMark2;
    public String favCarType;
    public Integer condition;
    // if condition 1-10damaged  11-30 suspension and breaks damaged  31-50 body damaged 51-100 goodcondition

    public Customer(String name, String surname, Double money,
                    String favMark1, String favMark2, String favCarType,
                    Integer condition) {
        super(name, surname, money);
        this.favMark1 = favMark1;
        this.favMark2 = favMark2;
        this.favCarType = favCarType;
        this.condition = condition;
    }
}
