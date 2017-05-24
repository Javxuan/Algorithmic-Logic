package com.worldly.logic;

/**
 * 获取两个字符串中最大相同子串
 * 如： str="woaijava javafuckyouthreetimes"; str2 = "qijavascba";  最大子串=ijava;
 *
 * 思想：
 *  1.先判断两个字符串那两个更大
 *  2.拿小的那个子串来作为遍历
 *  3.从左右两头开始减 来遍历。
 *  4.根据遍历得到的结果与最大子串做处理。
 *
 * @author xiaoqixuan
 * @create 2017/5/24 9:38
 */
public class GetMaxStrQuestion {
    public static void main(String []args){
        String str1 ="cabda";//"woaijava javafuckyouthreetimes";
        String str2 = "abd";//"qijavascba";
        System.out.println(getMax(str2,str1));
    }

    public static String getMax(String str1,String str2){
        String max="",min="";
        min = str1.length()>str2.length()?str2:str1;
        max = min.length()>=str1.length()?str2:str1;

        for(int i=0;i<min.length();i++){
            /**
             * 根据 str1=abd   str2 = cabdca;
             *  先整体判断一下  然后 在左边减一判断一下 bd  获取  (1,3);
             *                  然后 在右边减一判断一下 ab  获取  (0,2);
             */
            for(int y=0,z=min.length()-i;z!=min.length()+1;y++,z++){
                String temp = min.substring(y,z);
                if(max.contains(temp)){
                   return temp;
                }
            }
        }
        return "";
    }

}
