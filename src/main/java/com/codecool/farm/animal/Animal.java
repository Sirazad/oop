package com.codecool.farm.animal;

public abstract class Animal {
    protected int size = 0;

    public int getSize() {
        return size;
    }

    public abstract void feed();

    public String toString() {
        StringBuilder singleAnimalLine = new StringBuilder();
        singleAnimalLine.append("There is a ")
                .append(this.getSize())
                .append(" sized ")
                .append(this.getClass().getSimpleName().toLowerCase())
                .append(" in the farm.");
        return singleAnimalLine.toString();
    }
}
