package com.epam.Task2;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */
public class Model {

    public static void main(String[] args){

        Shop fillTheShop = new Shop("Snowboard");
        fillTheShop.addToShop();
        fillTheShop.goodsInTheShop();

        Customer firstCustomer = new Customer("Snowboard", 1, wantToTake); // создали объект клиента
        firstCustomer.getToRent("Snowboard");  // вызвали методы взять в прокат что-то с названием


        Shop wantToTake = new Shop(firstCustomer.getGoodName()); // создали объект магазин с запросом строки названия товара
        wantToTake.setName(firstCustomer.getGoodName());

        RentUnit listOfGoodsInRent = new RentUnit();
        listOfGoodsInRent.RentList();

    }
}
