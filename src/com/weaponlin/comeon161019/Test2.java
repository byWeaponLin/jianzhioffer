package com.weaponlin.comeon161019;

/**
 * http://www.nowcoder.com/practice/1f7675ae7a9e40e4bd04eb754b62fd00?tpId=49&tqId=29281&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 * Created by Weapon Lin on 2016/10/19.
 * 有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。 给定数组A及它的大小n，请返回最大差值。
 */
public class Test2 {
    public static void main(String[] args){
        //TODO not complete
    }

    public static int getDis(int[] arr, int n) {
        if(arr == null || arr.length <=1 || n > arr.length || n <= 1){
            return 0;
        }

        int left = 0,right = n-1;
        int max = 0;
        while(left < right){
            int temp = arr[right] - arr[left];
            if(temp > 0){
                if(temp > max){
                    right--;
                    max = temp;
                }
            }else{
                left++;
//                right--;
            }
        }

        return max;
    }
}
