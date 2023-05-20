package br.com.agileModal.beans;

public class Phone {

    private int id;
    private int ddi;
    private int ddd;
    private String phoneNumber;

    public Phone(int ddi, int ddd, String phoneNumber) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public int getDdi() {
        return ddi;
    }

    public int getDdd() {
        return ddd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
