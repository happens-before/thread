package com.xupt.edu.thread;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("zhaowanyue2");
    }
    public static void main(String [] args)
    {
        new Thread(new Thread2()).start();
    }
}
