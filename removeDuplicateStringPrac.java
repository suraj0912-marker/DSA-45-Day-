package com.practise;

import java.util.HashSet;

public class removeDuplicateStringPrac {
    public static void main(String[] args) {
        String input="abbbcccdd";
        String result=removeDuplicate(input);
        System.out.println("ouput:"+result);

    }
    public static String removeDuplicate(String str){
        HashSet<Character> set=new HashSet<>();
        StringBuilder result=new StringBuilder();
        for (char c:str.toCharArray()){
            if (!set.contains(c)){
                set.add(c);
                result.append(c);
            }
        }
        return  result.toString();
    }
}
