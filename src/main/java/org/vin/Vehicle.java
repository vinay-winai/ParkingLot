package org.vin;

public class Vehicle {
    String licPlate;
    VehicleType vehicleType;

    public Vehicle(String licPlate) {
        this.licPlate = licPlate;
    }

    public String getLicPlate() {
        return licPlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
