package org.vin;

import java.util.Scanner;

import static org.vin.ParkingLot.setSlot;

public class Main {

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
        Ticket t1 = new Ticket(licPlate);
        System.out.println("endTime");
        int endTime = sc.nextInt();
        int price;
        price = endTime-t1.entryTime;
        setSlot(t1.assignedSlot);
        System.out.println(price);
    }
}