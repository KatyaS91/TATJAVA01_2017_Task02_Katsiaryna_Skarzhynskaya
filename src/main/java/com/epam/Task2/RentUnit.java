package com.epam.Task2;

import java.util.ArrayList;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */

public class RentUnit {

    private ArrayList<SportEquipment> units = new ArrayList<SportEquipment>();

    public void addToRentUnitList(SportEquipment x) {
        units.add(x);
    }

    public void RentList() {

        for (int i = 0; i < units.size(); i++) {
            System.out.println("Goods were taken in rent: " + units.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return "RentUnit{" +
                "units=" + units +
                '}';
    }
}