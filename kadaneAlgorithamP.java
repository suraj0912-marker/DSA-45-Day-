package com.practise;

public class kadaneAlgorithamP {
    public static void findMaxsubArray(int []arr){
        int currentSum=arr[0];
        int maxSum=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            currentSum=Math.max(arr[i],currentSum+arr[i]);
            maxSum=Math.max(maxSum,currentSum);

        }
        System.out.println("your maxsumSubArray is:"+maxSum);
    }

    public static void main(String[] args) {
        int []arr={-2,-3,-4,-5,6,7,8};
        findMaxsubArray(arr);
    }
}
