package com.company.tl.template;

/** 钩子方法
 * Created by taolang on 2017/5/23.
 */
public class Baoma2 extends BaomaModel{

    private boolean alarmFlag = true;

    public void setAlarm(boolean isAlarm){
        alarmFlag = isAlarm;
    }

    @Override
    protected void start() {
        System.out.println("宝马2发动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马2停车");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马2鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马2引擎发出声响");
    }

}
