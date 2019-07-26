package com.example.starbuzz;

public class Drink {

    private String name;
    private String description;
    private int imageResourceID;


    public static final Drink[] drinks = {new Drink("Latte","Это скорее не кофейный, " +
            "а молочный напиток, " +
            "так как его основу составляет горячее молоко",R.drawable.latte),
    new Drink("Cappuccino","Кофейный напиток на основе эспрессо " +
            "с добавлением молочной пены",R.drawable.cappuccino),
    new Drink("Americano", "Не что иное, как разбавленный водой эспрессо. " +
            "Вода доливается в уже приготовленный кофе, " +
            "благодаря чему исчезает свойственная эспрессо горечь, " +
            "а аромат становится более мягким",R.drawable.americano)};



    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public String toString(){
        return  this.name;
    }
}
