package com.epam.Task2;

/**
 * Created by skarzhynskaya_katya on 1/20/17.
 */

public class Customer {

    private String goodName;
    private int number;
    private Shop sh;


    public Customer() {
        goodName = this.getGoodName();
        this.number = this.getNumber();
        this.sh = this.getSh();

    }


    public void getToRent(String GoodName){
        boolean availability = sh.isInShop(GoodName); // вызвали метод из шопа со строкой названия
        if (availability) {
            sh.getGood(GoodName);
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
}
