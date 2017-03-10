package com.weaponlin.comeon170309;

import java.util.Stack;

/**
 * https://www.nowcoder.com/practice/3194a4f4cf814f63919d0790578d51f3?tpId=13&tqId=11197&tPage=3&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 翻转单词顺序列
 * Created by Weapon Lin on 2017/3/9.
 */
public class Test2 {
    public static String ReverseSentence(String str) {
        if(str == null || str.length() <= 0){
            return str;
        }

        String result = new String();
        char[] chs = str.toCharArray();
        String tmp = "";
        for(int i = str.length()-1;i >= 0;i--){

            if(chs[i] != ' '){
                tmp = chs[i] + tmp;
            }else{
                tmp = tmp + chs[i];
                result += tmp;
                tmp = "";
            }
        }
        result += tmp;

        return result;
    }


    public static void main(String[] args) {
        System.out.println(ReverseSentence("student. a am I"));
    }
}
