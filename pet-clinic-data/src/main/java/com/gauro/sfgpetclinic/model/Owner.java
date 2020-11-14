package com.gauro.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Chandra
 */
public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets=new HashSet<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", telephone='" + telephone + '\'' +
               // ", pets "+( (pets==null)?" Null": pets.toString() )+
              //  ", pets=" + pets +
                '}';
    }
}
