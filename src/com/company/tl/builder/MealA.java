package com.company.tl.builder;

/**
 * Created by taolang on 2017/4/21.
 */
public class MealA extends MealBuilder{

    @Override
    public void buildFood() {
        meal.setFood("一个汉堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }
}

