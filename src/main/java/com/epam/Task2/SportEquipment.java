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

    public SportEquipment() {
        title = this.getTitle();
        price = this.getPrice();
    }

    @Override
    public String toString() {
        return "SportEquipment{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportEquipment)) return false;

        SportEquipment that = (SportEquipment) o;
        return getTitle().equals(that.getTitle());
    }

    @Override
    public int hashCode() {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + getPrice();
        return result;
    }
}
