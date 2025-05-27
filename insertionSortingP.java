package com.practise;

public class insertionSortingP {
    public static  void sort(int []arr){
        int n=arr.length;
        for (int i = 1; i <n ; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int []arr={3,4,2,54,7,43,};
        sort(arr);
        for (int num:arr){
            System.out.println(num+" ");
        }
    }
}