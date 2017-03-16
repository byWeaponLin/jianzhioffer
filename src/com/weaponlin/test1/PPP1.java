package com.weaponlin.test1;

/**
 * Created by Weapon Lin on 2017/3/16.
 */
public class PPP1 {
    public static ListNode getKthNodeFromTail(ListNode head,int k){
        if(head == null || k < 0){
            return null;
        }
        ListNode h1 = head;
        ListNode h2 = head;
        while(k >= 0){
            if(h1 == null){
                return null;
            }
            h1 = h1.next;
            k--;
        }
        while(h1 != null){
            h1 = h1.next;
            h2 = h2.next;
        }

        return h2;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2; n2.next = n3;n3.next = n4; n4.next = n5;

        ListNode n = getKthNodeFromTail(n1,4);
        System.out.println(n.val);

    }
}
class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
}
