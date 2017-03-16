package com.weaponlin.comeon170315;

/**
 * https://www.nowcoder.com/practice/12cbdcdf5d1e4059b6ddd420de6342b6?tpId=49&tqId=29283&tPage=1&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 * Created by Weapon Lin on 2017/3/15.
 */
public class CountPath {

    public static int countPath(int[][] map, int n, int m) {
        int startX = 0;             //起点(经理)坐标
        int startY = 0;
        int endX = 0;               //终点(商家)坐标
        int endY = 0;      
        int[][] plan = new int[n][m];           //走到当前点的方案数
         
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j] == 1){             //标记起点
                    startX = i;
                    startY = j;
                }
                if(map[i][j] == 2){             //标记终点
                    endX = i;
                    endY = j;
                }
            }
        }
         
        int dirX = startX > endX ? -1 : 1;       //确定沿X、Y的移动方向!
        int dirY = startY > endY ? -1 : 1;
         
        for(int x = startX; x != endX + dirX; x += dirX){
            //从起点沿着指定方向一直寻找终点,注:x、y各往后走一步,保证走到终点(否则还差终点一步的时候会跳出循环)!
            for(int y = startY; y != endY + dirY; y += dirY){
                if(x == startX && y == startY){
                        //初始化起点有一种方案
                        plan[x][y] = 1;
                    }else if(x == startX){
                    //X外边界初始化(X固定,方案等于上次Y方案)
                    plan[x][y] = (map[x][y] == -1) ? 0 : plan[x][y-dirY];      
                }else if(y == startY){
                    //Y外边界初始化
                    plan[x][y] = (map[x][y] == -1) ? 0 : plan[x-dirX][y];
                }else{
                    //当前可达时,方案数=上一点(注意是-)沿x方向走到当前点的方案数+上一点沿y方向走到当前点的方案数
                    plan[x][y] = (map[x][y] == -1) ? 0 : plan[x-dirX][y] + plan[x][y-dirY];
                    //等于-1:当前点不可达,方案数为0;否则可达,方案数为之前两个方向方案和
                }
            }
        }
        return plan[endX][endY];
    }

    public static void main(String[] args) {

    }
}

