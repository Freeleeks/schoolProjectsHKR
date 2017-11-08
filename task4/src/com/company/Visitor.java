package com.company;

public class Visitor {
    private String name;
    private String companyName;

    public Visitor(String name, String companyName) {
        this.name = name;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    /*@Override
    public String toString() {
        return "Confernce" + "              " + name +
                " \n" + "(Visitor)" + "             " + companyName + "\n"+"\n";
    }*/
}
