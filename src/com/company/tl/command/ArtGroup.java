package com.company.tl.command;

/**
 * Created by taolang on 2017/4/21.
 */
public class ArtGroup extends Group{

    @Override
    public void find() {
        System.out.println("-----找到美工组---->");
    }

    @Override
    public void add() {
        System.out.println("-----客户要求添加一个页面---->");
    }

    @Override
    public void delete() {
        System.out.println("-----客户要求删除一个页面---->");
    }
}
