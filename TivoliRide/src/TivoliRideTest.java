package Lesson04.Exercise;

public class TivoliRideTest {
    public static void main(String[] args) {
        makeRide();
        chooseRide();

    }
    // method:
    public static void chooseRide() {
        System.out.println("Choose a ride to go on!");
        System.out.println("Available rides: ");

    }

    public static void makeRide() {
        Lesson04.Exercise.Ride r1 = new Lesson04.Exercise.Ride(130, "Tower of Terror");
        Lesson04.Exercise.Ride r2 = new Lesson04.Exercise.Ride(130, "Lego Racer");
        Lesson04.Exercise.Ride r3 = new Lesson04.Exercise.Ride(130, "Red Devil");


    }


    // method:
    public void printResult() {
    }
}
