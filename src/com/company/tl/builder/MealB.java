package com.company.tl.builder;

/**
 * Created by taolang on 2017/4/21.
 */
public class MealB extends MealBuilder{

    @Override
    public void buildFood() {
        meal.setFood("一盒炸鸡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一扎啤酒");
    }
}
