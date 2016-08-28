package com.company;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by sunyinhui on 2016/8/28.
 */
public class TraditionalTimer {
    public static void main(String[] args) {
        /**
         * 每隔3s
         */
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("bombing");
            }
        }, 1000, 3000);

        /**
         *交替 2s之后bomb,然后4s之后bomb
         */
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("每隔2s bomb");
                // 再搞个定时器
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("每隔4s bomb");
                    }
                }, 4000);
            }
        }, 2000);

        /**
         *交替 2s之后bomb,然后4s之后bomb
         */

         class  MyTimerTask extends TimerTask {
            @Override
            public void run() {
                System.out.println("每隔   2s bomb");
                new Timer().schedule(new MyTimerTask(),2000);
            }
        }

        new Timer().schedule(new MyTimerTask(),2000);





        while(true) {
            System.out.println(new Date().getSeconds());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
