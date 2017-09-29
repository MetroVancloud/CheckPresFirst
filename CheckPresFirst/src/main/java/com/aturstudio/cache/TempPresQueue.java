package com.aturstudio.cache;

import com.aturstudio.pojo.TempPres;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by vancloud on 2017/9/29.
 */
public class TempPresQueue {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private BlockingQueue<String> tempPresQueue4Dispathing;
    private BlockingQueue<String> tempPresQueue4Inserting;

    private static TempPresQueue ourInstance = new TempPresQueue();

    public static synchronized TempPresQueue getInstance() {
        return ourInstance;
    }

    private TempPresQueue() {
        tempPresQueue4Dispathing = new LinkedBlockingDeque<String>();
        tempPresQueue4Inserting = new LinkedBlockingQueue<String>();
    }

    public BlockingQueue<String> getTempPresQueue4Dispathing() {
        return tempPresQueue4Dispathing;
    }

    public BlockingQueue<String> getTempPresQueue4Inserting() {
        return tempPresQueue4Inserting;
    }
}
