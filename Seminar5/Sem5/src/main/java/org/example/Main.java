package org.example;

public class Main {
    public static void main(String[] args) {

        HotDrinkModel hotDrinkModel = new HotDrinkModel();
        HotDrinkView hotDrinkView = new HotDrinkView();
        HotDrinkController hotDrinkController = new HotDrinkController(hotDrinkModel, hotDrinkView);

        hotDrinkController.updateHotDrink(80, "Tea", 20);
        hotDrinkController.displayHotDrink();

        hotDrinkController.updateHotDrink(90, "Coffee", 120);
        hotDrinkController.displayHotDrink();
    }
}