package BusTicket;
public class Bus {
    int BusNo;
    int seats;
    String driverName;
    boolean AC;

    public  Bus(int BusNo,int seats,String driverName,boolean AC){
        this.BusNo=BusNo;
        this.seats=seats;
        this.driverName=driverName;
        this.AC=AC;
    }


    public String toString() {
        return "BusNo: " + BusNo + ", Seats: " + seats + ", Driver: " + driverName + ", AC: " + AC;
    }

    public int getBusNo() {
        return BusNo;
    }

    public int getSeats() {
        return seats;
    }
}