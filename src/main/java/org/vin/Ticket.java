package org.vin;

import java.util.Scanner;

import static org.vin.ParkingLot.getSlot;
import static org.vin.ParkingLot.setSlot;

public class Ticket {
    private static int globalTime = 0;
    private static int tickets = 1;
    private int ticketID;
    private int entryTime;
    private String vehicleID;
    private static int assignedSlot;

    public static int getGlobalTime() {
        return globalTime;
    }

    public static int getTickets() {
        return tickets;
    }

    public int getEntryTime() {
        return entryTime;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public int getAssignedSlot() {
        return assignedSlot;
    }

    public Ticket(String vehicleID){
        this.ticketID = tickets++;
        this.entryTime = globalTime++;
        this.vehicleID = vehicleID;
        this.assignedSlot= getSlot();

    }

    public int getTicketID() {
        return ticketID;
    }
    public void entryticket(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '2' for 2 wheeler vehicle or '4' for 4 wheeler vehicle.");
        int inp = sc.nextInt();
        System.out.println("The vehicle's ticket ID is "+ticketID+" and " +
                "the vehicle has been assigned parking lot no."+this.assignedSlot);
        VehicleType vehicleType;
        switch (inp) {
            case 2 -> vehicleType = VehicleType.TWO_WHEELER;
            case 4 -> vehicleType = VehicleType.FOUR_WHEELER;
            default -> {
                System.out.println("Invalid");
                return;
            }
        }
        Vehicle veh = new Vehicle(vehicleID);

    }
    public void exitticket(String number){
        Scanner sc = new Scanner(System.in);
        Vehicle vehicle = new Vehicle(number);
        System.out.println("Enter the exit time of the vehicle.");
        int exittime = sc.nextInt();
        int price = calculatePrice(vehicle,exittime);
        System.out.println("Parking lot no."+setSlot(assignedSlot-1)+" has been freed and the total bill is Rs."+price);

    }
    public int calculatePrice(Vehicle a,int endTime){
        int res;
        if (a.vehicleType == VehicleType.TWO_WHEELER)
            res = (endTime-entryTime)*10;
        else    res = (endTime-entryTime)*20;
        return res;
    }
}
