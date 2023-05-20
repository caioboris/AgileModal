package br.com.agileModal.beans;

public class VehicleDimensions {

    private int id;
    private int totalWeight;
    private double	height;
    private int axlesQuantity;

    public VehicleDimensions(int totalWeight, double height, int axlesQuantity){
        this.totalWeight = totalWeight;
        this.height = height;
        this.axlesQuantity = axlesQuantity;
    }

    public int getId() {
        return id;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public double getHeight() {
        return height;
    }

    public int getAxlesQuantity() {
        return axlesQuantity;
    }

}

