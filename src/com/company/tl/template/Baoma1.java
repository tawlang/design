package com.company.tl.template;

/**
 * Created by taolang on 2017/5/23.
 */
public class Baoma1 extends BaomaModel {

    @Override
    protected void start() {
        System.out.println("宝马1发动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马1停车");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马1鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马1引擎发出声响");
    }
}
