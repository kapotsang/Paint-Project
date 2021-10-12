package com.softwareinstitute.training.tsangkp;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//this line is a test for committing changes
        Scanner height = new Scanner(System.in);
        Scanner width = new Scanner(System.in);
        Scanner wallcount = new Scanner(System.in);
        Scanner cost = new Scanner(System.in);

        System.out.println("Enter wall height (in metres):");
        int heightinput = height.nextInt();
        System.out.println("Enter wall width (in metres):");
        int widthinput =  width.nextInt();
        System.out.println("How many walls are there to paint?");
        int wallcountin = wallcount.nextInt();

int wallarea = heightinput * widthinput * wallcountin;
int Paintneeded = wallarea / 6; //1 can covers 6 metres squared

        System.out.println("You have to paint" + " " + wallarea + " " + "metres squared and need" + " " + Paintneeded + "" + " cans of paint" );
        if (wallarea > 100){
            System.out.println("That's a big wall");
        }
        System.out.println("How much does one can of paint cost? (in GBP)");

        int costinput = cost.nextInt();
        float Cancost = Paintneeded * costinput;

        System.out.println("Total cost is £" + Cancost);
        if (Cancost > 50){
            System.out.println("That's a lot of paint");
        }

    }
}
