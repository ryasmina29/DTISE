package Module1.Day8;

import java.util.*;

public class Event {
    private String eventName;
    private int ticketQuotas;
    private double ticketPrice;
    private String ID;


    Event(String eventName, int ticketQuotas, double ticketPrice) {
        this.eventName = eventName;
        this.ticketQuotas = ticketQuotas;
        this.ticketPrice = ticketPrice;
    }

    public String getEventName() {
        return eventName;
    }

    public int getTicketQuotas() {
        return ticketQuotas;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void displayEventDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Ticket Quotas: " + ticketQuotas);
        System.out.println("Ticket Price: " + ticketPrice);
    }

    public boolean buyTicket(int ticketQuotas, int quantityBought) {
        if (ticketQuotas >= quantityBought) {
            ticketQuotas -= quantityBought;
            return true;
        }
        else {
            System.out.println("Ticket Sold Out");
        }
        return false;
    }

    }
