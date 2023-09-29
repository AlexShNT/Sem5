package org.example;

public class Main {
    public static void main(String[] args) {

        Market superM = new Market();

        Human hum1 = new Human();
        hum1.setName("Aleksandr");
        Human hum2 = new Human();
        hum2.setName("Petr");
        Human hum3 = new Human();
        hum3.setName("Sveta");
        Human hum4 = new Human();
        hum4.setName("Katy");

        superM.acceptToMarket(hum1);
        superM.acceptToMarket(hum2);
        superM.acceptToMarket(hum4);
        superM.acceptToMarket(hum3);

        superM.update();
        superM.update();
        superM.update();
        superM.update();


    }
}