package br.com.agileModal.beans;

public class VehicleConditions {

    private int id;
    private int damageLevel;
    private boolean overturned;

    public VehicleConditions(int damageLevel, boolean overturned) {
        this.damageLevel = damageLevel;
        this.overturned = overturned;
    }

    public int getId() {
        return id;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public boolean isOverturned() {
        return overturned;
    }


}
