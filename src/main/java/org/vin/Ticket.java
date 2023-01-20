package org.vin;

import static org.vin.ParkingLot.getSlot;

public class Ticket {
    static int globalTime = 0;
    static int tickets = 1;
    int ticketID;
    int entryTime;
    String vehicleID;
    int assignedSlot;

    public Ticket(String vehicleID){
        this.ticketID = tickets++;
        this.entryTime = globalTime++;
        this.vehicleID = vehicleID;
        this.assignedSlot= getSlot();

    }
}
