package com.practise;
class nnode{
    int data;
    nnode next;
    nnode(int data){
        this.data=data;
        this.next=null;

    }
}
public class reverseLinkedListP {
    nnode head;

    public void insert(int data){
        nnode newnnode=new nnode(data);

        if (head==null){
            head=newnnode;
            return;
        }
        nnode temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnnode;
    }
    public void reverse(){
        nnode prev=null;
        nnode curr=head;
        nnode next;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void display(){
        nnode temp=head;
        while (temp!=null){
            System.out.println(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        reverseLinkedListP list=new reverseLinkedListP();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        System.out.println("before reverse");
        list.display();

        list.reverse();
        System.out.println("after revere");
        list.display();
    }
}
