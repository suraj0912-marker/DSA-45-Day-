package com.practise;

public class missingNumberP {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8};
        int n=8;
        int total=n*(n+1)/2;
        int sum=0;
        for (int num:arr){
            sum=sum+num;

        }
        int missing=total-sum;
        System.out.println("your missing number is :"+missing);
    }
}
