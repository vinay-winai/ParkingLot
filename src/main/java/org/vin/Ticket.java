package org.vin;

public class Ticket {
    private int ticketID = 1;
    private String vehicleID;
    private int entryTime = 0;
    private int assignedLot;
    public Ticket(){
        this.ticketID = ticketID++;
        this.vehicleID =
                this.entryTime = entryTime++;
        this.assignedLot = getParking();
    }
}
