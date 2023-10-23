package org.example;

public class HotDrinkModel {
    private HotDrink hotDrink;

    public void setHotDrink(int temperature, String name, double coast) {
        hotDrink = new HotDrink(temperature, name, coast);
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }
}
