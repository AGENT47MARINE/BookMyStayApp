/**
 * BookMyStay Application
 * Demonstrates room modeling using abstraction and inheritance.
 *
 * @author AGENT47MARINE
 * @version 1.1.0
 */

abstract class Room {

    protected String roomType;
    protected int beds;
    protected double pricePerNight;

    public Room(String roomType, int beds, double pricePerNight) {
        this.roomType = roomType;
        this.beds = beds;
        this.pricePerNight = pricePerNight;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Price per Night: ₹" + pricePerNight);
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 1500);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 2500);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 5000);
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        // UC1 – Welcome Page
        System.out.println("=== Welcome to BookMyStay ===");
        System.out.println("Hotel Booking System v1.1.0\n");

        // UC2 – Room Modeling
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("Available Room Types:\n");

        single.displayDetails();
        System.out.println("Available Rooms: " + singleAvailable + "\n");

        doubleRoom.displayDetails();
        System.out.println("Available Rooms: " + doubleAvailable + "\n");

        suite.displayDetails();
        System.out.println("Available Rooms: " + suiteAvailable + "\n");

        System.out.println("Application Finished.");
    }
}