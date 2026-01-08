package com.example.petshop;

public class Cat extends Pet implements Pettable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "meow";  //Cats meow
    }

    @Override
    public Void pet(){
        return null;
    };

}
