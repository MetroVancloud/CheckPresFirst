package com.aturstudio.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by vancloud on 2017/9/30.
 */
public class CheckPresFirstListener implements ServletContextListener{
    private ExecutorService executorService;

    public CheckPresFirstListener() {
        executorService = Executors.newCachedThreadPool();
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        executorService.execute(new InsertTempPresTask());
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        executorService.shutdown();
    }
}
