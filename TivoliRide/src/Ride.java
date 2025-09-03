package Lesson04.Exercise;

import java.util.Scanner;

public class Ride {
    long minHeight;
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
    }

    public double getHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your height in centimeters?: ");
        return sc.nextDouble();
    }
    public boolean heightCheck() {
        boolean tallEnough;
        tallEnough = getHeight() > minHeight;
        return tallEnough;
    }
    public void startRide(Ride ride) {
        if (heightCheck()) {
            System.out.println("You're tall enough");
        }  else {
            System.out.println("Too small sonny boy");
            System.out.println();
            while(!heightCheck()) {
                System.out.println("You are not tall enough - input another height?");
                ride.getHeight();
            }
        }
        System.out.println("Initializing Tivoli Ride...");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Weeeeeeeeeeeeeeeee!");
    }



}
