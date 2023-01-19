package org.vin;

public class Ticket {
    public int ticketID = 1;
    public String vehicleID;
    public int entryTime = 0;
    public int assignedLot;
    public Ticket(){
        this.ticketID = ticketID++;
        this.vehicleID =
                this.entryTime = entryTime++;
        this.assignedLot = getParking();
    }
}
