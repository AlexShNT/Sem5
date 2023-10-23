package org.example;

public class HotDrink extends Drink{
    private int temperature;
    Drink hD = new Drink();

    public HotDrink(int temperature, String name, double coast) {
        hD.setName(name);
        hD.setCoast(coast);
        this.temperature = temperature;
    }

    public void setHotDrink(int temperatura, String name, double coast ) {
        this.hD.name = name;
        this.hD.coast = coast;
        this.temperature = temperatura;
    }

    public String getName(){
        return this.hD.name;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temperature=" + this.temperature +
                ", name=" +  this.hD.name+
                ", coast=" + this.hD.coast +
                '}';
    }
}

