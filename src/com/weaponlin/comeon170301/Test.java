package com.weaponlin.comeon170301;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 *  输入一个字符串，打印出该字符串中字符的所有排列。
    例如输入字符串abc，则输出由字符a、b、c 所能排列出来的所有字符串
    abc、acb、bac、bca、cab 和 cba。

 https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7?tpId=13&tqId=11180&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * Created by Weapon Lin on 2017/3/1.
 */
public class Test {
    @org.junit.Test
    public void test0(){
//        Integer i1 = new Integer(21);
//        Integer i2 = new Integer(21);
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(i1);
//        System.out.println(i1 == list.get(0));

        //
        String str = "abc";
        char[] ch1 = str.toCharArray();
        System.out.println(ch1);
        Arrays.sort(ch1);
        System.out.println(ch1);
    }

    //TODO  not liji
    @org.junit.Test
    public void Permutation() {
        String str = "abc";

        if(str == null || str.length() <= 0){
            return;
        }

        ArrayList<String> result = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        sort(chars,0,set);
        System.out.println(set.size());
        for(String s : set){
            System.out.println(s);
        }
    }

    public static void sort(char[] chars,int index,TreeSet<String> temp){
        if(chars ==null || chars.length == 0 || index < 0 || index > chars.length-1){
            return;
        }

        if(index == chars.length-1){
            temp.add(String.valueOf(chars));
        }else{
            for(int i = index,j = chars.length;i < j;i++){
                swap(chars,index,i);
                sort(chars,index+1,temp);
                swap(chars,index,i);
            }
        }
    }

    public static void swap(char[] chars,int a,int b){
        char t = chars[a];
        chars[a] = chars[b];
        chars[b] = t;
    }
}
