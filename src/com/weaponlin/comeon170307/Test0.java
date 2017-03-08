package com.weaponlin.comeon170307;

import java.util.Iterator;
import java.util.Stack;

/**
 * https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49?tpId=13&tqId=11173&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * Created by Weapon Lin on 2017/3/7.
 */
public class Test0 {

    private Stack<Integer> stack ;

    public Test0(){
        stack = new Stack<>();
    }

    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
    }

    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return 0;
    }

    public int min() {
        int temp = 0;
        if(!stack.isEmpty()){
            int min = Integer.MAX_VALUE;
            Iterator<Integer> it = stack.iterator();
            while(it.hasNext()){
                temp = it.next();
                if(min > temp){
                    min = temp;
                }
            }
            temp = min;
        }

        return temp;
    }

    public static void main(String[] args) {
        Test0 t = new Test0();
        t.push(3);

        t.push(4);
        t.push(5);
        System.out.println(t.min());
        System.out.println(t.min());
    }


}


























