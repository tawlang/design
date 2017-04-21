package com.company.tl.command;

/**
 * Created by taolang on 2017/4/21.
 */
public class Client {

    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("----------客户要求增加一项功能-------------");
        Command command = new AddRequirementCommand();
        manager.setCommand(command);
        manager.action();
    }
}
