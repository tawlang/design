package com.company.tl.command;

/**
 * Created by taolang on 2017/4/21.
 */
public class RequirementGroup extends Group{

    @Override
    public void find() {
        System.out.println("-----找到需求组---->");
    }

    @Override
    public void add() {
        System.out.println("-----客户要求添加一个需求---->");
    }

    @Override
    public void delete() {
        System.out.println("-----客户要求删除一个需求---->");
    }
}
