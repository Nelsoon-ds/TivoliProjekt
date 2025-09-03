package Lesson04.Exercise;

import java.util.Scanner;

public class Ride {
    long minHeight;
    String name;


    public Ride(long minHeight, String name) {
        this.minHeight = minHeight;
        this.name = name;
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
    public boolean heightCheck() {
        boolean tallEnough;
        tallEnough = getHeight() > minHeight;
        return tallEnough;
    }
    public void startRide() {
        if (heightCheck()) {
            System.out.println("You're tall enough");
        }  else {
            System.out.println("Too small sonny boy");
        }
    }



}
