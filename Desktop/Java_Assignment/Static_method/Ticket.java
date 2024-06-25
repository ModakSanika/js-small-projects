public class Ticket {
    private static int available_tickets = 100;

    private String dramaName;
    private String dramaTime;
    private String personName;
    private boolean tickets_booked;

    // Constructor to book a ticket and initialize instance variables
    public Ticket(String dramaName, String dramaTime, String personName) {
        this.dramaName = dramaName;
        this.dramaTime = dramaTime;
        this.personName = personName;
        this.tickets_booked = bookTicket(); // Attempt to book a ticket when creating an instance
    }

    // Static method to attempt to book a ticket
    private boolean bookTicket() {
        if (available_tickets > 0) {
            available_tickets--;
            return true; // Ticket successfully booked
        } else {
            return false; // No tickets available
        }
    }

    // Static method to get the remaining tickets
    public static int getRemainingTickets() {
        return available_tickets;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        if (tickets_booked) {
            System.out.println("Seat booked successfully for " + personName + " to watch " + dramaName + " at " + dramaTime);
        } else {
            System.out.println("Sorry, no seats available for " + personName);
        }
    }

    // Main method to demonstrate the class functionality
    public static void main(String[] args) {
        Ticket booking1 = new Ticket("Damsel", "7:00 PM", "Alice");
        booking1.displayBookingDetails();
        System.out.println("Remaining tickets: " + Ticket.getRemainingTickets());

        Ticket booking2 = new Ticket("Damsel", "7:00 PM", "Bob");
        booking2.displayBookingDetails();
        System.out.println("Remaining tickets: " + Ticket.getRemainingTickets());

        Ticket booking3 = new Ticket("Damsel", "7:00 PM", "Charlie");
        booking3.displayBookingDetails();
        System.out.println("Remaining tickets: " + Ticket.getRemainingTickets());

        Ticket booking4 = new Ticket("Damsel", "7:00 PM", "Dave");
        booking4.displayBookingDetails();
        System.out.println("Remaining tickets: " + Ticket.getRemainingTickets());
    }
}
