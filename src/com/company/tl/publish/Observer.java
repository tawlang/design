package com.company.tl.publish;

/**
 * Created by taolang on 2017/4/18.
 */
public interface Observer {

    //一旦发现别人有动静，自己也要行动
    public void update(String context);
}
