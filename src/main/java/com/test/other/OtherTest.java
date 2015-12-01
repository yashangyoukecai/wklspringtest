package com.test.other;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wklmogujie on 15/11/17.
 */
public class OtherTest {
    public static void  main(String[] args) throws IOException {
        Map<String, Object> objectMap = new HashMap<String, Object>();
        objectMap.put("bid",5000);
        if(objectMap.get("bid").equals(2000)) {
            System.out.print("true");
            return;
        }
        else{
            System.out.print("false");
            return;
        }
    }

}
