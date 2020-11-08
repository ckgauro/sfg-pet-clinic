package com.gauro.sfgpetclinic.model;

/**
 * @author Chandra
 */
public class PetType extends BaseEntity{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
