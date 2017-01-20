package com.epam.Task2;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */
public class SportEquipment {

    private String title;
    private int price;

    public String getTitle() { return title; }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SportEquipment(String title, int price){
        title = this.getTitle();
        price = this.getPrice();
    }

}
