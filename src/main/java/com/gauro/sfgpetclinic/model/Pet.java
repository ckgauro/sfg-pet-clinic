package com.gauro.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * @author Chandra
 */
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate localDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
