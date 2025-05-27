package com.practise;

public class bubbleSortingP {
    public static  void sort(int []arr){
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            boolean swapped=false;
            for (int j = 0; j <n-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }

            }
            if (!swapped ) break;

        }
    }

    public static void main(String[] args) {
        int []arr={2,3,4,5,6,7,4,2,3,56,8};
        sort(arr);
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
