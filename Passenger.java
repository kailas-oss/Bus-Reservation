package BusTicket;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Passenger {
    String name;
    int age;
    int BusNo;
    Date date;

    public Passenger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME:");
        name = sc.next();
        System.out.println("ENTER YOUR AGE:");
        age = sc.nextInt();
        System.out.println("ENTER THE BUS NUMBER:");
        BusNo = sc.nextInt();
        System.out.println("ENTER YOUR D-O-B in dd-MM-yyyy");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Passenger> passengers, ArrayList<Bus> buses) {
        int capacity = 0;

        for (Bus bus : buses) {
            if (bus.getBusNo() == BusNo) {
                capacity = bus.getSeats();
                //break;
            }
        }
        int count=0;
        for(Passenger b:passengers){
            if(b.BusNo==BusNo && b.date.equals(date)){
                count++;
            }
        }
        return  count<capacity ? true : false;
    }
}
