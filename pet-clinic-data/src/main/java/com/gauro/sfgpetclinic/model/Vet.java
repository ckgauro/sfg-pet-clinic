package com.gauro.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Chandra
 */
public class Vet extends Person{
    private Set<Speciality> specialityies=new HashSet<>();

    public Set<Speciality> getSpecialityies() {
        return specialityies;
    }

    public void setSpecialityies(Set<Speciality> specialityies) {
        this.specialityies = specialityies;
    }
}
