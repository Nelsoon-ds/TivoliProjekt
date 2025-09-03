package Lesson04.Exercise;

import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        Ride[] allRides = makeRide();
        chooseRide(allRides);
    }
    // method:
    public static void chooseRide(Ride[] rides) {
        System.out.println("Choose a ride to go on!");
        System.out.println("Available rides: ");
        for (int i = 0; i < Ride.getCounter(); i++) {
            System.out.println(i + 1 + ": " + rides[i].showName());
        }
        System.out.println("Please input the number corresponding to your desired ride: ");
        int input = sc.nextInt();

        if (input > 0 && input <= rides.length) {
            Ride selectedRide = rides[input - 1];
            System.out.println("Selected ride: " + selectedRide.showName());
            selectedRide.startRide();
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static Ride[] makeRide() {
        Ride[] allRides = new Ride[3];
        Ride r1 = new Ride(140, "Tower of Terror");
        Ride r2 = new Ride(130, "Lego Racer");
        Ride r3 = new Ride(120, "Red Devil");

        allRides[0] = r1;
        allRides[1] = r2;
        allRides[2] = r3;
        return allRides;
    }

    // method:
    public void printResult() {
    }
}
