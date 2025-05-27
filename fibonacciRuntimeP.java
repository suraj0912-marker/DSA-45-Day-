package com.practise;

import java.util.Scanner;

public class fibonacciRuntimeP {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to the fibonacci series");
        System.out.println("please enter your number");
        int n= input.nextInt();
        fibonacci(n);
        System.out.print("fibonaci series is"+ n);
    }
    public static void fibonacci(int num){
        int a=0;
        int b=1;
        if (num>=1)
            System.out.print(a+" ");
            if (num>=2)
                System.out.print(b+" ");
                for (int i = 3; i <=num ; i++) {
                    int c=a+b;
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                }

        }
    }
