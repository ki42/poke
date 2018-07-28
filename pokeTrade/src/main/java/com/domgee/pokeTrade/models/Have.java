package com.domgee.pokeTrade.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

public class Have {
    @Entity
    public class Have {

        @ManyToOne()
        private int id;

        @ManyToMany
        private List<Poke> poke;


    }
