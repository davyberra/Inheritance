package com.company;

public class Teacup extends Person implements Chattable{

    Teacup(String name) {
        super(name);
    }

    @Override
    public String chat() {
        return "Hi, I'm a teacup!";
    }
}
