package com.company;

/**
 * Created by sunyinhui on 2016/8/28.
 */
public class TraditionalThreadSynchronized {
    public static void main(String[] args) {
        final Outputer outputer = new Outputer();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    outputer.output("sunyinhui");
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    outputer.output("www.beibei");
                }
            }
        }).start();
    }

}

class Outputer {
    public void output(String name) {
        int len = name.length();
        for (int i = 0; i < len; i++) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
}

