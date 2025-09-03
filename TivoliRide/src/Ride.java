package Lesson04.Exercise;

import java.util.Scanner;

public class Ride {
    static long minHeight;
    String name;
    static int counter;

    public Ride(long minHeight, String name) {
        this.minHeight = minHeight;
        this.name = name;
        counter++;
    }

    public static int getCounter(){
        return counter;
    }
    public String showName() {
        return this.name;
        //why dis no work?
    }

    public static double getHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your height in centimeters?: ");
        return sc.nextDouble();
    }
    public static boolean heightCheck() {
        boolean tallEnough;
        tallEnough = getHeight() > minHeight;
        return tallEnough;
    }
    public static void startRide() {
        if (heightCheck()) {
            System.out.println("You're tall enough");
        }  else {
            System.out.println("Too small sonny boy");
        }
    }



}
