package com.company.tl.template;

/**
 * Created by taolang on 2017/5/23.
 */
public abstract class BaomaModel {

    //是否能发动
    protected boolean isAlarm() {
        return false;
    }

    // 发动
    protected abstract void start();

    // 停止
    protected abstract void stop();

    //喇叭发出声音了
    protected abstract void alarm();

    //引擎也开始响了
    protected abstract void engineBoom();

    public final void run(){
        this.start();
        this.engineBoom();
        //this.alarm();
        if(this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }
}
