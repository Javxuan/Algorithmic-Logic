package com.worldly.logic;

import java.util.Scanner;

/**
 * 经典兔子问题
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子对数为多少？程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 * @author xiaoqixuan
 * @create 2017/5/9 9:06
 */
public class RabbitQuestion {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int index = in.nextInt(); //输入的月份
        int monthTotal=1;
        int [] arr = new int[index];
        arr[0]=1;
        arr[1]=1;
        for(int i=0;i<index;i++) {
            if (i <=1) {
                monthTotal=arr[i];
            } else {
                arr[i]=arr[i-1]+arr[i-2];
                monthTotal=arr[i];
            }
            System.out.println((i+1)+" 月的 monthTotal ="+ monthTotal);
        }

    }
}
