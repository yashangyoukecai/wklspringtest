package com.test.dateweektest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by wklmogujie on 15/9/30.
 */
public class DateWeekTest {
    public static final int MonDay = 1;
    public static final int TuesDay = 2;
    public static final int WednesDay = 3;
    public static final int ThursDay = 4;
    public static final int FriDay = 5;
    public static final int SaturDay = 6;
    public static final int SunDay = 7;


    public static void  main(String[] args) throws IOException {
        String startDate = null;
        String endDate = null;

        startDate = getStartDate(3);
        endDate = getEndDate(3);
        Date today=new Date();
        Calendar curr = Calendar.getInstance();
        System.out.println("calendar hour" + curr.get(Calendar.HOUR_OF_DAY));
        System.out.println("calendar nowtime" + curr.getTime().getTime()/1000);
        System.out.println("calendar pasttime" + curr.getTime().getTime()/1000%86400);
        System.out.println("date nowtime" + today.getTime()/1000);
        System.out.println("date pasttime" + (today.getTime()/1000) % 86400);
        System.out.println("startdate" + startDate);
        System.out.println("endDate" + endDate);
    }

    private static int GetWeekDay(){

        Calendar c = Calendar.getInstance();
        if(Calendar.MONDAY == c.get(Calendar.DAY_OF_WEEK)){
            return MonDay;
        }
        if(Calendar.TUESDAY == c.get(Calendar.DAY_OF_WEEK)){
            return TuesDay;
        }
        if(Calendar.WEDNESDAY == c.get(Calendar.DAY_OF_WEEK)){
            return WednesDay;
        }
        if(Calendar.THURSDAY == c.get(Calendar.DAY_OF_WEEK)){
            return ThursDay;
        }
        if(Calendar.FRIDAY == c.get(Calendar.DAY_OF_WEEK)){
            return FriDay;
        }
        if(Calendar.SATURDAY == c.get(Calendar.DAY_OF_WEEK)){
            return SaturDay;
        }
        if(Calendar.SUNDAY == c.get(Calendar.DAY_OF_WEEK)){
            return SunDay;
        }
        return -1;
    }

    public static String getEndDate(int weekNum) {
        int weekday = GetWeekDay();
        if(weekday > 2) {
            Calendar curr = Calendar.getInstance();
            curr.add(Calendar.DATE, (7*weekNum - weekday));
            Date date = curr.getTime();
            return new SimpleDateFormat("yyyy-MM-dd").format(date);
        }
        else if(weekday < 2) {
            Calendar curr = Calendar.getInstance();
            curr.add(Calendar.DATE, (7*(weekNum-1) - weekday));
            Date date = curr.getTime();
            return new SimpleDateFormat("yyyy-MM-dd").format(date);
        }
        else {
            Calendar curr = Calendar.getInstance();
            if(curr.get(Calendar.HOUR_OF_DAY) < 12) {
                curr.add(Calendar.DATE, (7*(weekNum-1) - weekday));
                Date date = curr.getTime();
                return new SimpleDateFormat("yyyy-MM-dd").format(date);
            }
            else {
                curr.add(Calendar.DATE, (7*weekNum - weekday));
                Date date = curr.getTime();
                return new SimpleDateFormat("yyyy-MM-dd").format(date);
            }
        }
    }

    public static String getStartDate(int weekNum) {
        int weekday = GetWeekDay();
        if(weekday > 2) {
            Calendar curr = Calendar.getInstance();
            curr.add(Calendar.DATE, (7*weekNum - 6 - weekday));
            Date date = curr.getTime();
            return new SimpleDateFormat("yyyy-MM-dd").format(date);
        }
        else if(weekday < 2) {
            Calendar curr = Calendar.getInstance();
            curr.add(Calendar.DATE, (7*(weekNum-1) - 6 - weekday));
            Date date = curr.getTime();
            return new SimpleDateFormat("yyyy-MM-dd").format(date);
        }
        else {
            Calendar curr = Calendar.getInstance();
            if(curr.get(Calendar.HOUR_OF_DAY) < 12) {
                curr.add(Calendar.DATE, (7*(weekNum-1) - 6 - weekday));
                Date date = curr.getTime();
                return new SimpleDateFormat("yyyy-MM-dd").format(date);
            }
            else {
                curr.add(Calendar.DATE, (7*(weekNum) - 6 - weekday));
                Date date = curr.getTime();
                return new SimpleDateFormat("yyyy-MM-dd").format(date);
            }
        }
    }

    private static String getStartDateByDate(int weekNum) {
        int weekday = GetWeekDay();
        Date today=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        weekday = 2;
        if(weekday > 2) {
            return dateFormat.format(new Date(today.getTime() + (long) ((7 * weekNum - 6 - weekday - 4) * 24 * 60 * 60 * 1000)));
        }
        else if(weekday < 2) {
            return dateFormat.format(new Date(today.getTime() + (long) ((7 * (weekNum-1) - 6 - weekday - 4) * 24 * 60 * 60 * 1000)));
        }
        else {
            if((today.getTime()/1000) % 86400 < 14400) {
                return dateFormat.format(new Date(today.getTime() + (long) ((7 * (weekNum-1) - 6 - weekday - 4) * 24 * 60 * 60 * 1000)));
            }
            else {
                return dateFormat.format(new Date(today.getTime() + (long) ((7 * weekNum - 6 - weekday - 4) * 24 * 60 * 60 * 1000)));
            }
        }
    }

    private static String getEndDateByDate(int weekNum) {
        int weekday = GetWeekDay();
        Date today=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        weekday = 2;
        if(weekday > 2) {
            return dateFormat.format(new Date(today.getTime() + (long) ((7*weekNum - weekday - 4) * 24 * 60 * 60 * 1000)));
        }
        else if(weekday < 2) {
            return dateFormat.format(new Date(today.getTime() + (long) ((7*(weekNum-1) - weekday - 4) * 24 * 60 * 60 * 1000)));
        }
        else {
            if((today.getTime()/1000) % 86400 < 14400) {
                return dateFormat.format(new Date(today.getTime() + (long) ((7*(weekNum-1) - weekday - 4) * 24 * 60 * 60 * 1000)));
            }
            else {
                return dateFormat.format(new Date(today.getTime() + (long) ((7*weekNum - weekday - 4) * 24 * 60 * 60 * 1000)));
            }
        }
    }
}
