package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Animal> animalsInTheZoo = new ArrayList<>();
    Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Main myZooApp = new Main();
        int menuChoice = 0;
        boolean runPlease = true;
        do {
            myZooApp.menuOptions();
            menuChoice = myZooApp.userInput.nextInt();
            switch (menuChoice) {
                case 1:
                    myZooApp.addnewTerAnimal();
                    break;
                case 2:
                    myZooApp.addNewAquAnimal();
                    break;
                case 3:
                    myZooApp.viewAnimals();

                    break;
                case 4:
                    System.out.println(" Have a nice day ");
                    runPlease = false;
                    break;
                default:
                    System.out.println(" wrong input pick again please! ");
            }
        } while (runPlease);
    }

    public void menuOptions() {
        System.out.println("-- Welcome to the Kristianstad's awesome zoo cataloging app! -- ");
        System.out.println("(1.) Add a terrestrial animal ");
        System.out.println("(2.) Add a aquatic animal ");
        System.out.println("(3.) View all animals ");
        System.out.println("(4.) Exit ");
    }

    public void addnewTerAnimal() {
        System.out.println("Please enter the name of the animal : ");
        String nameOfTer = userInput.nextLine();
        nameOfTer = userInput.nextLine();
        System.out.println("Please enter the number of legs the animal has : ");
        int numOfLegs = userInput.nextInt();
        TerrestrialAnimal newTerrestrialAnimal = new TerrestrialAnimal(nameOfTer, numOfLegs);
        animalsInTheZoo.add(newTerrestrialAnimal);


    }

    public void addNewAquAnimal() {
        System.out.println("Please enter the name of the animal : ");
        String nameOfAq = userInput.nextLine();
        nameOfAq = userInput.nextLine();
        System.out.println("Please enter the number of fins the animal has : ");
        int numOfFins = userInput.nextInt();
        AquaticAnimal newAquaticAnimal = new AquaticAnimal(nameOfAq, numOfFins);
        animalsInTheZoo.add(newAquaticAnimal);
    }

    public void viewAnimals() {
        System.out.println(animalsInTheZoo);
    }
}
