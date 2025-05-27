package com.practise;

class mystackP{
    int []stack;
    int top;
    mystackP(int size){
        stack =new int[size];
        top=-1;
    }
    public void push(int value){
        if (top==stack.length-1){
            System.out.println("stack is overflow");
            return;
        }
        stack[++top]=value;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("stack is underflow");
            return -1;
        }
        return stack[top--];
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return stack[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void display(){
        if (isEmpty()){
            System.out.println("stack is Empty");
            return;
        }
        for (int i = top; i >=0 ; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        mystackP s=new mystackP(4);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();
        System.out.println("top element:"+s.peek());
        s.pop();
        System.out.println("top element after pop:"+s.peek());
        s.display();

    }

}
