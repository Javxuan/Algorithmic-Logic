package com.worldly.logic;

import java.util.Scanner;

/**
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，
 * 60-89分之间的用B表示，60分以下的用C表示。
 * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
 * @author xiaoqixuan
 * @create 2017/5/9 15:55
 */
public class TernaryOperation {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        System.out.println(score<60?'C':((score>=60&&score<=89)?'B':'A'));
    }
}
