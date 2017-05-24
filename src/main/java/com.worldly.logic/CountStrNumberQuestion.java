package com.worldly.logic;

/**
 * 统计一个字符串 targetStr 在另外一个字符串 srcStr里出现的次数
 *  1.先看下此targetStr在 srcStr里面是否存在， 同时定义一个记录出现次数的变量count
 *  2.如果返回值为-1 则说明不存在，否则的话就是存在  count++;
 *  3.然后将 srcStr.indexOf(targetStr)的索引 start， 然后将 srcStr.subString(start+targetStr.length()) 截取新的字符串
 *  然后将截取的新字符串赋值给 srcStr.
 *  4.重复2,3的步骤，采用递归。
 *  5.最后返回 count;
 * @author xiaoqixuan
 * @create 2017/5/24 9:23
 */
public class CountStrNumberQuestion {
    public static void main(String []args){
        String str1 = "woaijava zhendeaijava javaismylife wo zhendeaijavaai";
        String str2 ="java";
        System.out.println(getCount(str2,str1));
    }
    private static int count=0;
    public static int getCount(String targetStr,String srcStr){
        if(srcStr.indexOf(targetStr)==-1)
            return 0;
        int start = srcStr.indexOf(targetStr);
        count++;
        srcStr = srcStr.substring(start+targetStr.length());
        getCount(targetStr,srcStr);
        return count;
    }
}
