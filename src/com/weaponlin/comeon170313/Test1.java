package com.weaponlin.comeon170313;

/**
 * https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593?tpId=13&tqId=11166&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * Created by Weapon Lin on 2017/3/13.
 */
public class Test1 {

    public static void reOrderArray(int [] array) {
        if(array==null || array.length <=1){
            return;
        }
        int len = array.length;
        int[] arr = new int[len];
        int head = 0,tail = len-1;
        for(int i = 0,j=len-1;i < len;i++,j--){
            if(array[i]%2 != 0){
                arr[head] = array[i];
                head++;
            }
            if(array[j]%2 == 0){
                arr[tail] = array[j];
                tail--;
            }
        }
        for(int i = 0;i < len;i++) {
            array[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,6,2,7,3,8};
        reOrderArray(arr);
        for(int i = 0,j = arr.length;i < j;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}



























