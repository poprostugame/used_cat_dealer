package com.company.People;

public class Mechanic extends Person{
    public Double chanceToRepair;
    public Double guaranty;
    public Double repairCost;

    public Mechanic(String name, String surname,
                    String money, Double chanceToRepair,
                    Double guaranty, Double repairCost) {
        super(name, surname, money);
        this.chanceToRepair = chanceToRepair;
        this.guaranty = guaranty;
        this.repairCost = repairCost;
    }
}
