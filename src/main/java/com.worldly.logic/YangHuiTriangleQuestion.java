package com.worldly.logic;

import java.util.Scanner;

/**
 * 杨辉三角问题。
 * 1               0    1
 * 1 1             1    2
 * 1 2 1           2    3
 * 1 3 3 1         3    4
 * 1 4 6 4 1       4    5
 * 1 5 10 10 5 1   5    6

 * @author xiaoqixuan
 * @create 2017/5/25 8:58
 */
public class YangHuiTriangleQuestion {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        int [][] arr=new int[n][];

        /**
         *   遍历第一层数组
         */
        for(int x=0;x<arr.length;x++){
            /**
             * 初始化 第二层数组
             */
            arr[x]= new int[x+1];
            for(int y=0;y<arr[x].length;y++){
                if(x==0||y==0||x==y){
                    arr[x][y]=1;
                }else {
                    arr[x][y] = arr[x-1][y] + arr[x-1][y-1];
                }
            }
        }

        /**
         * 循环遍历二维数组，得到相关的值。
         */
        for(int x=0;x<arr.length;x++){
            for(int y=0;y<arr[x].length;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }
}
