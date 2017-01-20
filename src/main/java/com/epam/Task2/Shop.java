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

    public void addToShop(){

        SportEquipment Snowboard = new SportEquipment("Snowboard", 50);
        SportEquipment Helmet = new SportEquipment("Helmet", 10);
        SportEquipment Gloves = new SportEquipment("Gloves", 10);

        goods.put(Snowboard, 3);
        goods.put(Helmet, 3);
        goods.put(Gloves, 3);
    }

    public SportEquipment isInShop(String name){  // проверяет есть ли строка с таким названиев в ключе
        if (goods.containsKey(name)){
            if (goods.containsValue(3)){
        //??        inShop = goods.get(3);  // если такая строка есть то записать ее в переменную
                return inShop;
            }
        }
        return null;
    }

    public void addToRentUnits(){ // взятый в рент товар помещаем в коллекцию RentUnit
        RentUnit putToRent = new RentUnit();
        putToRent.addToRentUnitList(inShop);
    }

    public void delFromShop(){  // взятый в рент товар удаляем из мэпа товаров, очищаем переменную
   //??     goods.remove(inShop, 1);
        inShop = null;
    }

    public void goodsInTheShop(){
        System.out.println("In the shop: " + goods);
    }
}
