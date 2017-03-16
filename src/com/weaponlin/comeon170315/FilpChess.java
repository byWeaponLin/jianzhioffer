package com.weaponlin.comeon170315;

import com.weaponlin.utils.ArrayUtils;

/**
 * https://www.nowcoder.com/practice/0b5ab6cc51804dd59f9988ad70d8c4a0?tpId=49&tqId=29282&tPage=1&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 *
 * Created by Weapon Lin on 2017/3/15.
 */
public class FilpChess {
    public static int[][] flipChess(int[][] arr, int[][] f) {
        if(arr == null || f == null){
            return null;
        }
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0,j = f.length;i < j;i++){
            int x = f[i][0]-1;
            int y = f[i][1]-1;

            //top
            if(x > 0){
               arr[x-1][y] ^= 1;
            }
            //right
            if(y < col-1){
                arr[x][y+1] ^= 1;
            }
            //bottom
            if(x < row-1){
                arr[x+1][y] ^= 1;
            }
            //left
            if(y > 0){
                arr[x][y-1] ^= 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {{0,0,1,1},{1,0,1,0},{0,1,1,0},{0,0,1,0}};
        int[][] f = {{2,2},{3,3},{4,4}};
        ArrayUtils.printArray(arr);

        arr = flipChess(arr,f);
        System.out.println("===========");
        ArrayUtils.printArray(arr);

    }

}
