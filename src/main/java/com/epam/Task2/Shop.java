package com.epam.Task2;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */

public class Shop {

    SportEquipment inShop;

    private Map<SportEquipment, Integer> goods = new HashMap<SportEquipment, Integer>();


    public void addToShop() {

        SportEquipment Snowboard = new SportEquipment("Snowboard", 50);
        Snowboard.setTitle("Snowboard");
        Snowboard.setPrice(50);
        SportEquipment Helmet = new SportEquipment("Helmet", 10);
        Helmet.setPrice(10);
        Helmet.setTitle("Helmet");
        SportEquipment Gloves = new SportEquipment("Gloves", 10);
        Gloves.setTitle("Gloves");
        Gloves.setPrice(10);

        goods.put(Snowboard, 3);
        goods.put(Helmet, 3);
        goods.put(Gloves, 3);
    }

    public boolean isInShop(String name) {  // проверяет есть ли строка с таким названием в ключе
        SportEquipment x = new SportEquipment(name, 50);
        if (goods.containsKey(x)) {
            return goods.containsKey(x); // если такая строка есть
        }
        return false; // если такой нет
    }

    public void getGood(String name) { // взять из мапы объект
        RentUnit putToRent = new RentUnit();
        SportEquipment x = new SportEquipment(name, 50);
        goods.get(x);
        putToRent.addToRentUnitList(inShop);
        goods.remove(inShop);

    }

    public void goodsInTheShop() {

        for (SportEquipment eq : goods.keySet()) {
            System.out.println(eq.toString() + " = " + goods.get(eq));

        }
    }
}
