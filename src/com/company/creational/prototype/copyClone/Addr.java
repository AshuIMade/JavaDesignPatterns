package com.company.creational.prototype.copyClone;

public class Addr {
    public String streetAddress, city, country;

    public Addr(String streetAddress, String city, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
    }

    public Addr(Addr other){
        this(other.streetAddress, other.city, other.country);
    }
    @Override
    public String toString() {
        return "Addr{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
