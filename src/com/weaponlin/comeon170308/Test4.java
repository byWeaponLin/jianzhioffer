package com.weaponlin.comeon170308;

/**
 *
 * https://www.nowcoder.com/practice/dab59997905b4459a42587fece8a75f4?tpId=49&tqId=29279&tPage=1&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 * 对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符。
 给定一个字符串(不一定全为字母)A及它的长度n。请返回第一个重复出现的字符。保证字符串中有重复字符，字符串的长度小于等于500。
 测试样例：
 "qywyer23tdd",11
 返回：
 * Created by Weapon Lin on 2017/3/8.
 */
public class Test4 {

    public static char findFirstRepeat(String A, int n) {
        if(A == null || A.length() <= 1 || n <= 1){
            return 'a';
        }
        boolean[] bs = new boolean[256];
        char[] chs = A.toCharArray();
        for(int i = 0,j = chs.length;i < j;i++){
            if(!bs[chs[i]]){
                bs[chs[i]] = true;
            }else{
                return chs[i];
            }
        }

        return 'a';
    }

    public static void main(String[] args) {
        String str = "qywyer23tdd";
        System.out.println(findFirstRepeat(str,11));
    }

}
