package com.epam.Task2;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */

public class Model {

    public static void main(String[] args){

        Shop fillTheShop = new Shop();
        fillTheShop.addToShop();
        fillTheShop.goodsInTheShop();

        Customer firstCustomer = new Customer(); // создали объект клиента
        firstCustomer.setGoodName("Snowboard");
        firstCustomer.setNumber(1);
        firstCustomer.setSh(fillTheShop);
        firstCustomer.getToRent(firstCustomer.getGoodName());  // вызвали методы взять в прокат что-то с названием

        RentUnit listOfGoodsInRent = new RentUnit();
        SportEquipment x = new SportEquipment();
        x.setTitle("Helmet");
        x.setPrice(10);
        listOfGoodsInRent.addToRentUnitList(x);
        listOfGoodsInRent.RentList();

    }
}
