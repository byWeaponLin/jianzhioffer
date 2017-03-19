package com.weaponlin.comeon170318;

import com.weaponlin.entity.TreeNode;

import java.util.ArrayList;

/**https://www.nowcoder.com/practice/b736e784e3e34731af99065031301bca?tpId=13&tqId=11177&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * Created by Weapon Lin on 2017/3/18.
 */
public class FindPath {
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null){
            return listAll;
        }
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null){
            listAll.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);

        list.remove(list.size()-1); //回退

        return listAll;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        root.left = n1;root.right = n2;
        n1.left = n3;n1.right = n4;
        n2.right = n5;



        FindPath f = new FindPath();
        ArrayList<ArrayList<Integer>> listAll = f.FindPath(root,19);

        for(ArrayList<Integer> list : listAll){
            for(Integer i : list){
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
