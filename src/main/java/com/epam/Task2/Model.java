package com.epam.Task2;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */
public class Model {
    public static void main(String[] args){

        Shop fillTheShop = new Shop("");
        fillTheShop.addToShop();
        fillTheShop.goodsInTheShop();

        Customer firstCustomer = new Customer("Snowboard", 1); // создали объект клиента
        firstCustomer.getToRent("Snowboard");  // вызвали методы взять в прокат что-то с названием

        RentUnit listOfGoodsInRent = new RentUnit();
        listOfGoodsInRent.RentList();

    }
}