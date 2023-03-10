package org.vin;

public class ParkingLot {
     private static final int maxSlots = 400;
     static final boolean[] parkingLot = new boolean[maxSlots];

     static int getSlot(){
         for (int i=0;i<maxSlots; i++){
             if (!parkingLot[i]) {
                 parkingLot[i] = true;
                 return i + 1;

             }
         }
         return -1;
     }
     static int setSlot(int slot){
         parkingLot[slot-1] = false;
         return slot;
     }
}
