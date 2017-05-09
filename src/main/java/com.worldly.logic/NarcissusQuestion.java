package com.worldly.logic;

/**
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 * @author xiaoqixuan
 * @create 2017/5/9 10:31
 */
public class NarcissusQuestion {
    public static void main(String []args){
        for(int i=100;i<=999;i++){
            int b = i/100;
            int s = (i%100)/10;
            int g = (i%100)%10;

            if(i==(Math.pow(b,3)+Math.pow(s,3)+Math.pow(g,3))){
                System.out.println(i+" 水仙花数");
            }
        }
    }
}
