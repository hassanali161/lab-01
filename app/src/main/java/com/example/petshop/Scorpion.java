package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet{
    public Scorpion(String name) {
        super(name);
    }

    public Scorpion(Date birthDate, String name) {
        super(birthDate, name);
    }

    @Override
    public String speak(){
        return "hiss";
    }
}
