package br.com.agileModal.beans;

public class Address {

    private int id;
    private String street;
    private int number;
    private String complement;
    private String city;
    private String state;
    private String country;

    public Address(String street, int number, String city, String state, String country){
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }




}
