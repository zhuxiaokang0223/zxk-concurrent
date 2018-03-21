package com.zxk.concurrent.example3;

import com.zxk.common.annotation.NotThreadSafe;

/**
 * 此类是非线程安全的类 。
 * 且失效值问题更容易出现：如果一个线程调用了set，那么另一个正在调用get的线程可能会看到更新后的value值，也可能看不到
 *
 * Created by zhuxiaokang on 2018/3/21.
 */
@NotThreadSafe
public class Mutableinteger {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
