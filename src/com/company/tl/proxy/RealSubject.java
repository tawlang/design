package com.company.tl.proxy;

/**
 * Created by taolang on 2017/4/18.
 */

//真实主题角色
public class RealSubject implements Subject {

    @Override
    public void method() {
        System.out.println("the original method!");
    }

}
