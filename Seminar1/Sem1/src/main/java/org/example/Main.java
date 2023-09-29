package org.example;

public class Main {
    public static void main(String[] args) {

        HotDrink hTea80_150 = new HotDrink();
        hTea80_150.setHotDrink(80, "tea", 20);

        HotDrink hCoffee90_150 = new HotDrink();

        hCoffee90_150.setHotDrink(90, "coffee", 120);


        System.out.println(hTea80_150.toString());

        HotVendingMachine hotVendingMachin = new HotVendingMachine();

        hotVendingMachin.addHotDrink(hTea80_150, 500);
        hotVendingMachin.addHotDrink(hCoffee90_150, 700);

        System.out.println(hotVendingMachin.getProduct("tea", 300, 80));
        System.out.println(hotVendingMachin.getProduct("coffee", 150, 80));
        System.out.println(hotVendingMachin.getProduct("coffee", 150, 90));

        System.out.println(hotVendingMachin.getProduct("tea", 300, 80));
        System.out.println(hotVendingMachin.getProduct("tea", 200, 80));
        System.out.println(hotVendingMachin.getProduct("tea", 200, 80));

        hotVendingMachin.addHotDrink(hTea80_150, 500);
        System.out.println(hotVendingMachin.getProduct("tea", 200, 80));


    }
}