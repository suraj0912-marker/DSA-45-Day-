package com.practise;

public class checkPalindromePrac {
    public static void main(String[] args) {
        String str="racecar";
        boolean isPalindrome=true;
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if (str.charAt(left)!=str.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;

        }
        if (isPalindrome){
            System.out.println("palindrome hai");
        }else {
            System.out.println("Palindrome nahi h");
        }
    }
}
