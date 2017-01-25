package com.epam.Task2;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */

public class Shop {

    private Map<SportEquipment, Integer> goods = new HashMap<SportEquipment, Integer>();


    public void addToShop() {

        SportEquipment Snowboard = new SportEquipment();
        Snowboard.setTitle("Snowboard");
        Snowboard.setPrice(50);
        SportEquipment Helmet = new SportEquipment();
        Helmet.setPrice(10);
        Helmet.setTitle("Helmet");
        SportEquipment Gloves = new SportEquipment();
        Gloves.setTitle("Gloves");
        Gloves.setPrice(10);

        goods.put(Snowboard, 3);
        goods.put(Helmet, 3);
        goods.put(Gloves, 3);
    }

    public boolean isInShop(String name) {
        SportEquipment x = new SportEquipment();
        x.setTitle(name);
        Set keys = goods.keySet();
        for (Object key : keys) {
            if (key.equals(x)) {
                return true;
            }
        }
        return false;
    }


    public SportEquipment getGood(String name) {
        SportEquipment x = new SportEquipment();
        x.setTitle(name);
        return x;
    }

    public void removeFromShop(SportEquipment x) {
        goods.get(x);
        goods.remove(x);
    }

    public void goodsInTheShop() {

        for (SportEquipment eq : goods.keySet()) {
            System.out.println(eq.toString() + " = " + goods.get(eq));

        }
    }
}
