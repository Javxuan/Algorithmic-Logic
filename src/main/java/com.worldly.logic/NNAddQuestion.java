package com.worldly.logic;

import javax.script.ScriptContext;
import java.util.Scanner;

/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 * 程序分析：关键是计算出每一项的值。
 * @author xiaoqixuan
 * @create 2017/5/12 10:33
 */
public class NNAddQuestion {

    public static  void main(String []args){
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        int sum=0;
        for(int i=1;i<=times;i++){
            sum+=getN(2,i);
        }
        System.out.println(sum);
    }

    public static int getN(int n,int times){
        int per=0;
        for(int i=1;i<=times;i++){
            per+=n*Math.pow(10,i-1);
        }
        return per;
    }

}
