package com.company.tl.bridge;

/**
 * Created by taolang on 2017/4/1.
 */

/**
 * 1、abstract 修饰类，会使这个类成为一个抽象类，这个类将不能生成对象实例，可以做为对象变量声明的类型，也就是编译时类型，
 * 抽象类就像当于一类的半成品，需要子类继承并覆盖其中的抽象方法。
 * 2、abstract 修饰方法，会使这个方法变成抽象方法，声明（定义）而没有实现，实现部分以"；"代替。需要子类继承实现（覆盖）。
 * 3、abstract 修饰符在修饰类时必须放在类名前。
 * 4、abstract 修饰方法就是要求其子类覆盖（实现）这个方法。调用时可以以多态方式调用子类覆盖（实现）后的方法，也就是说抽象方法必须在其子类中实现，除非子类本身也是抽象类。
 * 5、父类是抽象类，有抽象方法，子类继承父类，并把父类中的所有抽象方法都实现（覆盖），抽象类中有构造方法，是子类在构造子类对象时需要调用的父类（抽象类）的构造方法。
 */
public abstract class Bridge {

    private  Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
