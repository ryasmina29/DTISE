package Module1.Day9;

import java.util.HashMap;
import java.util.Scanner;

public class MainMenu {
    private static HashMap<Integer, User> user = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            mainMenu();
            System.out.println("Enter your choice: ");
            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    userMenu();
                    break;
                case 2:
                    taskMenu();
                    break;
                case 3:
                    System.out.println("Thank you for using our application");
                    break;
                default:
                    System.out.println("Invalid menu");
            }
        }
    }

    public static void mainMenu() {
        System.out.println("Welcome to the main menu");
        System.out.println("Press 1 for User Registration");
        System.out.println("Press 2 for Task Management (Username Required)");
        System.out.println("Press 3 to exit");
    }

    public static void userMenu() {
        User user = new User();
        user.addNewUser();
    }

    public static void taskMenu() {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Username:");
        String userName = sc.nextLine();
        System.out.println("Input Password:");
        String userPassword = sc.nextLine();
        if (user.isUserExists(userName)) {
            System.out.println("User" + userName + "is logging in.");
            System.out.println("Press 1 for New Task");
            System.out.println("Press 2 for Remove Task");
            System.out.println("Press 3 to Display all Tasks");
            int chooseTask = sc.nextInt();
            Task task = new Task();
            switch (chooseTask) {
                case 1:
                    task.addTask();
                    break;
                case 2:
                    task.removeTask();
                    break;
                case 3:
                    task.displayTasks();
                    break;
                default:
                    System.out.println("Invalid");
            }
        } else {
            System.out.println("User" + userName + "does not exist");
        }
    }
}
