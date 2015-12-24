package com.test.other;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

/**
 * Created by wklmogujie on 15/12/24.
 */
public class split {
    public static void main(String[] args) {
        String a="test";
        String[] t = a.split("-");
        for(int i=0; i<t.length; i++){
            System.out.println("t["+i+"]:"+t[i]);
        }

    }


}