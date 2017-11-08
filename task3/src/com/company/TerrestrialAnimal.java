package com.company;

public class TerrestrialAnimal extends Animal {
    private int numbOfLegs;

    public TerrestrialAnimal(String name, int numbOfLegs) {
        super(name);
        this.numbOfLegs = numbOfLegs;
    }

    public int getNumbOfLegs() {
        return numbOfLegs;
    }

    public void setNumbOfLegs(int numbOfLegs) {
        this.numbOfLegs = numbOfLegs;
    }


    @Override
    public String toString() {
        return "Name : " + getName() + " , " +
                "Number of legs : " + numbOfLegs + " \n";
    }
}
