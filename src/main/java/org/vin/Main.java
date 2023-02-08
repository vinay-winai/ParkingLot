package org.vin;

import java.util.Scanner;

import static org.vin.ParkingLot.setSlot;

public class Main {

    static int calculatePrice(Vehicle a,Ticket t,int endTime){
        int res;
        if (a.vehicleType() == VehicleType.TWO_WHEELER)
            res = (endTime-t.getEntryTime())*10;
        else    res = (endTime-t.getEntryTime())*20;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lic Plate");
        String licPlate = sc.nextLine();
        System.out.println("2 or 4");
        int inp = sc.nextInt();
        VehicleType vehicleType;
        switch (inp) {
            case 2 -> vehicleType = VehicleType.TWO_WHEELER;
            case 4 -> vehicleType = VehicleType.FOUR_WHEELER;
            default -> {
                System.out.println("Invalid");
                return;
            }
        }
        Vehicle a = new Vehicle(licPlate,vehicleType);
        Ticket t = new Ticket(licPlate); // licPlate no for database purposes only
        System.out.println("endTime");
        int endTime = sc.nextInt();
        int price = calculatePrice(a,t,endTime);
        setSlot(t.getAssignedSlot());
        System.out.println(price);
    }
}