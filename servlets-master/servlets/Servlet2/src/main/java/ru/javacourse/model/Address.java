package ru.javacourse.model;

public class Address {
    private String country;
    private String city;
    private String street;
    private int zip;

    public Address() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Address(String country, String city, String street, int zip) {

        this.country = country;
        this.city = city;
        this.street = street;
        this.zip = zip;
    }
}
