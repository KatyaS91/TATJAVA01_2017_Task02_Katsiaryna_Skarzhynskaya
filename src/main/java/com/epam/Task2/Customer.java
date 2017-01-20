package com.epam.Task2;

/**
 * Created by skarzhynskaya_katya on 1/20/17.
 */

public class Customer {

    private String GoodName;
    private int number;

    public Customer(String goodName, int number) {
        GoodName = goodName;
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getGoodName() {
        return GoodName;
    }

    public void setGoodName(String goodName) {
        GoodName = goodName;
    }



    public void getToRent(String GoodName){
        Shop wantToTake = new Shop(GoodName); // создали объект магазин с запросом строки названия товара
        boolean availability = wantToTake.isInShop(GoodName); // вызвали метод из шопа со строкой названия
        if (availability) {
            wantToTake.getGood();
        } else {
            System.out.println("We don't have such equipment");
        }
    }

}
