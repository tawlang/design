package com.company.tl.proxy;

/**
 * 代理模型
 * Created by taolang on 2017/4/18.
 */
public class Clinet {

    public static void main(String[] args) {
        Subject source = new Proxy();
        source.method();
    }

}
