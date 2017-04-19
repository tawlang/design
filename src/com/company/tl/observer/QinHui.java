package com.company.tl.observer;

/**
 * Created by taolang on 2017/4/18.
 */
public class QinHui implements Observer{
    @Override
    public void update(String context) {
        System.out.println("秦桧：观察到岳飞活动，准备跟金国汇报！");
        this.reportToQinshihuang(context);
    }

    private void reportToQinshihuang(String context){
        System.out.println("秦桧：报告，金老板，岳飞有活动了-->" + context);
    }


}
