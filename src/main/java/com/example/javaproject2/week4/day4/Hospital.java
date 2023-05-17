package com.example.javaproject2.week4.day4;

public class Hospital {
    private String name;
    private String websiteAddr;
    private Address address;

    public String getName() {
        return name;
    }

    public String getWebsiteAddr() {
        return websiteAddr;
    }

    public Address getAddress() {
        return address;
    }

    public Hospital(String name, String phoneNumber, Address address) {
        this.name = name;
        this.websiteAddr = phoneNumber;
        this.address = address;
    }
}