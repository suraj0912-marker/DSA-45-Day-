package com.practise;

import java.util.Arrays;

public class anargramPractise {
    public static void main(String[] args) {
        String str1="suraj";
        String str2="rajsu";
        if (isAnargram(str1,str2)){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }
    public static boolean isAnargram(String s1,String s2){
        if (s1.length()!=s2.length())return false;
        char[] arr1=s1.toCharArray();
        char[]arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}
