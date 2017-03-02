package com.weaponlin.comeon170301;

import org.junit.*;

/**
 * https://www.nowcoder.com/practice/e02fdb54d7524710a7d664d082bb7811?tpId=13&tqId=11193&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * Created by Weapon Lin on 2017/3/1.
 */
public class Test2 {

    @org.junit.Test
    public void test(){
        Test2 t = new Test2();
//        int[] array = {1,2,3,4,5,6,4,1,2,3};
        int[] array = {2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        t.FindNumsAppearOnce(array,num1,num2);
    }

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length < 2){
            return;
        }

        int length = array.length;
        int result = 0;
        for(int i = 0;i < length;i++){
            result ^= array[i];
        }
        int flag = 0;
        while((result >> flag & 1) == 0){
            flag++;
        }

        //
        num1[0] = 0;
        num2[0] = 0;
        for(int i = 0;i < length;i++){
            if((1 & array[i]>>flag) == 0){
                num1[0] ^= array[i];
            }else{
                num2[0] ^= array[i];
            }
        }
        System.out.println(num1[0] + "\t" + num2[0]);
    }
}


