package br.com.agileModal.beans;

public class PolicyOwner {

    private int id;
    private String fullName;
    private String email;
    private String cpf;
    private String policyNumber;
    private Phone phone;
    private Address address;
    private Vehicle vehicle;

    public PolicyOwner(String fullName, String email, String cpf, String policyNumber, Phone phone, Address address, Vehicle vehicle){
        this.fullName = fullName;
        this.email = email;
        this.cpf = cpf;
        this.policyNumber = policyNumber;
        this.phone = phone;
        this.address = address;
        this.vehicle = vehicle;
    }


    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getEmail() {
        return email;
    }
    public String getCpf() {
        return cpf;
    }
    public String getPolicyNumber() {
        return policyNumber;
    }

}

