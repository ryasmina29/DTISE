import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        //DAY 1

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


        //DAY 2
        //Exercise 1
        System.out.println("Exercise 1");
        double tempF = 50;
        System.out.println("Temperature in Celcius: " + getFtoC(tempF));

        //Exercise 2
        System.out.println("Exercise 2");
        double NumCM = 100000;
        System.out.println("Distance in KM: " + getCMtoKM(NumCM));
    }

    public static String getInitials(String name) {
        int lastname = name.lastIndexOf(' ');
        return name.substring(0,1) + name.substring(lastname + 1, lastname + 2);
    }
    public static double getFtoC(double F) {
        return (5.0 / 9.0) * (F - 32);
    }

    public static double getCMtoKM(double C) {
        return (C/100000);
    }

}





/* Test

public void main() {
}

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("Exercise 1");
        double tempF = 50;
        System.out.println("Temperature in Celcius: " + getFtoC(tempF));
    }
}
    public static double getFtoC(double F) {
        return (5.0 / 9.0) * (F - 32);
    } */
