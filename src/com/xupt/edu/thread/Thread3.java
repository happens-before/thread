package com.xupt.edu.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Thread3 implements Callable{
    @Override
    public String call() throws Exception {
        String string=new String ("zhaowanyue3");
        return  string;
    }
    public static void main(String[] args)
    {
        Future future=new Future(Th) ;
    }
}
