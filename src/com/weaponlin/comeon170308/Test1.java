package com.weaponlin.comeon170308;

/**
 * https://www.nowcoder.com/practice/8b3b95850edb4115918ecebdf1b4d222?tpId=13&tqId=11192&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * Created by Weapon Lin on 2017/3/8.
 */
public class Test1 {

    private boolean isBalanced;

    public boolean IsBalanced_Solution(TreeNode root) {
        isBalanced = true;
        tt(root);
        return isBalanced;
    }

    public int tt(TreeNode root){
        if(!isBalanced || root == null){
            return 0;
        }

        int left = tt(root.left);
        int right = tt(root.right);

        if(Math.abs(left - right) > 1){
            isBalanced = false;
        }

        return left > right ? left+1 : right+1;
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
