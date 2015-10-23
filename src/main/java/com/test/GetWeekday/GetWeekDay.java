package com.test.GetWeekday;

import java.io.IOException;
import java.util.Calendar;

/**
 * Created by wklmogujie on 15/9/23.
 */
public class GetWeekDay {
    public static void  main(String[] args) throws IOException{

    Calendar c = Calendar.getInstance();
    if(Calendar.MONDAY == c.get(Calendar.DAY_OF_WEEK)){
        System.out.println("星期一");
    }
    if(Calendar.TUESDAY == c.get(Calendar.DAY_OF_WEEK)){
        System.out.println("星期二");
    }
    if(Calendar.WEDNESDAY == c.get(Calendar.DAY_OF_WEEK)){
        System.out.println("星期三");
    }
    if(Calendar.THURSDAY == c.get(Calendar.DAY_OF_WEEK)){
        System.out.println("星期四");
    }
    if(Calendar.FRIDAY == c.get(Calendar.DAY_OF_WEEK)){
        System.out.println("星期五");
    }
    if(Calendar.SATURDAY == c.get(Calendar.DAY_OF_WEEK)){
        System.out.println("星期六");
    }
    if(Calendar.SUNDAY == c.get(Calendar.DAY_OF_WEEK)){
        System.out.println("星期日");
    }
    return;
    }
}
