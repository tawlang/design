package com.company.tl.bridge;

/**
 * Created by taolang on 2017/4/1.
 */
public class MyBridge extends Bridge{

    public void method(){
        getSource().method();
    }
}
