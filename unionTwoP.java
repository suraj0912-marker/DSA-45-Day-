package com.practise;

import java.util.Set;

import java.util.HashSet;
import java.util.Scanner;

public class unionTwoP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the size of array :");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("enter the first elements");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();

        }
        System.out.println(" enter the size of array :");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("enter the second  elements");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }
        Set<Integer>set=new HashSet<>();
        for (int num:arr1){
            set.add(num);
        }
        for (int num:arr2){
            set.add(num);
        }
        System.out.println("union of two array");
        for (int num:set){
            System.out.println(num+" ");
        }
    }
}
