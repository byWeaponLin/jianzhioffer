package com.weaponlin.comeon170307;

/**
 * Created by Weapon Lin on 2017/3/8.
 */
public class Test5 {

    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length <= 0){
            return 0;
        }
        int len = array.length;
        int begin = 0;
        while(begin < len && array[begin] != k){
            begin++;
        }
        if(begin == len){
            return 0;
        }
        int end = len-1;
        while(end >= 0 && array[end] != k){
            end--;
        }
        if(end == -1){
            return 0;
        }

        return end-begin+1;
    }

}
