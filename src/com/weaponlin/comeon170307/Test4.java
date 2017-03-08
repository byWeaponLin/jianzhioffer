package com.weaponlin.comeon170307;

/**
 *
 * https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163?tpId=13&tqId=11181&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * Created by Weapon Lin on 2017/3/7.
 */
public class Test4 {

    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        int len = array.length;
        int num = array[0];
        int count = 1;
        for(int i = 1;i < len;i++){
            if(array[i] == num){
                count++;
            }else{
                count--;
            }
            if(count < 0){
                num = array[i];
                count = 1;
            }
        }

        count = 0;
        for(int i = 0;i < len;i++){
            if(num == array[i]){
                count++;
            }
        }
        return count*2 > len ? num : 0;
    }

    public static void main(String[] args) {

    }

}
