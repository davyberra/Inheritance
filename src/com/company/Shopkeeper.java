package com.company;

public class Shopkeeper extends Person implements Seller {

    Shopkeeper(String name) {
        super(name);
    }

    @Override
    public String chat() {
        return "Hi, I'm a shopkeeper!";
    }

    @Override
    public void sellGoods() {
        //todo: Fill out this function
    }
}
