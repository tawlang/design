package com.company.tl.bridge;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by taolang on 2017/4/1.
 */
public class SourceSub1 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }

}
