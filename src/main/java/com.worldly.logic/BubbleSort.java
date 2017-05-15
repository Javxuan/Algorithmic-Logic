package com.ht.report.controller;

/**
 * @author xiaoqixuan
 * @create 2017/5/15 16:36
 */
public class BubbleSort {
    public static void main(String []args){
        int [] arr={5,1,3,4,7,9,9,10,11};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.show(arr);
        System.out.println();
        bubbleSort.bubbleSort(arr);
        bubbleSort.show(arr);

    }

    public void bubbleSort(int []arr){
        int temp =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-i-1;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public void show(int[] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
