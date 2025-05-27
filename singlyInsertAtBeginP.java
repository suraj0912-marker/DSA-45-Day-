package com.practise;
class rode {
    int data;
    rode next;
    rode(int data){
        this.data=data;
        this.next=null;
    }
}
public class singlyInsertAtBeginP {
    rode head;

    public void insertBegin(int value){
        rode newNode=new rode(value);
        newNode.next=head;
        head=newNode;

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
        list.insertend(30);
        list.display();

    }
}
