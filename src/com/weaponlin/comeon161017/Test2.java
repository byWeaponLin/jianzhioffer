package com.weaponlin.comeon161017;

/**
 * http://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8?tpId=13&tqId=11203&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * Created by Weapon Lin on 2016/10/17.
 */
public class Test2 {
    public static void main(String[] args){
        int[] arr = {2,4,2,1,4};
        int[] dup = new int[arr.length];
        System.out.println(duplicate(arr,arr.length,dup));
        for(int i = 0; i < dup.length;i++){
            System.out.println(dup[i] + " ");
        }
    }

    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length <= 0){
            return false;
        }
        int[] arr = new int[length];
        for(int i = 0;i < length;i++){
            arr[numbers[i]] += 1;
        }
        int count = 0;
        int j = 0;
        for(int i = 0; i < length;i++){
            if(arr[i] > 1){
                count++;
                duplication[j] = i;
                j++;
            }
        }
        if(j > 0){
            return true;
        }

        return false;
    }
}
