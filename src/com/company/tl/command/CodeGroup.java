package com.company.tl.command;

/**
 * Created by taolang on 2017/4/21.
 */
public class CodeGroup extends Group{

    @Override
    public void find() {
        System.out.println("-----找到代码组---->");
    }

    @Override
    public void add() {
        System.out.println("-----客户要求添加一个功能---->");
    }

    @Override
    public void delete() {
        System.out.println("-----客户要求删除一个功能---->");
    }
}
