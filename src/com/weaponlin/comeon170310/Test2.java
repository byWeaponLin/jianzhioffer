package com.weaponlin.comeon170310;

/**
 * Created by Weapon Lin on 2017/3/10.
 */
public class Test2 {

    public static ListNode EntryNodeOfLoop(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return null;
        }
        //先找到环上的任意一个节点
        ListNode n1 = head;
        ListNode n2 = head.next.next;
        while(n1 != n2){
            if(n2.next == null){
                return null;
            }else if(n2.next.next == null){
                return null;
            }else{
                n2 = n2.next.next;
            }

            n1 = n1.next;
        }

        //将找到的节点的next=null，这就相当于变成两条相交的链表
        ListNode tHead = n1.next;
        n1.next = null;
        //
        n1 = tHead;
        n2 = head;
        while(n1 != n2){
            if(n1.next == null){
                n1 = head;
            }else{
                n1 = n1.next;
            }
            if(n2.next == null){
                n2 = tHead;
            }else{
                n2 = n2.next;
            }
        }

        return n1;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next = n2;n2.next = n3;n3.next = n4;n4.next = n5;n5.next = n6;
        n6.next = n3;

        System.out.println(EntryNodeOfLoop(n1).val);
    }
}





























