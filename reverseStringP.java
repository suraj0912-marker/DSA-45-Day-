package com.practise;

public class reverseStringP {
    public static void main(String[] args) {
        String str="my name is suraj";
        char[]arr=str.toCharArray();
        int left=0;
        int right= arr.length-1;
        while (left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }
}
