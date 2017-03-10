package com.weaponlin.comeon170310;

/**
 * https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=13&tqId=11169&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * Created by Weapon Lin on 2017/3/10.
 */
public class Test3 {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }

        ListNode n1 = list1,n2 = list2;
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while(n1 != null && n2 != null){
            if(n1.val <= n2.val){
                p.next = n1;
                n1 = n1.next;
            }else {
                p.next = n2;
                n2 = n2.next;
            }
            p = p.next;
        }
        if(n1 == null){
            p.next = n2;
        }else if(n2 == null){
            p.next = n1;
        }

        return head.next;
    }

    public static void main(String[] args) {

    }
}















