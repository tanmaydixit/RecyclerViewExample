package com.example.recyclerviewexample;

/**
 * Created by tanmay on 12/2/18.
 */

public class HitlistModel {

    String name;
    String TypeOfDeath;

    public HitlistModel(){

    }

    public HitlistModel(String name, String typeOfDeath) {
        this.name = name;
        TypeOfDeath = typeOfDeath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfDeath() {
        return TypeOfDeath;
    }

    public void setTypeOfDeath(String typeOfDeath) {
        TypeOfDeath = typeOfDeath;
    }
}
