package com.weaponlin.test1;

/**
 * Created by Weapon Lin on 2017/3/16.
 */
public class PPP2 {

    public static int[] getMax(int[][] matrix){
        if(matrix == null || matrix.length < 2 || matrix[0].length < 2){
            return null;
        }
        int row = matrix.length;
        int col = matrix[0].length;

        int maxX = -1;
        int maxY = -1;
        int maxVal = 0;
        for(int x = 0;x < matrix.length-1;x++){
            for(int y = 0;y < matrix[x].length-1;y++){
                int val = matrix[x][y] + matrix[x+1][y] + matrix[x][y+1] + matrix[x+1][y+1];
                if(val > maxVal){
                    maxVal = val;
                    maxX = x;
                    maxY = y;
                }
            }
        }
        if(maxX == -1){
            return null;
        }
        int[] arr = {maxX,maxY};

        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,0,3,4},{2,3,4,5,1},{1,1,5,3,0}};
        int[] p = getMax(arr);

        int x = p[0],y = p[1];
        System.out.println(arr[x][y] + "\t" + arr[x][y+1]);
        System.out.println(arr[x+1][y] + "\t" + arr[x+1][y+1]);
    }
}
