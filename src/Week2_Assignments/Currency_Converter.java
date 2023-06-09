package Week2_Assignments;

import java.util.Scanner;

public class Currency_Converter {
    public static void main(String[] args) {
 
        System.out.println("*****************CURRENCY CONVERTER*************");
        System.out.println("SELECT AN OPTION: - ");
        System.out.println("1.Rupees");
        System.out.println("2.Euro");
        System.out.println("3.Dollar");
        System.out.println("4.Yuan");
 
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println("ENTER AMOUNT :");
        double amount = sc.nextDouble();
 
      //choosing option
        switch (option) {
            case 1:
                rupees_Converter(amount);
                break;
            case 2:
                euro_Converter(amount);
                break;
            case 3:
                dollar_Converter(amount);
                break;
            case 4:
                yuan_Converter(amount);
                break;
            default:
                System.out.println("Wrong choice! choose option from 1,2,3 or 4");
        }
 
        sc.close();
 
    }
 
    public static void rupees_Converter(double amt) {
        System.out.println("1 rupees = " + 0.013 + " dollar");
        System.out.println(amt + " rupees = " + (amt * 0.013) + " dollar");
        System.out.println("*********************************************");
 
        System.out.println("1 rupees = " + 0.012 + " Euro");
        System.out.println(amt + " rupees = " + (amt * 0.012) + " Euro");
        System.out.println("*********************************************");
 
        System.out.println("1 rupees = " + 0.085 + " Yuan");
        System.out.println(amt + " rupees = " + (amt * 0.085) + " Yuan");
        System.out.println("*********************************************");
 
    }
 
    public static void yuan_Converter(double amt) {
        System.out.println("1 Yuan = " + 0.14 + " dollar");
        System.out.println(amt + " Yuan = " + (amt * 0.14) + " dollar");
        System.out.println("*********************************************");
 
        System.out.println("1 Yuan = " + 0.13 + " Euro");
        System.out.println(amt + " Yuan = " + (amt * 0.13) + " Euro");
        System.out.println("*********************************************");
 
        System.out.println("1 Yuan = " + 11.80 + " rupees");
        System.out.println(amt + " Yuan = " + (amt * 11.80) + " rupees");
        System.out.println("*********************************************");
 
    }
 
    public static void dollar_Converter(double amt) {
        System.out.println("1 dollar = " + 79.37 + " rupees");
        System.out.println(amt + " dollar = " + (amt * 79.37) + " rupees");
        System.out.println("*********************************************");
 
        System.out.println("1 dollar= " + 0.98 + " Euro");
        System.out.println(amt + " dollar = " + (amt * 0.98) + " Euro");
        System.out.println("*********************************************");
 
        System.out.println("1 dollar = " + 6.92 + " Yuan");
        System.out.println(amt + " dollar = " + (amt * 6.92) + " Yuan");
        System.out.println("*********************************************");
    }
 
    public static void euro_Converter(double amt) {
        System.out.println("1 Euro = " + 80.85 + " rupees");
        System.out.println(amt + " Euro = " + (amt * 80.85) + " rupees");
        System.out.println("*********************************************");
 
        System.out.println("1 Euro = " + 1.02 + " dollar");
        System.out.println(amt + " Euro = " + (amt * 1.02) + " dollar");
        System.out.println("*********************************************");
        System.out.println("1 Euro = " + 7.63 + " Yuan");
        System.out.println(amt + " Euro = " + (amt * 7.63) + " Yuan");
        System.out.println("*********************************************");
    }
    }