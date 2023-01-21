package org.vin;

import java.util.Scanner;

import static org.vin.ParkingLot.setSlot;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingLot lot=new ParkingLot();
        int choice = 1;
        while(choice==1) {
            System.out.println("Enter the license plate number of the vehicle.");
            String licPlate = sc.nextLine();
            sc.nextLine();
            System.out.println("Do you want to log entry ticket or exit ticket? Press 1 for entry or 2 for exit.");
            int logvar = sc.nextInt();
            Ticket tick = new Ticket(licPlate);
            if (logvar == 1) {
            Ticket entrytick = tick;
                entrytick.entryticket();
            } else if (logvar == 2) {
                Ticket exittick = tick;
                exittick.exitticket(licPlate);
            }
            System.out.println("Press 0 to exit the program else press 1 to continue");
            int inp = sc.nextInt();
            if(inp == choice) continue;
            else if (inp == 0) break;
        }
    }
}