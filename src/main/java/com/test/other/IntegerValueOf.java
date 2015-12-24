package com.test.other;

import org.springframework.core.env.SystemEnvironmentPropertySource;

/**
 * Created by wklmogujie on 15/12/23.
 */
public class IntegerValueOf {
    public static void main(String[] args) {
        String testString = "";
        int num = Integer.valueOf(testString);
        System.out.println("num:"+num);
    }
}
