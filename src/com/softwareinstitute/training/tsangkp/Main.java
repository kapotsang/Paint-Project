package com.softwareinstitute.training.tsangkp;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//this line is a test for committing changes

        boolean playAgain = true;
        int cycle = 1;
        while (playAgain) {
            if (cycle > 3) {
                playAgain = false;
            }

            //for (int attempt = 0; attempt < 3; attempt++) {}


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
            int Cancost = Paintneeded * costinput;

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


        cycle++;

            int[] supplies = new int[3]; //time, area, cancost
            supplies[0] = time ;
            supplies[1] = wallarea ;
            supplies[2] = Cancost;
            //for(int s :supplies){
                //System.out.println(s);
                System.out.println(supplies[0] + " hours");
                System.out.println(supplies[1] + " metres squared");
                System.out.println(supplies[2] + " British Pounds");
            //}

        }
int [][] multidem = {{1,2,3},{5,6,7},{8,9,10}};
        int p = multidem[2][2];
        System.out.println(p);
        System.out.println(multidem.length);

        //int[] enhancedFor = {1,6,4,7,8,10};
        //for (int i =1; i<enhancedFor.length;i++){
        //System.out.println(enhancedFor[i]);
        //}
    }
}

