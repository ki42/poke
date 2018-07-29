package com.domgee.pokeTrade.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.domgee.pokeTrade.models.Poke;

@Entity
public class PokeNames {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(max=20)
    private String name;

    @ManyToMany(mappedBy = "poke")

}
