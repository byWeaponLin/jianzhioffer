package com.weaponlin.comeon161018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * http://www.nowcoder.com/practice/e02fdb54d7524710a7d664d082bb7811?tpId=13&tqId=11193&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * Created by Weapon Lin on 2016/10/18.
 * 参考链接：http://depm.blog.163.com/blog/static/23024401120131130111152666/   nice
 *
 */
public class Test1 {
    public static void main(String[] args){
        //TODO 新做法
        System.out.println(18&1);
        System.out.println(9&1);
//        int[] array = {1,2,3,5,3,1,2,6};
//        int[] a1 = new int[1];
//        int[] a2 = new int[1];
//        FindNumsAppearOnce(array,a1,a2);
//        System.out.println(a1[0] + "\t" + a2[0]);
    }

    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i < array.length;i++){
            if(!list.contains(array[i])){
                list.add(array[i]);
            }else{
                list.remove(new Integer(array[i]));
            }
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }
}
