package com.company.tl.builder;

/**
 * Created by taolang on 2017/4/21.
 */

// 套餐构造器
public abstract class MealBuilder {

    Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
