package com.practise;
class loopnode{
    int data;
    loopnode next;
    loopnode(int data){
        this.data=data;
        this.next=null;
    }
}
public class loopstartfindp {
    public static loopnode loopdetect(loopnode head){
        loopnode slow=head;
        loopnode fast=head;

        while (fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if (slow==fast){
                break;
            }
        }
        if (fast==null|| fast.next==null){
            return null;
        }
        slow=head;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        loopnode head=new loopnode(1);
        head.next=new loopnode(2);
        head.next.next=new loopnode(3);
        head.next.next.next=new loopnode(4);
        head.next.next.next.next=new loopnode(5);
        head.next.next.next.next.next=head.next.next;

        loopnode loopnode=loopdetect(head);
        if (loopnode!=null){
            System.out.println("loop start at:"+loopnode.data);

        }else {
            System.out.println("no loop found");
        }


    }
}
