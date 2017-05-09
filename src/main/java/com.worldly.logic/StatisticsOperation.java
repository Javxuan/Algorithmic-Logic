package com.worldly.logic;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * @author xiaoqixuan
 * @create 2017/5/9 16:19
 */
public class StatisticsOperation {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char [] ch = str.toCharArray();

        int strCount=0;
        int numCount=0;
        int spaceCount=0;
        int otherCount=0;

        //利用 String.matches(regex) 来判断一个字符的类别然后做相应的统计
        String regexChar ="[a-zA-Z]";
        String regexNumber="[0-9]";
        String regexSpace="[\\s]";
        String regexOther = "[^a-zA-Z0-9\\s]";

        for(char c:ch){
            if(String.valueOf(c).matches(regexChar))  //把其他基本类转化为String类型，然后再调用matches(regex)
                strCount++;
            else if(String.valueOf(c).matches(regexNumber))
                numCount++;
            else if(String.valueOf(c).matches(regexSpace))
                spaceCount++;
            else
                otherCount++;
        }

        System.out.println("英文字母个数："+strCount+" 数字个数："+numCount+" 空格个数："+spaceCount+" 其他字符个数："+otherCount);


    }
}
