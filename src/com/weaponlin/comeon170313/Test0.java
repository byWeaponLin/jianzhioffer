package com.weaponlin.comeon170313;

import com.weaponlin.comeon170310.ListNode;

/**
 * https://www.nowcoder.com/practice/0e27e0b064de4eacac178676ef9c9d70?tpId=8&tqId=11004&tPage=1&rp=1&ru=/ta/cracking-the-coding-interview&qru=/ta/cracking-the-coding-interview/question-ranking
 * 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
 给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
 * Created by Weapon Lin on 2017/3/13.
 */
public class Test0 {

    public static ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode gt = new ListNode(-1);
        ListNode lt = new ListNode(-1);

        ListNode t1 = gt;
        ListNode t2 = lt;
        ListNode tmp = head;
        while(tmp != null){
            if(tmp.val >= x){
                t1.next = tmp;
                t1 = t1.next;
            }else{
                t2.next = tmp;
                t2 = t2.next;
            }
            tmp = tmp.next;
        }
        t2.next = null;
        t1.next = lt.next;

        return gt.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next = n2;n2.next = n3;n3.next = n4;n4.next = n5;n5.next = n6;

        ListNode tmp = partition(n1,3);
        while(tmp != null){
            System.out.print(tmp.val + "\t");
            tmp = tmp.next;
        }
    }
}
