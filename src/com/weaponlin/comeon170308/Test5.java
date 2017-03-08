package com.weaponlin.comeon170308;

/**
 *
 * https://www.nowcoder.com/practice/1f7675ae7a9e40e4bd04eb754b62fd00?tpId=49&tqId=29281&tPage=1&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 * 有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。
 给定数组A及它的大小n，请返回最大差值。
 * Created by Weapon Lin on 2017/3/8.
 */
public class Test5 {


    public static int getDis(int[] arr, int n) {
        if(arr == null || n <= 1 || arr.length < n){
            return 0;
        }
        int maxDiff = 0;
        int minNum = arr[0];
        for(int i = 1,j=arr.length;i < j;i++){
            if(arr[i] < minNum){
                minNum = arr[i];
            }
            if((arr[i]-minNum) > maxDiff){
                maxDiff = arr[i] - minNum;
            }
        }


        return maxDiff;
    }

    public static void main(String[] args) {
        int[] arr = {10,5};
        System.out.println(getDis(arr,5));
    }
}
