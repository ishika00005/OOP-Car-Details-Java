package mimi;
import java.util.Scanner;

class car {
    String model;
    int year;

    void setDetails(String m , int y) {
        model = m;
        year = y;
    }

    void displayDetails() {
        System.out.println("The model of your car is : " + model +
                " and Manufactured in the year : " + year);
    }
}

public class carTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        car car1 = new car();
        car car2 = new car();

        car1.setDetails("BMW", 2000);

        System.out.println("The details of car1 :");
        car1.displayDetails();

        System.out.println("Enter your car model:");
        String m = sc.next();
        System.out.println("Enter manufacturing year:");
        int y = sc.nextInt();

        car2.setDetails(m, y);

        System.out.println("The details of car2 :");
        car2.displayDetails();

        if (car1.year > car2.year)
            System.out.println("Car1 is newer");
        
        else if (car1.year == car2.year)
            System.out.println("Both cars are manufactured in the same year");
        
        else
            System.out.println("Car2 is newer");

        sc.close();
    }
}

