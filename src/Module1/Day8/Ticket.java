package Module1.Day8;

import java.util.UUID;

public class Ticket {
    private UUID ID;
    private double price;
    private String userName;
    private String eventName;

    public Ticket (String ID, String userName, String eventName, double price) {
        this.ID = UUID.randomUUID();
        this.eventName = eventName;
        this.price = price;
        this.userName = userName;
    }

    public String getUUID() {
        return ID.toString();
    }

    public String getEventName() {
        return this.eventName;
    }

    public double getPrice() {
        return this.price;
    }

    public String getUserName() {
        return this.userName;
    }

    public void displayTicketDetails() {
        System.out.println("ID: " + getUUID());
        System.out.println("Event Name: " + getUserName());
        System.out.println("Price: " + getPrice());
        System.out.println("User Name: " + getUserName());
    }
}