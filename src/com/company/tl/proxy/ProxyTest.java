package com.company.tl.proxy;

/**
 * Created by taolang on 2017/4/18.
 */
public class ProxyTest {

    public static void main(String[] args) {
        Subject source = new Proxy();
        source.method();
    }

}
