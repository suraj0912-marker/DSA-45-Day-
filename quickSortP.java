package com.practise;

public class quickSortP {
    public static void sorting(int []arr,int low,int high){
        if (low<high){
            int pi=partition(arr,low,high);
            sorting(arr,low,pi-1);
            sorting(arr,pi+1,high);
            
        }
    }
    public static int partition(int []arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for (int j = low; j <high ; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            int temp=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;
            

        return i+1;
    }

    public static void main(String[] args) {
        int []arr={3,4,5,2,1,13,15,21,434,21};
        sorting(arr,0,arr.length-1);
        for (int num:arr){
            System.out.println(num+" ");
        }
    }
}
