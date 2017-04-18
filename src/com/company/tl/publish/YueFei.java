package com.company.tl.publish;

import java.util.ArrayList;

/**
 * Created by taolang on 2017/4/18.
 */
public class YueFei implements IYueFei ,Observable{

    //定义个变长数组，存放所有的观察者
    private ArrayList<Observer> observerList = new ArrayList<>();

    @Override
    public void chubing() {
        System.out.println("岳飞: 开始出兵了...");
        this.notifyObservers("岳飞开始出兵了");
    }

    @Override
    public void shoubing() {
        System.out.println("岳飞:开始收兵了...");
        this.notifyObservers("岳飞开始收兵了");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for(Observer o : observerList){
            o.update(context);
        }
    }
}
