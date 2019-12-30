package com.BinaryTree;

public class BinaryTreeFunda {
    public static void main(String arg[]){
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(8);
        TreeNode g = new TreeNode(6);
        TreeNode h = new TreeNode(7);

        a.left=b;
        a.right=c;
        b.left = d;
        b.right = e;
        c.right = f;
        f.left =g;
        f.right =h;

        printTree(a);

    }

    public static void printTree(TreeNode root){
        if(root == null){
            return ;
        }
        else {
            System.out.print(root.data);
            if(root.left != null){
                System.out.print("L->[");
                printTree(root.left);
                System.out.print("]");
            }
            if(root.right != null){
                System.out.print("R->[");
                printTree(root.right);
                System.out.print("]");
            }
        }

    }
}
