package com.solvd.cafe.sideTasks;

import com.solvd.cafe.dataManagement.OrderManagement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadTask extends Thread{
    private static final Logger threadLogger = LogManager.getLogger(ThreadTask.class);

    @Override
    public void run(){
        for(int i = 1; i<=5;i++){
            threadLogger.info(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadTask threadTask = new ThreadTask();
        ThreadTask threadTask2 = new ThreadTask();

        threadTask.start();
        threadTask2.start();
    }
}
