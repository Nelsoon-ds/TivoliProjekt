package Lesson04.Exercise;

public class TivoliRideTest {
    public static void main(String[] args) {
        makeRide();
    }
    // method:
    public void chooseRide() {
        System.out.println("Choose a ride to go on!");
        System.out.println("Available rides: ");
    }

    public static String[] makeRide() {
        Lesson04.Exercise.Ride r1 = new Lesson04.Exercise.Ride(130, "Tower of Terror");
        Lesson04.Exercise.Ride r2 = new Lesson04.Exercise.Ride(130, "Lego Racer");
        Lesson04.Exercise.Ride r3 = new Lesson04.Exercise.Ride(130, "Red Devil");
        String[] rides = {r1.toString(), r2.toString(), r3.toString()};

        return rides;

    }
    // method:
    public void printResult() {
    }
}
