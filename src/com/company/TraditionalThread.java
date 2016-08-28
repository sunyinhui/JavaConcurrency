package com.company;

/**
 * Created by sunyinhui on 2016/8/27.
 */
public class TraditionalThread {
    public static void main(String[] args) {
//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//               mainrun();
//            }
//        };
//        thread.start();


//        // 另一方式
//        Thread threadSecond = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                    mainrun();
//            }
//        });

//        threadSecond.start();

        new  Thread(new Runnable() {
            @Override
            public void run() {
                mainrun();
            }
        }){
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("new Thread " + Thread.currentThread().getName());
                }
            }
        }.start();
        /**
         *
         */
//        Thread threadThird = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                mainrun();
//            }
//        }){
//            public void run() {
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.print("threadThird " + Thread.currentThread().getName());
//            }
//        };
//        threadThird.start();



    }

    public static void mainrun() {
        while(true) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                }
    }
}
