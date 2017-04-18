package com.company.tl.proxy;

/**
 * Created by taolang on 2017/4/18.
 */
public class Proxy implements Subject{

    private RealSubject realSubject;

    public Proxy(){
        super();
        this.realSubject = new RealSubject();
    }
    @Override
    public void method() {
        start();
        realSubject.method();
        stop();
    }

    private void stop() {
        System.out.println("结束 proxy!");
    }

    private void start() {
        System.out.println("开始 proxy!");
    }

}
