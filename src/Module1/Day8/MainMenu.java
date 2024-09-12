package Module1.Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    private static ArrayList<Event> events = new ArrayList<>();
    private static ArrayList<Ticket> tickets = new ArrayList<>();

    public static void main(String[] args) {
        addEvents();
        Scanner sc = new Scanner(System.in);

        while (true){
            mainMenu();
            int chooseMenu = userChoice(sc);

            switch(chooseMenu){
                case 1:
                    displayEvents();
                    break;
                case 2:
                    buyTicket(sc);
                    break;
                case 3:
                    displayBookedTicket();
                    break;
                case 4:
                    System.out.println("Thank you for using our application");
                    break;
                default:
                    System.out.println("Invalid menu");
            }
        }

    }


    private static void addEvents() {
    events.add(new Event("Bruno Mars Concert", 100, 1000000));
    events.add(new Event("Coldplay Concert", 150, 1300000));
    events.add(new Event("Movie Festival Events", 80, 50000));
    }

    public static void mainMenu() {
        System.out.println("Welcome to the main menu");
        System.out.println("Press 1 to see events available");
        System.out.println("Press 2 to purchase tickets");
        System.out.println("Press 3 to see booked tickets");
        System.out.println("Press 4 to exit");
        System.out.print("Choose an option: ");
    }

    private static int userChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void displayEvents() {
        System.out.println("Events Available");
        for (int i = 0; i < events.size(); i++) {
            System.out.println(i + ". " + events.get(i).toString());
        }
    }

    public static void buyTicket(Scanner scanner) {
        displayEvents();
        System.out.print("Enter Ticket ID: ");
        int ticketID = userChoice(scanner);

        Event selectedEvent = events.get(ticketID);

        System.out.println("How many tickets you would like to buy? ");
        int quantity = scanner.nextInt();

        if (selectedEvent.getTicketQuotas() < 0) {
            System.out.println("Ticket Sold Out");
        }
        else {
            int remainingQuota = selectedEvent.getTicketQuotas() - quantity;
            System.out.println("Ticket Purchased Successfully");
        }
    }

    public static void displayBookedTicket() {
        if (tickets.isEmpty()) {
            System.out.println("No booked tickets");
        }
        else {
            for (Ticket ticket : tickets) {
                System.out.println();

        }
        }
    }
}
