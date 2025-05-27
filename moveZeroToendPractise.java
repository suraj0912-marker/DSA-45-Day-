package com.practise;

public class moveZeroToendPractise {
    public static void moveZeros(int arr[]){
        int nonZeroIndex=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=0){
                int temp=arr[nonZeroIndex];
                arr[nonZeroIndex]=arr[i];
                arr[i]=temp;
                nonZeroIndex++;
            }
        }

    }

    public static void main(String[] args) {
        int []arr={0,9,8,0,6,0};
        moveZeros(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+" ");

        }
    }
}
