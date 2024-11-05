package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private static int nextId = 1;
    private int id;
    private String value;


    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField jobField)) return false;
        return id == jobField.id && Objects.equals(value, jobField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }

    public JobField() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {this.value = value;}
}
