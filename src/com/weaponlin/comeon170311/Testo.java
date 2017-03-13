package com.weaponlin.comeon170311;

/**
 * Created by Weapon Lin on 2017/3/11.
 */
public class Testo {

    public static void main(String[] args) {
        int[] array = { 49, 38, 65, 97, 76, 13, 27, 14, 10 };
        //开始写代码，用java实现插入排序
        if ( array == null || array.length <= 1) {	//判断数组不存在或为空
            return;
        }

        int cur = 0;
        for(int i = 1,len = array.length;i < len;i++){
            cur = array[i];
            for(int j = 0;j < i;j++){
                if(cur < array[j]){
                    int p = i;
                    while(p > j){
                        array[p] = array[p-1];
                        p--;
                    }
                    array[j] = cur;
                    break;
                }
            }
        }

        for(int i = 0;i < array.length;i++){
            System.out.print(array[i] + "\t");
        }



        //end_code
    }
}
