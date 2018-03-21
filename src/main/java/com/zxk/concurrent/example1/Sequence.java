package com.zxk.concurrent.example1;

import com.zxk.common.annotation.GuardedBy;
import com.zxk.common.annotation.ThreadSafe;

/**
 * 线程安全的数值序列生成器
 * Created by zhuxiaokang on 2018/3/20.
 */
@ThreadSafe
public class Sequence {

    @GuardedBy("this")
    private int value;

    public synchronized int getValue() {
        return value++;
    }
}
