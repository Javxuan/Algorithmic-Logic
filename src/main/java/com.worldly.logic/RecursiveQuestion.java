package com.worldly.logic;

/**
 * 题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。
 * 问第4个人岁数，他说比第3个人大2岁。
 * 问第三个人，又说比第2人大两岁。
 * 问第2个人，说比第一个人大两岁。
 * 最后问第一个人，他说是10岁。
 * 请问第五个人多大？
 * 程序分析：利用递归的方法，递归分为回推和递推两个阶段。
 * 要想知道第五个人岁数，需知道第四人的岁数，依次类推，推到第一人（10岁），再往回推。
 * @author xiaoqixuan
 * @create 2017/5/10 10:41
 */
public class RecursiveQuestion
{
    public static void main(String []args){
        int age = 10;
        int offSet =2;

        int previous = getPrevious(5,10,2);
        System.out.println(previous);

    }

    private static int getPrevious(int index,int age,int offSet){
       if(index==1) {
           return age;
       }else{
            age= age+offSet;
            index--;
            return getPrevious(index,age,offSet);
        }
    }
}
