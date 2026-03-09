/**
 * BookMyStay Application
 * Demonstrates centralized inventory management using HashMap.
 *
 * @author AGENT47MARINE
 * @version 1.2.0
 */

import java.util.HashMap;
import java.util.Map;

// Abstract Room class
abstract class Room {

    protected String roomType;
    protected int beds;
    protected double pricePerNight;

    public Room(String roomType, int beds, double pricePerNight) {
        this.roomType = roomType;
        this.beds = beds;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomType() {
        return roomType;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Price per Night: ₹" + pricePerNight);
    }
}

// Concrete Room Types
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

// Inventory Manager
class RoomInventory {

    private HashMap<String, Integer> inventory;

    // Constructor initializes availability
    public RoomInventory() {
        inventory = new HashMap<>();

        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    // Retrieve availability
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Update availability
    public void updateAvailability(String roomType, int newCount) {
        inventory.put(roomType, newCount);
    }

    // Display inventory
    public void displayInventory() {
        System.out.println("\n--- Current Room Inventory ---");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " rooms available");
        }
    }
}

// Main Application
public class BookMyStayApp {

    public static void main(String[] args) {

        // UC1 – Welcome Page
        System.out.println("=== Welcome to BookMyStay ===");
        System.out.println("Hotel Booking System v1.2.0\n");

        // Room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Inventory initialization
        RoomInventory inventory = new RoomInventory();

        // Display room details
        System.out.println("--- Room Details ---\n");

        single.displayDetails();
        System.out.println("Available: " + inventory.getAvailability(single.getRoomType()) + "\n");

        doubleRoom.displayDetails();
        System.out.println("Available: " + inventory.getAvailability(doubleRoom.getRoomType()) + "\n");

        suite.displayDetails();
        System.out.println("Available: " + inventory.getAvailability(suite.getRoomType()) + "\n");

        // Show centralized inventory
        inventory.displayInventory();

        System.out.println("\nApplication Finished.");
    }
}