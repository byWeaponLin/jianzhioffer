package com.weaponlin.comeon170317;

/**
 * https://www.nowcoder.com/practice/d5e776441a6e41ae9f9859413bdc1eca?tpId=8&tqId=11031&tPage=2&rp=2&ru=/ta/cracking-the-coding-interview&qru=/ta/cracking-the-coding-interview/question-ranking
 * 有一些数的素因子只有3、5、7，请设计一个算法，找出其中的第k个数。
    给定一个数int k，请返回第k个数。保证k小于等于100。
 * Created by Weapon Lin on 2017/3/17.
 */
public class FindPath {


    public static int findKth(int k) {
        if(k <= 0){
            return 0;
        }
        int[] vals = new int[k+1];
        vals[0] = 1;
        int k3 = 0,k5 = 0,k7 = 0;
        int count = 1;
        while(count <= k){
            int v3 = vals[k3]*3;
            int v5 = vals[k5]*5;
            int v7 = vals[k7]*7;
            int min = Math.min(v3,Math.min(v5,v7));
            vals[count] = min;
            if(v3 == min){
                k3++;
            }
            if(v5 == min){
                k5++;
            }
            if(v7 == min){
                k7++;
            }
            count++;
        }

        return vals[k];
    }

    public static void main(String[] args) {
        System.out.println(findKth(1));
    }
}
