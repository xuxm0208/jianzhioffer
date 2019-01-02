package jianzhioffer.src;

import java.util.*;
import jianzhioffer.src.ListNode;

public class deleteDuplication {
    public static void main(String[] args){
        ListNode A = new ListNode(1);
        A.next = new ListNode(2);
        A.next.next = new ListNode(2);
        A.next.next.next = new ListNode(3);
        A.next.next.next.next = new ListNode(4);
        ListNode res = deleteDuplication(A);
        System.out.println(res.next.next.val);
    }

    public static ListNode deleteDuplication(ListNode pHead){
        /* 边界条件*/
        if(pHead == null || pHead.next == null)
            return pHead;

        ListNode head = new ListNode(-1);
        head.next = pHead;
        ListNode first = head;
        ListNode second = head.next;

        while(second != null){
            if(second.next != null && second.val == second.next.val){
                while(second.next != null && second.val == second.next.val) {
                    second = second.next;
                }
                first.next = second.next;
            }else{
                first = first.next;
            }
            second = second.next;
        }
        return head.next;
    }
}
