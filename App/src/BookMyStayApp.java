// BookMyStayApp.java
import java.util.*;

public class BookMyStayApp {

    // Simple Hotel class to represent hotel data
    static class Hotel {
        String name;
        String location;
        double pricePerNight;
        int availableRooms;

        Hotel(String name, String location, double pricePerNight, int availableRooms) {
            this.name = name;
            this.location = location;
            this.pricePerNight = pricePerNight;
            this.availableRooms = availableRooms;
        }

        @Override
        public String toString() {
            return name + " - " + location + " | Price: ₹" + pricePerNight + " | Rooms: " + availableRooms;
        }
    }

    // Reservation class
    static class Reservation {
        String customerName;
        Hotel hotel;
        int nights;

        Reservation(String customerName, Hotel hotel, int nights) {
            this.customerName = customerName;
            this.hotel = hotel;
            this.nights = nights;
        }

        double getTotalCost() {
            return nights * hotel.pricePerNight;
        }

        @Override
        public String toString() {
            return "Reservation for " + customerName + " at " + hotel.name +
                    " for " + nights + " nights. Total: ₹" + getTotalCost();
        }
    }

    // Main use case logic
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample hotel data
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel("Ocean View Resort", "Goa", 3500, 5));
        hotels.add(new Hotel("Mountain Retreat", "Manali", 2800, 3));
        hotels.add(new Hotel("City Lights Hotel", "Chennai", 2200, 10));

        List<Reservation> reservations = new ArrayList<>();

        System.out.println("=== Welcome to BookMyStay App ===");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Search Hotels");
            System.out.println("2. Book a Room");
            System.out.println("3. View Reservations");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Available Hotels:");
                    for (int i = 0; i < hotels.size(); i++) {
                        System.out.println((i + 1) + ". " + hotels.get(i));
                    }
                    break;

                case 2:
                    System.out.print("Enter your name: ");
                    String customerName = sc.nextLine();

                    System.out.println("Select a hotel by number:");
                    for (int i = 0; i < hotels.size(); i++) {
                        System.out.println((i + 1) + ". " + hotels.get(i));
                    }
                    int hotelChoice = sc.nextInt();
                    sc.nextLine();

                    if (hotelChoice < 1 || hotelChoice > hotels.size()) {
                        System.out.println("Invalid choice!");
                        break;
                    }

                    Hotel selectedHotel = hotels.get(hotelChoice - 1);

                    if (selectedHotel.availableRooms <= 0) {
                        System.out.println("Sorry, no rooms available at " + selectedHotel.name);
                        break;
                    }

                    System.out.print("Enter number of nights: ");
                    int nights = sc.nextInt();
                    sc.nextLine();

                    Reservation reservation = new Reservation(customerName, selectedHotel, nights);
                    reservations.add(reservation);
                    selectedHotel.availableRooms--;

                    System.out.println("Booking successful!");
                    System.out.println(reservation);
                    break;

                case 3:
                    if (reservations.isEmpty()) {
                        System.out.println("No reservations found.");
                    } else {
                        System.out.println("Your Reservations:");
                        for (Reservation r : reservations) {
                            System.out.println(r);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using BookMyStay App. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}