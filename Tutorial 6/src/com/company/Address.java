package com.company;

public class Address {
    public String country;
    public String city;
    public int postalCode;
    public String streetName;
    public int apartmentNumber;

    public String setUpAddress (String country){
        return String.format(country);
    }
    public String setUpAddress (String city, String country){
        return String.format(city, country);
    }
    public String setUpAddress (String city, String country, int postalCode){
        return String.format(city, country, postalCode);
    }
    public String setUpAddress (String streetName, String city, String country, int postalCode){
        return String.format(streetName, city, country, postalCode);
    }
    public String setUpAddress (String country, String city, int postalCode, String streetName, int apartmentNumber){
        return String.format(streetName, city, country, postalCode, apartmentNumber);
    }
}