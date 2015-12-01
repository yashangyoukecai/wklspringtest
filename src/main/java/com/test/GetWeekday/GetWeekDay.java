package com.test.GetWeekday;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by wklmogujie on 15/9/23.
 */
public class GetWeekDay {
    public static void  main(String[] args) throws IOException{

    Calendar c = Calendar.getInstance();
        Calendar curr = Calendar.getInstance();
        int weekday = 1;
        if(weekday > 2) {
            curr.add(Calendar.DATE, (2 - weekday));
        }
        else if(weekday < 2) {
            curr.add(Calendar.DATE, (-5 - weekday));
        }
        else {
            if(curr.get(Calendar.HOUR_OF_DAY) < 12) {
                curr.add(Calendar.DATE, (-5 - weekday));
            }
            else {
                curr.add(Calendar.DATE, (2 - weekday));
            }
        }
        curr.set(Calendar.HOUR_OF_DAY, 0);
        curr.set(Calendar.SECOND, 0);
        curr.set(Calendar.MINUTE, 0);
        curr.set(Calendar.MILLISECOND, 0);
        Integer created = (int)(curr.getTime().getTime()/1000 + 43200);
        System.out.println(created);
        Date ll = new Date(1447948800000L);
        System.out.println(ll);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        System.out.println(curr.getTime());
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
