package com.weaponlin.comeon170302;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a?tpId=13&tqId=11172&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * Created by Weapon Lin on 2017/3/2.
 */
public class Test4 {

    public static void main(String[] args) {
        //
        Test4 t = new Test4();
//        int[][] matrix = {{1,2,3,4},
//                          {12,13,14,5},
//                          {11,16,15,6},
//                          {10,9,8,7}};
        int[][] matrix = {{1,2,3,4,5}};
        List<Integer> list = t.printMatrix(matrix);
        for(int i = 0;i < list.size();i++){
            System.out.print(list.get(i) + "\t");
        }
    }


    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix == null || matrix.length <= 0 || matrix[0].length <= 0){
            return list;
        }

        int width = matrix[0].length;
        int height = matrix.length;

        int left = 0,top = 0,right = width-1,bottom = height-1;

        while(left <= right && top <= bottom){
            for(int i = left;i <= right;i++){
                list.add(matrix[top][i]);
            }
            for(int j = top+1;j <= bottom;j++){
                list.add(matrix[j][right]);
            }
            if(top != bottom){
                for(int m = right-1;m >= left;m--){
                    list.add(matrix[bottom][m]);
                }
            }
            if(left != right){
                for(int n = bottom-1;n > top;n--){
                    list.add(matrix[n][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }



        return list;
    }
}
