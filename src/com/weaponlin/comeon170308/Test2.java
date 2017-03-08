package com.weaponlin.comeon170308;

/**
 * https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef?tpId=13&tqId=11209&tPage=3&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * Created by Weapon Lin on 2017/3/8.
 */
public class Test2 {

    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode head = new ListNode(0);
        ListNode temp = head;
        ListNode first = pHead;
        ListNode end = first.next;
        while(first != null){
            if(end != null){
                if(first.val == end.val){
                    end = end.next;
                    continue;
                }else{
                    if(first.next == end){
                        temp.next = first;
                        temp = temp.next;
                    }

                    first = end;
                    end = end.next;
                }
            }else{
                temp.next = null;
                break;
            }
        }

        if(first.next == null){
            temp.next = first;
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(4);
        ListNode n7 = new ListNode(5);
        n1.next = n2;n2.next = n3;n3.next = n4;n4.next = n5;n5.next = n6;n6.next = n7;
        Test2 t = new Test2();
        t.print(n1);
        System.out.println();
        ListNode node = t.deleteDuplication(n1);
        t.print(node);

    }

    public void print(ListNode h){
//        if(h == null){
//            return;
//        }
        while(h != null){
            System.out.print(h.val + "\t");
            h = h.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;

    }
}