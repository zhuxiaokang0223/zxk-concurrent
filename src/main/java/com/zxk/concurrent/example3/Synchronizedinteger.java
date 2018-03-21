package com.zxk.concurrent.example3;

import com.zxk.common.annotation.GuardedBy;
import com.zxk.common.annotation.ThreadSafe;

/**
 * 这是一个线程安全的类
 * 由Mutableinteger类改变而来，可以避免获取失效值
 * Created by zhuxiaokang on 2018/3/21.
 */
@ThreadSafe
public class Synchronizedinteger {

    @GuardedBy("this")
    private int value;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }
}
