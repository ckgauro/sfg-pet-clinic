package com.gauro.sfgpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Chandra
 */

@Entity
@Table(name="pets")
public class Pet extends BaseEntity{
    @Column(name = "name")
    private String Name;

    @ManyToOne
    @JoinColumn(name = "tyoe_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name="birth_date")
    private LocalDate birthDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits=new HashSet<>();


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "Name='" + Name + '\'' +
                ", petType=" + petType +
                ", owner=" + owner +
                ", birthDate=" + birthDate +
                '}';
    }
}
