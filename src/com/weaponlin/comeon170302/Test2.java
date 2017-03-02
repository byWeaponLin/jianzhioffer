package com.weaponlin.comeon170302;

/**
 *https://www.nowcoder.com/practice/6ab1d9a29e88450685099d45c9e31e46?tpId=13&tqId=11189&tPage=2&rp=2&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 * 输入两个链表，找出它们的第一个公共结点。
 * Created by Weapon Lin on 2017/3/2.
 */
public class Test2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
//        ListNode l7 = new ListNode(1);
//        ListNode l8 = new ListNode(1);
//        ListNode l9 = new ListNode(1);
        l1.next = l2;
        l2.next = l4;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        Test2 t = new Test2();
        System.out.println(t.FindFirstCommonNode(l1,l3));

    }


    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }

        ListNode t1 = pHead1,t2 = pHead2;
        int len1 = 0,len2 = 0;
        while(t1 != null){
            t1 = t1.next;
            len1++;
        }
        while(t2 != null){
            t2 = t2.next;
            len2++;
        }
        if(t1 != t2){
            return null;
        }

        t1 = len1 > len2 ? pHead2 : pHead1;

        int len = Math.abs(len1-len2);
        while(len > 0){
            t1 = t1.next;
            len--;
        }

        return t1;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
