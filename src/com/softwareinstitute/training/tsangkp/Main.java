package com.softwareinstitute.training.tsangkp;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//this line is a test for committing changes
        for(int attempt = 0; attempt <3; attempt++) {


            Scanner height = new Scanner(System.in);
            Scanner width = new Scanner(System.in);
            Scanner wallcount = new Scanner(System.in);
            Scanner cost = new Scanner(System.in);
            Scanner colour = new Scanner(System.in);


            System.out.println("Enter wall height (in metres):");
            int heightinput = height.nextInt();
            System.out.println("Enter wall width (in metres):");
            int widthinput = width.nextInt();
            System.out.println("How many walls are there to paint?");
            int wallcountin = wallcount.nextInt();
            System.out.println("white,blue,red or yellow paint? (Lowercase)");
            String colourin = colour.nextLine();

            int wallarea = heightinput * widthinput * wallcountin;
            int Paintneeded = wallarea / 6; //1 can covers 6 metres squared

            System.out.println("You have to paint" + " " + wallarea + " " + "metres squared and need" + " " + Paintneeded + "" + " cans of paint");
            if (wallarea > 100) {
                System.out.println("That's a big wall");
            }
            System.out.println("How much does one can of paint cost? (in GBP)");

            int costinput = cost.nextInt();
            float Cancost = Paintneeded * costinput;

            System.out.println("Total cost is £" + Cancost);

            int time = 5;
            String hours;
            switch (time) {
                case 1:
                    hours = "Probably One Hour";
                    break;
                case 2:
                    hours = "A solid Two Hours";
                    break;
                case 3:
                    hours = "Three Big Hours";
                    break;
                default:
                    hours = " This is going to take a while, can't Help you there fella";

                    //switch (time){
                    //case 1:
                    //System.out.println("One hour? No way");
                    // break; }
            }
            System.out.println(hours);

            if (Cancost > 50) {
                System.out.println("That's a lot of paint");
            } else {
                System.out.println("Good luck redecorating!");
            }
        }

    }
}

