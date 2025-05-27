package com.practise;
class bnode{
    int data;
    bnode left,right;
    bnode(int data){
        this.data=data;
        left=right=null;
    }
}
public class binarytreeBasicsP {
    bnode root;

    public static void main(String[] args) {
        binarytreeBasicsP tree=new binarytreeBasicsP();
        tree.root=new bnode(1);
        tree.root.left=new bnode(2);
        tree.root.right=new bnode(3);
        tree.root.left.left=new bnode(4);
        tree.root.left.right=new bnode(5);
        System.out.println("tree created sucessfully !");
    }
}
