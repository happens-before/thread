package com.xupt.edu.thread;

public class Thread1 extends Thread{

    public void run()
    {
        System.out.println("zhaowanyue1");
    }
    public static void main(String []args)
    {
        new Thread1().start();
    }
}