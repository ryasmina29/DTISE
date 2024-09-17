package Module1.Day10;


import java.util.Scanner;

public class Compile {

    private static Book[] booklist = {new Book(12345, "Shatter Me", "T.Mafi", "Book", "Paperback", 5),
            new Book(34567, "Gallant", "V.E.Schwab", "Book", "Hardback", 2)};

    private static Dvd[] dvdlist = {new Dvd("Wall-E", "Pixar", "DVD", "BluRay", 1),
            new Dvd("Divergent", "Red Wagon Ent", "DVD", "BluRay", 3)};

    private static Magz[] maglist = {new Magz(90909, "National Geographic", "National Geographic Books", "Magazine", 10),
            new Magz(68686, "Forbes", "Forbes Books", "Magazine", 10)};

    private static void displayAll() {
        for (Book book : booklist) {
            book.toDisplay();
        }
        for (Dvd dvd : dvdlist) {
            dvd.toDisplay();
        }
        for (Magz magz : maglist) {
            magz.toDisplay();
        }
    }

    public static void main(String[] args) {
        while (true) {
            displayMenu();
        }
    }


    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Show All Products");
            System.out.println("2. User Management");
            System.out.println("3. Borrow Product");
            System.out.println("4. Return Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayAll();
                    break;
                case 2:
                    //User Management
                    break;
                case 3:
                    borrowMat();
                    break;
                case 4:
                    returnMat();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }


        private static void borrowMat() {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Borrow Book");
            System.out.println("2. Borrow DVD");
            System.out.println("3. Borrow Magazine");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    System.out.print("Enter Book Name: ");
                    String borrowedBook = sc.nextLine();
                    for (Book book : booklist) {
                        if (book.getName().equals(borrowedBook) && book.quantity > 0) {
                            book.quantity--;
                        }
                        else System.out.println("Not Available");
                    }
                    break;
                case "2":
                    System.out.print("Enter DVD Name: ");
                    String borrowedDvd = sc.nextLine();
                    for (Dvd dvd : dvdlist) {
                        if (dvd.getName().equals(borrowedDvd) && dvd.quantity > 0) {
                            dvd.quantity--;
                        }
                        else System.out.println("Not Available");
                    }
                    break;
                case "3":
                    System.out.print("Enter Magazine Name: ");
                    String borrowedMagz = sc.nextLine();
                    for (Magz magz : maglist) {
                        if (magz.getName().equals(borrowedMagz) && magz.quantity > 0) {
                            magz.quantity--;
                        }
                        else System.out.println("Not Available");
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

        private static void returnMat() {
            Scanner sc = new Scanner(System.in);
            System.out.print("1. Return Book: ");
            System.out.print("2. Return DVD: ");
            System.out.print("3. Return Magazine: ");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    System.out.print("Enter Book Name: ");
                    String returnedBook = sc.nextLine();
                    for (Book book : booklist) {
                        if (book.getName().equals(returnedBook)) {
                            book.quantity++;
                        }
                        else System.out.println("Not Available");
                    }
                    break;
                case "2":
                    System.out.print("Enter DVD Name: ");
                    String returnedDvd = sc.nextLine();
                    for (Dvd dvd : dvdlist) {
                        if (dvd.getName().equals(returnedDvd)) {
                            dvd.quantity++;
                        }
                        else System.out.println("Not Available");
                    }
                    break;
                case "3":
                    System.out.print("Enter Magazine Name: ");
                    String returnedMagz = sc.nextLine();
                    for (Magz magz : maglist) {
                        if (magz.getName().equals(returnedMagz)) {
                            magz.quantity++;
                        }
                        else System.out.println("Not Available");
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }