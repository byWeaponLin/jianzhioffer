package com.weaponlin.comeon170307;

/**
 * https://www.nowcoder.com/practice/a861533d45854474ac791d90e447bafd?tpId=13&tqId=11176&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同
 * Created by Weapon Lin on 2017/3/7.
 */
public class Test3 {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0){
            return false;
        }
        if(sequence.length == 1 || sequence.length == 2){
            return true;
        }
        return judge(sequence,0,sequence.length-1);
    }

    public boolean judge(int[] arr,int begin,int end){
        if(begin >= end){
            return true;
        }
        int mid = begin;
        while(arr[mid] < arr[end]){
            mid++;
        }
        for(int j = mid;j < end;j++){
            if(arr[j] < arr[end]){
                return false;
            }
        }

        return judge(arr,begin,mid-1) && judge(arr,mid,end-1);
    }
/*
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)
            return false;
        if(sequence.length==1)
            return true;
        return ju(sequence, 0, sequence.length-1);

    }

    public boolean ju(int[] a,int star,int root){
        if(star>=root)
            return true;
        int i = root;
        //从后面开始找
        while(i>star&&a[i-1]>a[root])
            i--;//找到比根小的坐标
        //从前面开始找 star到i-1应该比根小
        for(int j = star;j<i-1;j++)
            if(a[j]>a[root])
                return false;;
        return ju(a,star,i-1)&&ju(a, i, root-1);
    }
*/
    public static void main(String[] args) {
        Test3 t = new Test3();
        int arr[] = {4,6,5,8,10,9,7};
//        int[] arr = {7,6,4,5};
        System.out.println(t.VerifySquenceOfBST(arr));
    }

}
