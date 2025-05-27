package com.practise;

public class arrayRotationPrc {
    public static void rotateleftbyD(int []arr,int D){
        D=D% arr.length;
        reverse(arr,0,D-1);
        reverse(arr,D, arr.length-1);
        reverse(arr,0, arr.length-1);
    }
    public static void reverse(int []arr,int start,int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int D=3;
        rotateleftbyD(arr,D);

        for (int j : arr) {
            System.out.print(j + " ");

        }
    }

}