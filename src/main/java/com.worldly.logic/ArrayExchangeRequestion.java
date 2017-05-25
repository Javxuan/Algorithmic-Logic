package com.worldly.logic;

/**
 * 将一个数组逆序输出。
 * 程序分析：用第一个与最后一个交换。
 * @author xiaoqixuan
 * @create 2017/5/11 9:22
 */
public class ArrayExchangeRequestion {
    public static void main(String []args){
        int [] arr ={1,12,31,44,5,61,7,81,9,10};
        ArrayExchangeRequestion arrayExchangeRequestion = new ArrayExchangeRequestion();
        arrayExchangeRequestion.show(arr);
        arrayExchangeRequestion.exchage(arr);
        System.out.println("\n"+"---------后------------");
        arrayExchangeRequestion.show(arr);
    }

    public void exchage(int[] arr){
        int temp=0;
        //要确定分界值
       for(int i=0;i<arr.length/2;i++){
           temp = arr[i];
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;
       }
    }

    public void show(int[]arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }

}
