package com.weaponlin.utils;

/**
 * Created by Weapon Lin on 2017/3/15.
 */
public class ArrayUtils {

    public static void printArray(int[][] arr){
        if(arr == null){
            System.out.println("null");
        }

        for(int i = 0,j = arr.length;i < j;i++){
            for(int m = 0,n=arr[i].length;m < n;m++){
                System.out.print(arr[i][m] + "\t");
            }
            System.out.println();
        }

    }
}
