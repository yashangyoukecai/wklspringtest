package com.test.Thread;

/**
 * Created by wklmogujie on 15/9/24.
 */
public class TestThread{
    public static void main(String[] args){
        Runner1 r=new Runner1();
        //r.run();//这是方法调用，而不是开启一个线程
        Thread t=new Thread(r);//调用了Thread(Runnable target)方法。且父类对象变量指向子类对象。
        t.start();
        for(int i=0;i<100;i++){
            System.out.println("进入Main Thread运行状态");
            System.out.println(i);
        }
    }
}
class Runner1 implements Runnable{ //实现了这个接口，jdk就知道这个类是一个线程
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("进入Runner1运行状态");
            System.out.println(i);
        }
    }
}