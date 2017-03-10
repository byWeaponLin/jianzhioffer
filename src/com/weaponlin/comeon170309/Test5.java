package com.weaponlin.comeon170309;

/**
 * https://www.nowcoder.com/practice/7a0da8fc483247ff8800059e12d7caf1?tpId=13&tqId=11200&tPage=3&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 * Created by Weapon Lin on 2017/3/9.
 */
public class Test5 {

    public static int Sum_Solution(int n) {
        int res = n;
        boolean f = (n > 0) && ((res += Sum_Solution(n-1)) > 0);

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Sum_Solution(10));
    }
}
