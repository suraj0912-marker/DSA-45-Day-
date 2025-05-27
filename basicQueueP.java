package com.practise;

public class basicQueueP {
    int size;
    int []queue;
    int front,rear;

    public basicQueueP(int size){
        this.size=size;
        this.queue=new int[size];
        this.front=-1;
        this.rear=-1;

    }
    public void enqueue(int value){
        if (rear==size-1){
            System.out.println("queue is full");
            return;
        }
        if (front==-1) front=0;
        rear++;
        queue[rear]=value;
    }
    public void dequeue(){
        if (front ==-1||front>rear){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("removed :" + queue[front]);
        front++;
    }
    public void display(){
        if (front ==-1||front>rear){
            System.out.println("queue is empty");
            return;
        }
        for (int i = front; i <=rear ; i++) {
            System.out.println(queue[i]+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        basicQueueP q=new basicQueueP(3);
        q.dequeue();
    }

}
