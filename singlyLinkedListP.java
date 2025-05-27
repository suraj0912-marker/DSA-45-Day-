package com.practise;
class node{
    int data;
    rode next;
    node(int data ){
        this.data=data;
        this.next=null;
    }
}
public class singlyLinkedListP {
    rode head;

    public void insertend(int value){
        rode newnode=new rode(value);
        if (head==null){
            head=newnode;
            return;
        }
        rode temp=head;
        while (temp.next!=null){
            temp=temp.next;

        }
        temp.next=newnode;
    }
    public void display(){
        rode temp=head;
        while (temp!=null){
            System.out.println(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        singlyLinkedListP list=new singlyLinkedListP();
        list.insertend(10);
        list.insertend(20);
        list.display();
    }
}
