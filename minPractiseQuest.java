package com.practise;



public class minPractiseQuest {
    public static void main(String[] args) {
        int []arr={5,7,2,9,3};
        int min=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(" your minimum number is :"+min);

    }
}
