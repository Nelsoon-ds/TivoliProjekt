package Lesson04.Exercise;

import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        makeRide();
        chooseRide();

    }
    // method:
    public static void chooseRide() {
        System.out.println("Choose a ride to go on!");
        System.out.println("Available rides: ");
        for(int i = 0; i < Ride.getCounter(); i++) {
            System.out.println(i+1 + ": " + rides[i]);
        }
        System.out.println("Please input the number corresponding to your desired ride: ");
        int input = sc.nextInt();

        if(input == 1){
            r1.startRide();
        }
        if(input == 2){
            Ride.startRide();
        }
        if(input == 3){
            Ride.startRide();
        }else{
            System.out.println("Invalid input!");
        }

1
    }

    static Scanner sc = new Scanner(System.in);


    static String[] rides = new String[3];
    public static void makeRide() {
        Lesson04.Exercise.Ride r1 = new Lesson04.Exercise.Ride(140, "Tower of Terror");
        Lesson04.Exercise.Ride r2 = new Lesson04.Exercise.Ride(130, "Lego Racer");
        Lesson04.Exercise.Ride r3 = new Lesson04.Exercise.Ride(120, "Red Devil");
        rides[0] = r1.showName();
        rides[1] = r2.showName();
        rides[2] = r3.showName();


    }




    // method:
    public void printResult() {
    }
}
