package com.worldly.logic;

import java.util.Scanner;

/**
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
 * (2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 * @author xiaoqixuan
 * @create 2017/5/9 10:52
 */
public class FactorQuestion {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(index+"=");
        String s = getFactor(2,index,sb);
        System.out.println(s);
    }

    private static String  getFactor(int minPrime,int number,StringBuilder sb){
       if(isPrime(minPrime)) {
           if (number == minPrime) {
               sb.append(minPrime);
           } else {
               if (number % minPrime == 0) {
                   sb.append(minPrime+"*");
                   number = number / minPrime;
                   if(isPrime(number)){
                       sb.append(number);
                   }
               } else {
                   minPrime = minPrime + 1;
               }
               getFactor(minPrime, number,sb);
           }
       }
       return sb.toString();
    }

    private static boolean isPrime(int number){
        boolean flag = true;
        if(number<2){  //质数 都是大于=2的
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
