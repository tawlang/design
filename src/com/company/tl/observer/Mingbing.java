package com.company.tl.observer;

/**
 * Created by taolang on 2017/4/18.
 */
public class Mingbing implements Observer {
    @Override
    public void update(String context) {
        System.out.println("民兵：观察到岳飞活动，我也得做出行动！");
        this.happy(context);
        System.out.println("民兵： 跟随岳飞...");
    }

    private void happy(String context){
        System.out.println("民兵： 因为 "+ context + ", --所以我要走了。");
    }
}


