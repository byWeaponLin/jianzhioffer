package com.weaponlin.comeon170308;

import java.util.Stack;

/**
 * 写一段代码，判断一个包括'{','[','(',')',']','}'的表达式是否合法(注意看样例的合法规则。)
 给定一个表达式A,请返回一个bool值，代表它是否合法。
 * Created by Weapon Lin on 2017/3/8.
 */
public class Test6 {

    public static boolean chkLegal(String str) {
        if(str == null || str.length() <= 0){
            return false;
        }

        char[] chs = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0,j = chs.length;i < j;i++){
            if(chs[i] == '(' || chs[i] == '[' || chs[i] == '{'){
                stack.push(chs[i]);
            }else if(chs[i] == ')' || chs[i] == ']' || chs[i] == '}'){
                if(!stack.isEmpty() ) {
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(chkLegal("           [a+b*(5-4)]             *{x+b+b*(({1+2)}}             "));
    }
}



























