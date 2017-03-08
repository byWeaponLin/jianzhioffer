package com.weaponlin.comeon170306;

import java.util.Stack;

/**
 * https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=13&tqId=11158&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * Created by Weapon Lin on 2017/3/6.
 */
public class Test0 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int size = stack1.size();
        if(size == 0){
            return 0;
        }
        for(int i = 0;i < size;i++){
            stack2.push(stack1.pop());
        }
        int target = stack2.pop();
        for(int i = 0;i < size - 1;i++){
            stack1.push(stack2.pop());
        }

        return target;
    }

    public static void main(String[] args) {
        Test0 t = new Test0();
        t.push(1);
        t.push(2);
        t.push(3);
        t.push(4);

        System.out.println(t.pop());
        System.out.println(t.pop());
        t.push(5);
        System.out.println(t.pop());
    }
}





























