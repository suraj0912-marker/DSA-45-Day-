package com.practise;

public class stackBasicP {
    int []stack;
    int capacity;
    int top;

    public stackBasicP(int size){
        stack=new int[size];
        capacity=size;
        top=-1;
    }
    public void push(int value){
        if (top==capacity-1){
            System.out.println("stack overflow");
            return ;
        }
        stack[++top]=value;
    }
    public int pop(){
        if (top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        return   stack[top--];
    }

    public static void main(String[] args) {
        stackBasicP s=new stackBasicP(3);
        s.push(4);
        s.push(4);
        s.push(4);
    }
}
