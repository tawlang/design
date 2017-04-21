package com.company.tl.builder;

/**
 * Created by taolang on 2017/4/21.
 */
public class Client {

    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        MealA a = new MealA();
        waiter.setMealBuilder(a);
        Meal mealA = waiter.construct();

        MealB b = new MealB();
        waiter.setMealBuilder(b);
        Meal mealB = waiter.construct();

        System.out.print("套餐A的组成部分:");
        System.out.println(mealA.getFood()+"---"+mealA.getDrink());

        System.out.print("套餐B的组成部分:");
        System.out.println(mealB.getFood()+"---"+mealB.getDrink());
    }
}
