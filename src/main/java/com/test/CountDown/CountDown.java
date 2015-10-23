package com.test.CountDown;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by wklmogujie on 15/9/29.
 */
public class CountDown {
    public static void main(String[] args){
        long ll;
        long l=System.currentTimeMillis();
        ll = l;
        while(true){
            System.out.println("倒计时开始！");
            l=System.currentTimeMillis();
            long d = l-ll;
            if(d%1000 == 0)
                System.out.println(new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date(l)));
            if(d>60000) {
                System.out.println("倒计时结束！");
                break;
            }
        }
    }
}
