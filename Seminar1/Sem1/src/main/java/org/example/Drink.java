package org.example;

public class Drink {
    protected String name;
    protected double coast;

    public Drink() {
        this.name = name;
        this.coast = coast;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", coast=" + coast +
                '}';
    }
}
