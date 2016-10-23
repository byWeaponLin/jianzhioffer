package com.weaponlin.comeon161019;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.nowcoder.com/practice/390da4f7a00f44bea7c2f3d19491311b?tpId=13&tqId=11195&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * Created by Weapon Lin on 2016/10/19.
 */
public class Test1 {

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println(FindNumbersWithSum(array,9));
    }

    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int left = 0,right = array.length-1;
        int min = Integer.MAX_VALUE;

        while(left < right){
            int tempSum = array[left]+array[right];
            if(tempSum < sum){
                left++;
            }else if(tempSum == sum){
                if((array[left]*array[right]) < min){
                    min = array[left]*array[right];
                    list.clear();
                    list.add(array[left]);
                    list.add(array[right]);
                }
                left++;
                right--;
            }else{
                right--;
            }
        }

        return list;
    }
}
