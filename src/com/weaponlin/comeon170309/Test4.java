package com.weaponlin.comeon170309;

import java.util.ArrayList;

/**
 * https://www.nowcoder.com/practice/6aa9e04fc3794f68acf8778237ba065b?tpId=13&tqId=11186&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * Created by Weapon Lin on 2017/3/9.
 */
public class Test4 {

    public static int GetUglyNumber_Solution(int index) {
        if(index <= 0){
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int c2 = 0,c3 = 0,c5 = 0;
        while(list.size() < index){
            int m2 =  list.get(c2)*2;
            int m3 =  list.get(c3)*3;
            int m5 =  list.get(c5)*5;
            int min = Math.min(m2,Math.min(m3,m5));
            list.add(min);
            if(min == m2){
                c2++;
            }
            if(min == m3){
                c3++;
            }
            if(min == m5){
                c5++;
            }
        }

        return list.get(list.size()-1);
    }


    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(7));
    }
}
