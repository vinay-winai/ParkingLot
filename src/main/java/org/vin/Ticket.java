package org.vin;

import static org.vin.ParkingLot.getParking;

public class Ticket {
    private int ticketID = 1;
    private int entryTime = 0;
    private String vehicleID;
    private int assignedLot;
    public Ticket(String vehicleID){
        this.ticketID = ticketID++;
        this.vehicleID = vehicleID;
        this.entryTime = entryTime++;
        this.assignedLot = getParking();
    }
}
