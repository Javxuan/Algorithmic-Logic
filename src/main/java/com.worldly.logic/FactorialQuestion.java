package com.worldly.logic;

/**
 * 题目：利用递归方法求5!。
 * 程序分析：递归公式：fn=fn_1*4!
 * @author xiaoqixuan
 * @create 2017/5/10 11:17
 */
public class FactorialQuestion {
    public static void main(String []args){
        System.out.println(getFactorial(4));
    }

    private static int getFactorial(int n){
        int sum =0;
        if(n==1){
            return sum=n;   //递归的出口 最里层的结果 返回出来。
        } else{
            sum=n*getFactorial(n-1); //然后外层递归 调用里层的结果进行 脱衣服一样一层一层的箱外计算
            return sum;
        }
    }
}
