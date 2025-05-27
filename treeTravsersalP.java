package com.practise;
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}
public class treeTravsersalP {
    public static void Inorder(TreeNode root){
        if (root==null)return;
        Inorder(root.left);
        System.out.print(root.data+"  ");
        Inorder(root.right);
    }
    public static void Preorder(TreeNode root){
        if (root==null)return;
        System.out.print(root.data+"  ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void Postorder(TreeNode root){
        if (root==null)return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+"  ");


    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        System.out.print("Inorder = ");
        Inorder(root);
        System.out.println();

        System.out.print("Preorder = ");
        Preorder(root);
        System.out.println();

        System.out.print("Postorder = ");
        Postorder(root);
        System.out.println();
    }
}
