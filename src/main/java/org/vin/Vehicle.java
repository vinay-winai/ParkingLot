package org.vin;

public class Vehicle {
    String licPlate;
    private VehicleType vehicleType;

    public Vehicle(String licPlate, VehicleType vehicleType) {
        this.licPlate = licPlate;
        this.vehicleType = vehicleType;
    }

}
