package com.practise;
class loop{
    int data;
    loop next;
    loop(int data){
        this.data=data;
        this.next=null;
    }

}

public class loopdetectP {
    public static boolean hasloop(loop head){
        loop slow=head;
        loop fast=head;

        while (fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;

            if (slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        loop head=new loop(1);
        head.next=new loop(20);
        head.next.next=new loop(4);
        if (hasloop(head)){
            System.out.println("loop found");
        }else {
            System.out.println("no loop found");
        }
    }
}
