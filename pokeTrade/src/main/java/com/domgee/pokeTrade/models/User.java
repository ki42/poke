package com.domgee.pokeTrade.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=12)
    private String userName;

    @NotNull
    @Size(min=3, max=15)    /* TODO how do I hash this? */
    private String hashPassword;

    @NotNull
    private int salt;

    @NotNull
    @Size(min=1, max=2)
    private int playerLevel;

    @NotNull
    @Size(min=5, max=5)
    private int zipCode;

    private int miles;

    @Size(min=3, max=25)
    private String email;

    private String timeSpan;

    @ManyToMany
    private List<Poke> poke = new ArrayList<>();

    public User(){}

    public User(String userName, String hashPassword, int salt, int playerLevel, int zipCode, int miles, String email, String timeSpan) {
        this.userName = userName;
        this.hashPassword = hashPassword;
        this.salt = salt;
        this.playerLevel = playerLevel;
        this.zipCode = zipCode;
        this.miles = miles;
        this.email = email;
        this.timeSpan = timeSpan;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(Integer playerLevel) {
        this.playerLevel = playerLevel;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getMiles() {
        return miles;
    }

    public void setMiles(Integer miles) {
        this.miles = miles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(String timeSpan) {
        this.timeSpan = timeSpan;
    }

    @Override
    public String toString() {
        return getUserName().toString();
    }
}

