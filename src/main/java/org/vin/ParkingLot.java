package org.vin;

public class ParkingLot {
     private static final int maxSlots = 400; 
     private static Boolean[] parkingLot = new Boolean[maxSlots];

     static int getSlot(){
         for (int i=0;i<maxSlots; i++){
             if (parkingLot[i]) {
                 parkingLot[i] = false;
                 return i + 1;
             }
         }
         return -1;
     }

     static void setSlot(int slot){
         parkingLot[slot-1] = true;
     }
}
