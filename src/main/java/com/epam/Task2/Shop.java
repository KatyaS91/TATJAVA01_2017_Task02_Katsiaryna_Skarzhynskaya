package com.epam.Task2;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */

public class Shop {

    SportEquipment inShop;
    String name;
    private Map<SportEquipment, Integer> goods = new HashMap<SportEquipment, Integer>();

    public Shop(String name) {
        this.name = name;
    }

    public void addToShop() {

        SportEquipment Snowboard = new SportEquipment("Snowboard", 50);
        SportEquipment Helmet = new SportEquipment("Helmet", 10);
        SportEquipment Gloves = new SportEquipment("Gloves", 10);

        goods.put(Snowboard, 3);
        goods.put(Helmet, 3);
        goods.put(Gloves, 3);
    }

    public boolean isInShop(String name) {  // проверяет есть ли строка с таким названием в ключе
        if (goods.containsKey(name)) {
            return true; // если такая строка есть
        }
        return false; // если такой нет
    }

    public void getGood() { // взять из мапы объект
        RentUnit putToRent = new RentUnit();
        goods.get(name);
        putToRent.addToRentUnitList(inShop);
        goods.remove(inShop);

    }

    public void goodsInTheShop() {

        for (SportEquipment eq : goods.keySet()) {
            System.out.println(eq.toString() + " = " + goods.get(eq));

        }
    }
}
