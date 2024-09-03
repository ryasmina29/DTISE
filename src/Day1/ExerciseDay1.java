package Day1;

import java.awt.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ExerciseDay1 {
    public static void runExerciseD1() {
        //Exercise 1
        System.out.println("Exercise 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Length: ");
        double length = sc.nextDouble();
        System.out.println("Width: ");
        double width = sc.nextDouble();
        System.out.println("The length of the rectangle is: "+ (length * width));
        System.out.println();

        //Exercise 2
        System.out.println("Exercise 2");
        System.out.println("Radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Diameter: " + radius * 2);
        System.out.println("Circumference: " + radius * 2 * Math.PI);
        System.out.println("Area: " + Math.PI * radius * radius);
        System.out.println();

        //Exercise 3
        System.out.println("Exercise 3");
        System.out.println("Angle a corner: ");
        double a = sc.nextDouble();
        System.out.println("Angle b corner: ");
        double b = sc.nextDouble();
        double c = 180 - (a + b);
        System.out.println("Angle of the triangle is: " + c);
        System.out.println();

        //Exercise 4
        System.out.println("Exercise 4");
        LocalDate date1 = LocalDate.of(2024, 3, 19);
        LocalDate date2 = LocalDate.of(2024, 3, 21);
        long diff = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(diff);
        System.out.println();

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

