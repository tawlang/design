package com.company.tl.memento;

/**
 * 备忘录模式
 * Created by taolang on 2017/5/22.
 */
public class Client {

    public static void main(String[] args) {
        //打BOSS之前：血、蓝全部满值
        Role role = new Role(100, 100);
        System.out.println("----------大战BOSS之前----------");
        role.showplay();

        //保持进度
        CareTaker caretaker = new CareTaker();
        caretaker.memento = role.saveMemento();

        //大战BOSS，快come Over了
        role.setBloodFlow(20);
        role.setMagicPoint(20);
        System.out.println("----------大战BOSS----------");
        role.showplay();

        //恢复存档
        role.restoreMemento(caretaker.getMemento());
        System.out.println("----------恢复----------");
        role.showplay();

    }

}
