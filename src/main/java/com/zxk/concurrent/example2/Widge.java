package com.zxk.concurrent.example2;

import com.zxk.common.annotation.ThreadSafe;

/**
 * Created by zhuxiaokang on 2018/3/21.
 */
@ThreadSafe
public class Widge {

    public synchronized void doSomething(){
        System.err.println("widge doSomething");
    }
}
