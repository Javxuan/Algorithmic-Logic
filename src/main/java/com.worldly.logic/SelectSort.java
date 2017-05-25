package com.worldly.logic;

/**
 * 题目：对10个数进行排序
 * 程序分析：可以利用选择法，即从后9个比较过程中，选择一个最小的与第一个元素交换，
 * 下次类推，即用第二个元素与后8个进行比较，并进行交换。
 * @author xiaoqixuan
 * @create 2017/5/11 9:59
 */
public class SelectSort {
    public static void main(String []args){
        int [] arr = {0,1,23,3,4,5,8,10,20,12};
        SelectSort selectSort = new SelectSort();
        selectSort.show(arr);
        System.out.println("--------后---------");
        selectSort.select(arr);
        selectSort.show(arr);
    }

    /**
     * 选择排序的方法
     * @param arr
     */
    public void select(int[]arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>=arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public void show (int[]arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
