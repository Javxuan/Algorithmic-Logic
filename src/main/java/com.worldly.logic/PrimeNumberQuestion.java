package com.worldly.logic;

/**
 * 题目：判断101-200之间有多少个素数，并输出所有素数。程序分析：
 * 判断素数的方法：如果一个数只能被1和本身整除才是素数，不然就不是。
 * @author xiaoqixuan
 * @create 2017/5/9 9:43
 */
public class PrimeNumberQuestion {
    public static void main(String[]args){
        boolean flag = true;
        for(int i=101;i<=200;i++){
           flag=isPrime(i);
           if(flag) {
               System.out.println(i + "是素数");
           }else{
               System.out.println(i+"不是素数");
           }
        }
    }

    private static boolean isPrime(int number){
        boolean flag = true;
        if(number<2){
           flag=false;
        } else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
}
