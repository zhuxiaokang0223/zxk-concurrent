package com.zxk.concurrent.example1;

/**
 * Created by zhuxiaokang on 2018/3/20.
 */
public class Test {

    public void invoke(){
        Sequence sequence = new Sequence();
        Thread t1 = new Thread(new SequenceThread(sequence));
        Thread t2 = new Thread(new SequenceThread(sequence));
        Thread t3 = new Thread(new SequenceThread(sequence));
        Thread t4 = new Thread(new SequenceThread(sequence));
        Thread t5 = new Thread(new SequenceThread(sequence));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    public static void main(String[] args){
        Test test = new Test();
        test.invoke();
    }
}
