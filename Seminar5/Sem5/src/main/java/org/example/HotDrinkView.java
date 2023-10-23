package org.example;

public class HotDrinkView {
    public void printHotDrinkDetails(HotDrink hotDrink) {
        System.out.println("Hot Drink Details:");
        System.out.println("Temperature: " + hotDrink.getTemperature());
        System.out.println("Name: " + hotDrink.getName());
        System.out.println("Cost: " + hotDrink.getCoast());
    }
}