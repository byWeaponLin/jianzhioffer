package com.weaponlin.comeon170302;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *https://www.nowcoder.com/practice/7fe2212963db4790b57431d9ed259701?tpId=13&tqId=11175&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * Created by Weapon Lin on 2017/3/2.
 */
public class Test1 {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t5.right = t6;

        Test1 t = new Test1();
        ArrayList<Integer> list = t.PrintFromTopToBottom (t1);
        for(int i = 0,j=list.size();i < j;i++){
            System.out.println(list.get(i));
        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root != null){
            TreeNode tempNode = root;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(tempNode);
            while(!queue.isEmpty()){
                //队列的头节点
                TreeNode tmp = queue.poll();
                list.add(tmp.val);
                if(tmp.left != null){
                    queue.add(tmp.left);
                }
                if(tmp.right != null){
                    queue.add(tmp.right);
                }
            }
        }

        return list;
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
