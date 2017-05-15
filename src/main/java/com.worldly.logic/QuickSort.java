package com.ht.report.controller;

/**
 * @author xiaoqixuan
 * @create 2017/5/15 10:54
 */
public class QuickSort {

    public static void main(String []args){
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        System.out.println("排序开始之前的顺序"+"");
        QuickSort quickSort = new QuickSort();
        quickSort.show(arr);
        quickSort.quickSort(arr,0,arr.length-1);
        System.out.println("\n"+"排序之后的顺序");
        quickSort.show(arr);

    }

    public void quickSort(int [] arr,int left,int right){
        int i,j,t,temp;
        if(left>right){
            return;
        }
        temp=arr[left]; //temp中存的就是基准数
        i=left;    // 0 1 2 3 4 5 6 7 8 9
        j=right;  // 6  1 2 7 9 3 4 5 10 8
        while(i!=j) {
            while (arr[j] >= temp && i < j)   //  j = 7;  j= 6
                j--;
            while (arr[i] <= temp && i < j)  // i= 3 ; i=5
                i++;
            if (i < j) {  //3<7  5<7    // 判断 左边和右边的
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
            arr[left]=arr[i];  //
            arr[i]=temp;

            quickSort(arr,left,i-1);
            quickSort(arr,i+1,right);
    }

        public void show(int arr[]){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
