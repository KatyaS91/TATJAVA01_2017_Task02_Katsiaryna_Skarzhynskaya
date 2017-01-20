package com.epam.Task2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */

public class RentUnit {

    private Map <SportEquipment, Integer> units = new HashMap <SportEquipment, Integer>();

    public void addToRentUnitList(SportEquipment x){ // добавляем в мэп товар взятый в рент
        units.put(x, 1);
    }

    public void RentList(){
        System.out.println("Goods were taken in rent: " + units);
    }

}
