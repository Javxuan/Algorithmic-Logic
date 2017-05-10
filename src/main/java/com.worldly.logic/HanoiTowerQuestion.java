package com.ht.report.controller;

/**
 * 汉诺塔问题问题描述：假设有3个分别命名为X、Y和Z的塔座，在塔座X上插有n个直径大小各不相同、按从小到大编号为1,2，...，n的圆盘(如图所示)。
 * 现要求将X轴上的n个圆盘移至塔座Z上并仍按同样顺序叠排，圆盘移动时必须
 * 遵循下列规则：
 * （1）每次只能移动一个圆盘；
 * （2）圆盘可以插在X、Y和Z中的任一塔座上；
 * （3）任何时刻都不能讲一个较大的圆盘压在较小的圆盘之上。请问如何移？要移多少次？
 * @author xiaoqixuan
 * @create 2017/5/10 11:34
 */
public class HanoiTowerQuestion {
    public static void main(String []args){
        HanoiTowerQuestion hanoiTowerQuestion = new HanoiTowerQuestion();
        hanoiTowerQuestion.getNumberOfTimes(3,'x','y','z');

    }
    int c=0;
    private  void getNumberOfTimes(int n,char x,char y,char z){
        if(n==1){ //当只有一个盘子的时候 就直接重 x-->z
            System.out.println(++c +"次 disk "+n +" from "+x+" move to "+z);
        }else{
            /**
             * 先将n-1个盘子 借助目的z塔 从x --->y上
             */
            getNumberOfTimes(n-1,x,z,y); //要将n-1 个盘重 x->y
            System.out.println(++c +"次 disk "+n +" from "+x+" move to "+z);
            /**
             * 然后将n-1个盘子 借助x塔 从 y --->z 上
             */
            getNumberOfTimes(n-1,y,x,z); //要将n-1个盘重 y->z
        }
    }
}
