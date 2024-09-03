package Day1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("Exercise 1");
        int width = 3, length = 5;
        System.out.println(length * width);

        //Exercise 2
        System.out.println("Exercise 2");
        int radius = 5;
        System.out.println("Diameter: " + radius * 2);
        System.out.println("Circumference: " + radius * 2 * Math.PI);
        System.out.println("Area: " + Math.PI * radius * radius);

        //Exercise 3
        System.out.println("Exercise 3");
        int a = 80, b = 65, c = 180 - (a + b);
        System.out.println("Angle: " + c);

        //Exercise 4
        System.out.println("Exercise 4");
        LocalDate date1 = LocalDate.of(2024, 3, 19);
        LocalDate date2 = LocalDate.of(2024, 3, 21);
        long diff = ChronoUnit.DAYS.between(date1, date2);

        System.out.println(diff);

        //Exercise 5
        System.out.println("Exercise 5");
        String name = "John Doe";
        System.out.println("Initials: " + getInitials(name));
    }

    public static String getInitials(String name) {
        int lastname = name.lastIndexOf(' ');
        return name.substring(0,1) + name.substring(lastname + 1, lastname + 2);
    }
}