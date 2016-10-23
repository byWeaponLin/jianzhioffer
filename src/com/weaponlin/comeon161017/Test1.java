package com.weaponlin.comeon161017;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c?tpId=13&tqId=11187&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * Created by Weapon Lin on 2016/10/17.
 * 参考答案：http://blog.csdn.net/beiyeqingteng/article/details/7447920
 */
public class Test1 {

    public static void main(String[] args){
        //TODO not complete
        System.out.println(FirstNotRepeatingChar("google"));
    }

    public static int FirstNotRepeatingChar(String str) {
        if(str == null || str.length() == 0)
            return -1;
        List<Character> list = new ArrayList<Character>();
        char[] chs = str.toCharArray();
        for(int i = 0;i < chs.length;i++){
            if(list.contains(chs[i])){
//                list.remove(chs[i]);
                list.remove((Character) chs[i]);
            }else{
                if(i == str.indexOf(chs[i])){
                    list.add(chs[i]);
                }
            }
        }
        if(list.isEmpty()){
            return -1;
        }
        return str.indexOf(list.get(0));
    }
}