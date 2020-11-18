package com.gauro.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Chandra
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="vets")
public class Vet extends Person{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="vet_specialties",
    joinColumns = @JoinColumn(name="vet_id"),
            inverseJoinColumns = @JoinColumn(name="speciality_id")
    )
    private Set<Speciality> specialityies=new HashSet<>();

//    public Set<Speciality> getSpecialityies() {
//        return specialityies;
//    }
//
//    public void setSpecialityies(Set<Speciality> specialityies) {
//        this.specialityies = specialityies;
//    }
}
