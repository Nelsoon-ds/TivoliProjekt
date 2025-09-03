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
        // Tager brugerens input til brug i vores Ride array.
        // Vi bruger derefter bruger inputtet til at vælge det korrekte index i rides arrayet
        // Derefter printer vi hvilken forlystelse man har valgt + dens metode showName
        // Afslutningsvist så kalder vi den specifikke rides startRide funktion.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number corresponding to your desired ride: ");
        int input = sc.nextInt();
        if (input > 0 && input <= rides.length) {
            Ride selectedRide = rides[input - 1];
            System.out.println("Selected ride: " + selectedRide.showName());
            selectedRide.startRide(selectedRide);
        }
    }

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
}
