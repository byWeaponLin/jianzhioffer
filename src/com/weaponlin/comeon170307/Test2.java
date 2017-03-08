package com.weaponlin.comeon170307;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Weapon Lin on 2017/3/7.
 */
public class Test2 {

    public void Mirror(TreeNode root) {
        if(root == null){
            return ;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;

        Mirror(left);
        Mirror(right);

    }

    public void Mirror2(TreeNode root){
        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        TreeNode tmp = null;
        while(!stack.isEmpty()){
            tmp = stack.pop();
            TreeNode left = tmp.left;
            TreeNode right = tmp.right;
            tmp.left = right;
            tmp.right = left;
            if(left != null){
                stack.push(left);
            }
            if(right != null){
                stack.push(right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        root.left = n2;root.right = n3;
        n2.left = n4;n2.right = n5;
        n3.left = n6;n3.right = n7;

        Test2 t = new Test2();
        t.printTree(root);
//        t.Mirror(root);
        t.Mirror2(root);
        t.printTree(root);
    }

    public void printTree(TreeNode root){
        if(root == null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            System.out.print(tmp + "\t");
            if(tmp.left != null) {
                queue.add(tmp.left);
            }
            if(tmp.right != null) {
                queue.add(tmp.right);
            }
        }
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return  ""+val +"";
    }
}





























