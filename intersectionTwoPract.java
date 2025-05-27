package com.practise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class intersectionTwoPract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the size of array");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("enter the first elemnets");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();

        }
        System.out.println("please enter the size of array");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("enter the second elemnets");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }
        Set<Integer>set=new HashSet<>();
        for (int num:arr1){
            set.add(num);
        }
        System.out.println("intersection of two array");
        for (int num:arr2){
            if (set.contains(num)){
                System.out.println(num+" ");
                set.remove(num);
            }
        }
    }
}