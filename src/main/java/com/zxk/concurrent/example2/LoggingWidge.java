package com.zxk.concurrent.example2;

import com.zxk.common.annotation.ThreadSafe;

/**
 * 内置锁是可重入的
 * Created by zhuxiaokang on 2018/3/21.
 */
@ThreadSafe
public class LoggingWidge extends Widge {

    /**
     * 调用doSomething时，会先获取Widge对象锁
     * 如果内置锁是不可重入的，那么此方法将死锁
     */
    @Override
    public synchronized void doSomething() {
        System.err.println("Logging doSomething");
        super.doSomething();
    }
}
