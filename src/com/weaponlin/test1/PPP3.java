package com.weaponlin.test1;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Weapon Lin on 2017/3/16.
 */
public class PPP3 {

    public static List<List<TreeNode>> ll = new ArrayList<>();

    public static void getValPath(TreeNode root, int val){
        if(root == null){
            return;
        }
        List<TreeNode> list = new ArrayList<>();
        test1(root,list,val);
    }

    public static int test1(TreeNode root, List<TreeNode> list,int val){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            list.add(root);
            return root.val;
        }
        list.add(root);
        int left = root.val + test1(root.left,list,val);
        if(left == val){
            ll.add(list);
            list = new ArrayList<>();
            list.add(root);
            return test1(root.left,list,val);
        }
        int right = root.val + test1(root.right,list,val);
        if(right == val){
            ll.add(list);
            list = new ArrayList<>();
            list.add(root);
            return test1(root.right,list,val);
        }
        return 0;
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}