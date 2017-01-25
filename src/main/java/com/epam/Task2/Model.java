package com.epam.Task2;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */

public class Model {

    public static void main(String[] args){

        Shop fillTheShop = new Shop();
        fillTheShop.addToShop();
        fillTheShop.goodsInTheShop();

        RentUnit rentEquipment = new RentUnit();

        Customer firstCustomer = new Customer(); // создали объект клиента
        firstCustomer.setGoodName("Snowboard");
        firstCustomer.setNumber(1);
        firstCustomer.setSh(fillTheShop);
        firstCustomer.setRentList(rentEquipment);
        firstCustomer.getToRent(firstCustomer.getGoodName());  // вызвали методы взять в прокат что-то с названием


        Customer secondCustomer = new Customer();
        secondCustomer.setGoodName("Helmet");
        secondCustomer.setSh(fillTheShop);
        secondCustomer.setRentList(rentEquipment);
        secondCustomer.getToRent(secondCustomer.getGoodName());


        rentEquipment.RentList();
        fillTheShop.goodsInTheShop();

    }
}
