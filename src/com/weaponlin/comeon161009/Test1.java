package com.weaponlin.comeon161009;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Weapon Lin on 2016/10/9.
 * http://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf?tpId=13&tqId=11182&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Test1 {
    public static void main(String[] args){
        System.out.println("ppppp");
        int[] arr = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> list = GetLeastNumbers_Solution(arr,4);
        for(Integer i : list){
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        if(input.length == 0 || k == 0 || input.length < k){
            return a;
        }
        if(input.length > k){
            sort(input,0,input.length-1);
        }

        for(int i = 0;i < k;i++){
            a.add(input[i]);
        }
        return a;
    }

    public static void sort(int[] arr,int l,int r){
        if(l < r){
            int i = l,j = r,flag = arr[l];
            while(i < j){
                while(i < j && flag <= arr[j]){  //从右向左遍历
                    j--;
                }
                if(i < j){
                    //遇到比flag小的值，将较小的值替换到index位置上，同时更新index
                    arr[i++] = arr[j];
                }
                while(i < j && flag > arr[i]){
                    i++;
                }
                if(i < j){
                    arr[j--] = arr[i];
                }
            }
            arr[i] = flag;
            sort(arr,l,i-1);
            sort(arr,i+1,r);
        }
    }
}
