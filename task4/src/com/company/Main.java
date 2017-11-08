package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Visitor> visitorList = new ArrayList<>();
    Scanner userInput = new Scanner(System.in);
    private String visName;
    private String compName;

    public static void main(String[] args) {
        Main myConfApp = new Main();
        myConfApp.newVisitor();
        myConfApp.printNametags();
    }

    public void newVisitor() {
        System.out.println("Please enter the number of vistors you would like to enter : ");
        int numOfVistors = userInput.nextInt();
        userInput.nextLine();
        for (int i = numOfVistors; i > 0; i--) {
            System.out.println("Please enter vistors Name ");
            //userInput.nextLine();
            visName = userInput.nextLine();
            //userInput.nextLine();
            System.out.println("Please enter the company name for this visitor : ");
            compName = userInput.nextLine();
            Visitor newVisitorObj = new Visitor(visName, compName);
            visitorList.add(newVisitorObj);
        }
    }

    public void printNametags() {
        for (int i = 0; i < visitorList.size(); i++)
            System.out.println("Conference" + "              " + visitorList.get(i).getName() + "\n"
                    + "(Visitor)" + "               " + visitorList.get(i).getCompanyName() + "\n");
    }
}
