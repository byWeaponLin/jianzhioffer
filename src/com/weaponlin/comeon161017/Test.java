package com.weaponlin.comeon161017;

/**
 * http://www.nowcoder.com/practice/96bd6684e04a44eb80e6a68efc0ec6c5?tpId=13&tqId=11188&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * Created by Weapon Lin on 2016/10/17.
 */
public class Test {
    public static void main(String[] args){
        //TODO not complete
        int[] arr = {1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(arr));
    }

    public static int InversePairs(int [] array) {
        int length = array.length;
        int count = 0;
        while(--length >= 0){
            int temp = array[length];
            for(int i = length-1;i >= 0;i--){
                if(temp < array[i]){
                    count++;
                }
            }
        }

        return count%1000000007;
    }

    public static void mergeSort(int[] arr,int first,int last,int[] temp){
        if(first < last){
            int mid = (first+last)/2;
            mergeSort(arr,first,mid,temp);
            mergeSort(arr,mid+1,last,temp);
//            mergeArray(arr,first,mid,last,temp);
        }
    }
}
