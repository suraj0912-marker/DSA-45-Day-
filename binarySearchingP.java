package com.practise;

public class binarySearchingP {
    public static int searching(int []arr,int target){
        int start=0;
        int end=arr.length;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target) return mid;
            if (arr[mid]<target)
                start=mid+1;
            else end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int target =3;
        int result=searching(arr,target);
        System.out.println("index:"+result);
    }
}
