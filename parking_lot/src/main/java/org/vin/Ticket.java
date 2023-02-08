package org.vin;

import static org.vin.ParkingLot.getSlot;

public class Ticket {
    private static int globalTime = 0;
    private static int tickets = 1;
    private final int entryTime;
    private final String vehicleID;

    private final int ticketId;
    private final int assignedSlot;

    public int getEntryTime() {
        return entryTime;
    }

    public int getAssignedSlot() {
        return assignedSlot;
    }

    public Ticket(String vehicleID){
        this.ticketId = tickets++;
        this.entryTime = globalTime++;
        this.vehicleID = vehicleID;
        this.assignedSlot= getSlot();

    }
}
