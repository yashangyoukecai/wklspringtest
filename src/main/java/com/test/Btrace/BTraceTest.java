package com.test.Btrace;

import java.util.Random;

    public class BTraceTest {

    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int countMachine = 0;
        // 计数器
        Counter counter = new Counter();
        while (true) {
            // 每次增加随机值
            countMachine++;
            counter.add(random.nextInt(10), countMachine);
            Thread.sleep(1000);
        }
    }
}