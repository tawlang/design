package com.company.tl.observer;


/**
 * Created by taolang on 2017/4/18.
 */
// 被观察者接口
public interface Observable {

    //增加一个观察者
    public void addObserver(Observer observer);
    //删除一个观察者
    public void deleteObserver(Observer observer);
    //通知观察者
    public void notifyObservers(String context);
}
