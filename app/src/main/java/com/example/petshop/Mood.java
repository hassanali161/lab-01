package com.example.petshop;

import java.util.Date;

public abstract class Mood {

    private Date date;

    // date not provided
    public Mood() {
        this.date = new Date();
    }

    // date provided
    public Mood(Date date){
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String mood_type();
}
