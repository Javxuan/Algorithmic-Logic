package com.worldly.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，
 * 特殊情况，闰年且输入月份大于3时需考虑多加一天。
 * @author xiaoqixuan
 * @create 2017/5/12 11:14
 */
public class DayOfYearQuestion {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String day  = in.next();
        System.out.println("日期："+day+"是该年的第"+dayNo(day)+"天");
    }

    /**
     * 润年 ：年份%4==0
     * @param date
     * @return
     */
    public static int dayNo(String date){
        int no=0;
        try {
            Date day = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(day);
            no = calendar.get(Calendar.DAY_OF_YEAR);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return no;
    }

}
