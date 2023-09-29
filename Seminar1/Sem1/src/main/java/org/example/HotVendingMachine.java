package org.example;

import java.util.HashMap;

//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
// getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре

public class HotVendingMachine implements VendingMachine{
    private String name;
    private int volume;
    private int temperature;

    private class Goods{
        HotDrink hDM = new HotDrink();
        int value;
    };

    private HashMap<String, Goods> goods;
    
    public HotVendingMachine() {
        this.goods = new HashMap<>();
    }

//            if (phoneBook.containsKey(name)) {
//        HashSet<String> phones = phoneBook.get(name);
//        phones.add(phone);
//    } else {
//        HashSet<String> phones = new HashSet<>();
//        phones.add(phone);
//        phoneBook.put(name, phones);
//    }
//}

    public void addHotDrink(HotDrink hD, int value){
        if (goods.containsKey(hD.name + hD.getTemperatura())) {
            setVal(hD.name+hD.getTemperatura(), value);
        }
        else{
            Goods ng = new Goods();
            ng.hDM = hD;
            ng.value = value;
            this.goods.put(hD.getName() + hD.getTemperatura(), ng);
        }
    }

    private void setVal(String key, int val){
            this.goods.get(key).value = val;
    }

    @Override
    public String getProduct(String name, int volume, int temperature) {
        if (goods.containsKey(name+temperature)){
            int ost = goods.get(name+temperature).value - volume;
            if (ost >= 0) {
                String tHD =   goods.get(name + temperature).hDM.toString();
                setVal(name+temperature, ost);

                return "выдали: " + tHD +
                        " осталось:" + Integer.toString(ost);
            } else{
                if (this.goods.get(name + temperature).value == 0)
                    return "Этот напиток закончился";
                else
                    return "Нет такого количества напитка." +
                            name + " c температурой:" + temperature +
                            " осталось всего: " +
                            this.goods.get(name + temperature).value;
            }
        }
        else{
            return "Нет такого напитка " + name+temperature;
        }

    }


}
