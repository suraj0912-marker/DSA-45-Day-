package com.practise;

import java.util.HashSet;
import java.util.Set;

public class findDuplicateNumber {
    public static void main(String[] args) {
        int []arr={1,2,3,4,3};
        Set<Integer>set=new HashSet<>();
        for (int num:arr){
            if (set.contains(num)){
                System.out.println("duplicate number is:"+num);
                return;
            }
            set.add(num);
        }
    }
}
