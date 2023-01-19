package org.vin;

import static org.vin.ParkingLot.getSlot;

public class Ticket {
    static int ticketID = 1;
    static int globalTime = 0;
    int entryTime;
    String vehicleID;
    int assignedSlot;

    public Ticket(String vehicleID){
        this.ticketID = ticketID++;
        this.entryTime = globalTime++;
        this.vehicleID = vehicleID;
        this.assignedSlot= getSlot();

    }
}
