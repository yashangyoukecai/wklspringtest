package com.test.AutoWireTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wklmogujie on 15/9/24.
 */
public class test {
    public static void main(String[] args) {
        String[] locations = {"AutoWireTest.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(locations);
        AutoWireTest test1 = (AutoWireTest) ctx.getBean("AutoWireTest");
        System.out.println(test1);
    }
}
