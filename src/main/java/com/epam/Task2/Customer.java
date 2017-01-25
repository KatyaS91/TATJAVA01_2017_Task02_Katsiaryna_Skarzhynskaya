package com.epam.Task2;

/**
 * Created by skarzhynskaya_katya on 1/20/17.
 */

public class Customer {

    private String goodName;
    private int number;
    private Shop sh;
    private RentUnit rentList;


    public Customer() {
        goodName = this.getGoodName();
        this.number = this.getNumber();
        this.sh = this.getSh();
        this.rentList = this.getRentList();


    }


    public void getToRent(String GoodName){
        boolean availability = sh.isInShop(GoodName); // вызвали метод из шопа со строкой названия
        if (availability) {
            SportEquipment x = sh.getGood(GoodName);
            rentList.addToRentUnitList(x);
            sh.removeFromShop(x);
            number = number + 1;
        } else {
            System.out.println("We don't have such equipment");
        }
    }


    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Shop getSh() {
        return sh;
    }

    public void setSh(Shop sh) {
        this.sh = sh;
    }

    public RentUnit getRentList() {
        return rentList;
    }

    public void setRentList(RentUnit rentList) {
        this.rentList = rentList;
    }
}
