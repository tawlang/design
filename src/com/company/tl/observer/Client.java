package com.company.tl.observer;

/**
 * 观察者模型
 * Created by taolang on 2017/4/18.
 */
public class Client {

    public static void main(String[] args) {
        Observer qinHui = new QinHui();
        Observer mingbing = new Mingbing();
        YueFei yueFei = new YueFei();
        yueFei.addObserver(qinHui);
        yueFei.addObserver(mingbing);
        yueFei.chubing();
        // 民兵阵亡了，所以删除这个观察者。
        yueFei.deleteObserver(mingbing);
        yueFei.shoubing();
    }
}
