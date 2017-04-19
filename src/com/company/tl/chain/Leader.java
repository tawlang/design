package com.company.tl.chain;

/**
 * Created by taolang on 2017/4/19.
 */
// 抽象处理
public abstract class Leader {

    /** 姓名 **/
    public String name;

    /** 后继者 **/
    protected Leader successor;

    public Leader(String name){
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(LeaveNode LeaveNode);

}
