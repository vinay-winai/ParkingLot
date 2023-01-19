package org.vin;

public class ParkingLot {
     private static Boolean[] parkingLots = new Boolean[400];

     static int getParking(){
         for (int i=0;i <400; i++){
             if (parkingLots[i]) {
                 parkingLots[i] = false;
                 return i + 1;
             }
         }
         return -1;
     }

     void setParking(int slot){
         parkingLots[slot-1] = true;
     }
}
