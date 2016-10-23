package com.weaponlin.comeon161011;

/**
 * http://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=13&tqId=11168&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * Created by Weapon Lin on 2016/10/11.
 */
public class Test1 {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        printLinkedList(head);

        ListNode newHead = ReverseList(head);

        printLinkedList(newHead);
    }

    public static ListNode ReverseList(ListNode head) {
        //linked list is null or only one node
        if(head == null || head.next == null)
            return head;

        //at least two nodes
        ListNode curHead = head;
        ListNode cur = head.next;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = curHead;
            curHead = cur;
            cur = temp;
        }
        //set the head.next to null,otherwise it will be a circle
        head.next = null;

        return curHead;
    }

    public static void printLinkedList(ListNode head){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
