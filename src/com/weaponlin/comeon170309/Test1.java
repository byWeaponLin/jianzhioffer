package com.weaponlin.comeon170309;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://www.nowcoder.com/practice/12d959b108cb42b1ab72cef4d36af5ec?tpId=13&tqId=11196&tPage=3&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * Created by Weapon Lin on 2017/3/9.
 */
public class Test1 {

    public static String LeftRotateString(String str,int n) {
        if(str == null || n < 0){
            return null;
        }
        if(str.length() <= 0){
            return "";
        }
        Queue<Character> queue = new LinkedList<>();

        char[] chs = str.toCharArray();
        for(int i = 0,j = chs.length;i < j;i++){
            queue.add(chs[i]);
        }

        for(int i = 0;i < n;i++){
            queue.add(queue.poll());
        }

        chs = new char[queue.size()];
        for(int i = 0,j = chs.length;i < j && !queue.isEmpty();i++){
            chs[i] = queue.poll();
        }

        return new String(chs);
    }

    public static void main(String[] args) {
        System.out.println(LeftRotateString("",9));
    }
}
