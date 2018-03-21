package com.zxk.concurrent.example1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by zhuxiaokang on 2018/3/20.
 */
public class SequenceThread implements Runnable {

    Logger logger = LogManager.getLogger(SequenceThread.class);

    private Sequence sequence;

    public SequenceThread(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {

        for (int i = 0;i<100;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            logger.info(sequence.getValue());
        }
    }
}
