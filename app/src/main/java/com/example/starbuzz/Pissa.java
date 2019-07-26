package com.example.starbuzz;

public class Pissa {
    private String name;
    private String description;
    private int imageResourceID;

    public Pissa(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public static final Pissa[] pissa = {new Pissa("Мексиканская","Ароматная мексиканская пицца – " +
        "наиболее пикантный вариант приготовления данного блюда. " +
        "В рецепте присутствуют острый соус и перец чили. Такая пицца очень легко готовится" +
        " и поможет разнообразить список закусок для большой компании, " +
        "в которой всегда найдутся любители остренького",R.drawable.mexicano),
    new Pissa("Маргарита","томатный или сливочный соус, " +
            "помидоры и много сыра Моцарелла. Классика, " +
            "которую обязательно стоит попробовать",R.drawable.margarita),
    new Pissa("Гавайская","Свое название данный вид получил благодаря одному из главных ингредиентов," +
            " который напоминает яркое солнце на Гавайских островах – ананасу. " +
            "Кроме него в состав пиццы входит сливочный соус, ветчина, красный лук и сыр моцарелла.",R.drawable.hawaian)};



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
