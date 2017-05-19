package com.company.tl.memento;

/**
 * Created by taolang on 2017/5/19.
 */
public class Role {
    private int bloodFlow;

    private int magicPoint;

    public Role(int bloodFlow, int magicPoint) {
        this.bloodFlow = bloodFlow;
        this.magicPoint = magicPoint;
    }

    public int getBloodFlow() {
        return bloodFlow;
    }

    public void setBloodFlow(int bloodFlow) {
        this.bloodFlow = bloodFlow;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    /**
     * 展示角色当前状况
     */
    public void display(){
        System.out.println("用户当前状态：");
        System.out.println("血量:" + getBloodFlow() + ";蓝量:" + getMagicPoint());
    }

    /**
     * 保持存档、当前状况
     * @return
     */
    public Memento saveMemento(){
        return new Memento(getBloodFlow(), getMagicPoint());
    }

}
