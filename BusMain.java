package BusTicket;

import java.util.ArrayList;
import java.util.Scanner;

public class BusMain {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Passenger> passengers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        buses.add(new Bus(1, 1, "kailas", true));
        buses.add(new Bus(2, 0, "Reshmi", false));
        buses.add(new Bus(3, 0, "NABISH", true));
        buses.add(new Bus(4, 0, "JOHIN", true));
        int userOp = 1;
        System.out.println("");
        while (userOp == 1) {
            System.out.println("CHOOSE THE OPTIONS 1 TO BOOK AND 2 TO EXIT:");
            userOp = sc.nextInt();

            if (userOp == 1) {
                Passenger newPassenger = new Passenger();
                if (newPassenger.isAvailable(passengers, buses)) {
                    passengers.add(newPassenger);
                    System.out.println("YOUR BOOKING HAS BEEN ACCEPTED");
                } else {
                    // No available buses
                    System.out.println("No available buses.");
                }
            }
        }
        //for (Bus it : buses)
        //    System.out.println(it);
    }
}
