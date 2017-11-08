package com.company;

public class AquaticAnimal extends Animal {
    private int numbOfFins;

    public AquaticAnimal(String name, int numbOfFins) {
        super(name);
        this.numbOfFins = numbOfFins;
    }

    public int getNumbOfFins() {
        return numbOfFins;
    }

    public void setNumbOfFins(int numbOfFins) {
        this.numbOfFins = numbOfFins;
    }

    @Override
    public String toString() {
        return "Name : " + getName() + " , " +
                "Number of fins : " + numbOfFins + "\n";
    }
}
