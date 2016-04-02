package com.test.Btrace;

public class Counter {
    // 总数
    private static int totalCount = 0;

    public int add(int num, int countMachine) throws Exception {
        totalCount += num;
        sleep();
        return totalCount;
    }

    public void sleep() throws Exception {
        Thread.sleep(1000);
    }

}