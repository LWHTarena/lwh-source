package com.lwhtarena.sourcecode.spring.beans;

/**
 * @Author: liwh
 * @Date: 2017/7/2 2:48
 * Description:
 */
public class Car {
    private String brand;
    private String corp;
    private int price;
    private int maxSpeed;

    public String getBrand() {
        return brand;
    }

    public Car(String brand, String corp, int price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
