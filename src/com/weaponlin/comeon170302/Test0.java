package com.weaponlin.comeon170302;

import java.util.Stack;

/**
 * https://www.nowcoder.com/practice/d77d11405cc7470d82554cb392585106?tpId=13&tqId=11174&tPage=2&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * Created by Weapon Lin on 2017/3/2.
 */
public class Test0 {

    public static void main(String[] args) {
        Test0 t = new Test0();
        int[] push = {1,2,3,4,5};
        int[] pop = {4,3,5,1,2};
        System.out.println(t.IsPopOrder(push,pop));
    }

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA == null || popA == null || pushA.length <= 0 || pushA.length != popA.length){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int length = pushA.length;
        int pushIndex = 0;
        int popIndex = 0;
        while(pushIndex < length && popIndex < length){
            if(pushA[pushIndex] != popA[popIndex]){
                //不相等入栈
                stack.push(pushA[pushIndex]);
                pushIndex++;
            }else{
                //相等则不入栈，然后popIndex++，pushIndex++
                while(true && popIndex < length){
                    if(!stack.isEmpty() && stack.lastElement()==popA[++popIndex]){
                        stack.pop();
                    }else{
                        break;
                    }
                }
                pushIndex++;
            }
        }
        if(stack.isEmpty()){
            return true;
        }

        return false;
    }
}
