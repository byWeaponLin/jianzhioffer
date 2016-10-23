package com.weaponlin.comeon161019;

import java.util.List;

/**
 * http://www.nowcoder.com/practice/d281619e4b3e4a60a2cc66ea32855bfa?tpId=49&tqId=29370&rp=5&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 * Created by Weapon Lin on 2016/10/19.
 */
public class Test3 {
    public static void main(String[] args){
        //TODO not complete
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
    }


    public static boolean chkPalindrome(ListNode head) {
        //空或者只有一个节点
        if(head == null || head.next == null || head.next.next == null){
            return true;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        ListNode next = head;
        while(fast != null){
            if(fast.next != null){
                fast = fast.next;
            }
            slow = next;
            ListNode temp = slow;   //反指的节点
            slow = slow.next;       //该节点
            next = slow.next;
            slow.next = temp;
        }



        return false;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
