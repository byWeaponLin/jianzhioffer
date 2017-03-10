package com.weaponlin.comeon170310;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://www.nowcoder.com/practice/445c44d982d04483b04a54f298796288?tpId=13&tqId=11213&tPage=3&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * Created by Weapon Lin on 2017/3/9.
 */
public class Test1 {
    public static ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> listList = new ArrayList<>();
        if(root == null){
            return listList;
        }

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            TreeNode father;
            while(!q1.isEmpty()){
                father = q1.poll();
                list.add(father.val);
                if(father.left != null){
                    q2.add(father.left);
                }
                if(father.right != null){
                    q2.add(father.right);
                }
            }
            listList.add(list);
            while(!q2.isEmpty()){
                q1.add(q2.poll());
            }
        }

        return listList;
    }

    //第二种解法
    public static ArrayList<ArrayList<Integer>> test2(TreeNode root){
        ArrayList<ArrayList<Integer>> listList = new ArrayList<>();
        if(root == null){
            return listList;
        }
        ArrayList<Integer> list = null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            list = new ArrayList<>();
            int size = queue.size();
            TreeNode father = null;
            while(size > 0){
                father = queue.poll();
                list.add(father.val);
                size--;
                if(father.left != null){
                    queue.add(father.left);
                }
                if(father.right != null){
                    queue.add(father.right);
                }
            }
            listList.add(list);
        }

        return listList;
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

        ArrayList<ArrayList<Integer>> listList = test2(root);
        System.out.println();
    }


}





















