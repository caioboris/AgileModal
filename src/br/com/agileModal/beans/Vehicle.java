package br.com.agileModal.beans;

public class Vehicle {

    private int id;
    private String licensePlate;
    private VehicleDimensions dimensions;
    private String model;
    private String brand;

    public Vehicle(String licensePlate, VehicleDimensions dimensions, String model, String brand){
        this.licensePlate = licensePlate;
        this.dimensions = dimensions;
        this.model = model;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }


}

