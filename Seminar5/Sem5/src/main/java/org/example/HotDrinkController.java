package org.example;

public class HotDrinkController {
    private HotDrinkModel hotDrinkModel;
    private HotDrinkView hotDrinkView;

    public HotDrinkController(HotDrinkModel model, HotDrinkView view) {
        this.hotDrinkModel = model;
        this.hotDrinkView = view;
    }

    public void updateHotDrink(int temperature, String name, double coast) {
        hotDrinkModel.setHotDrink(temperature, name, coast);
    }

    public HotDrink getHotDrink() {
        return hotDrinkModel.getHotDrink();
    }

    public void displayHotDrink() {
        hotDrinkView.printHotDrinkDetails(getHotDrink());
    }
}
