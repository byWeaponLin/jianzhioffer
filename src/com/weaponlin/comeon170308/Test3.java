package com.weaponlin.comeon170308;

/**
 * https://www.nowcoder.com/practice/459bd355da1549fa8a49e350bf3df484?tpId=13&tqId=11183&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 最大子序列和
 * Created by Weapon Lin on 2017/3/8.
 */
public class Test3 {

    public static int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0)
            return 0;
        else{
            int total=array[0],maxSum=array[0];
            for(int i=1;i<array.length;i++){
                if(total>=0)
                    total+=array[i];
                else
                    total=array[i];
                if(total>maxSum)
                    maxSum=total;
            }
            return maxSum;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(arr));
    }


}
