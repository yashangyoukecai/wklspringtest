package com.test.AutoWireTest;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by wklmogujie on 15/9/24.
 */

public class AutoWireTest {
    @Autowired
    private car car = null;

    @Autowired
    private office office = null;

    @Override
    public String toString() {
        return "car:" + car + "/n" + "office:" + office;
    }

}

