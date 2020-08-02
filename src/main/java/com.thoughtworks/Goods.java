package com.thoughtworks;

public class Goods {
    private int price;
    private String name;
    Goods( int price, String name){
        this.price = price;
        this.name = name;
    }
    int getPrice(){
        return price;
    }
}
