package models;

import androidx.annotation.NonNull;

public abstract class Person {

    private int id;
    private String name;
    private String picture;
    private String roll;

    public abstract void work();

    public Person(int id, String name, String picture) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        work();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    @NonNull
    @Override
    public String toString() {
        return roll + ":" + name;
    }
}
