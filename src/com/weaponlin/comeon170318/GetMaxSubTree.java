package com.weaponlin.comeon170318;

import com.weaponlin.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Weapon Lin on 2017/3/18.
 */
public class GetMaxSubTree {

    private TreeNode maxRoot = new TreeNode(0);
    public int find(TreeNode root){
        if(root==null){
            return 0;
        }
        int lSum = find(root.left);
        int rSum = find(root.right);
        int sum = lSum + root.val + rSum;
        if(sum < lSum){
            if(lSum > rSum){
                maxRoot = root.left;
            }else{
                maxRoot = root.right;
            }
        }else if(sum < rSum){
            maxRoot = root.right;
        }else{
            maxRoot = root;
        }

//        if (sum < lSum && lSum > rSum) {
//            maxRoot = root.left;
//        }else if (sum < rSum && rSum > lSum) {
//            maxRoot = root.right;
//        }

        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        TreeNode n1 = new TreeNode(-3);
        TreeNode n2 = new TreeNode(-4);
        TreeNode n3 = new TreeNode(-5);
        TreeNode n4 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        root.left = n1;root.right = n2;
        n1.left = n3;n1.right = n4;
        n2.right = n5;

        GetMaxSubTree t = new GetMaxSubTree();
        System.out.println(t.find(root));
    }

}
