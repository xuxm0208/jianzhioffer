package jianzhioffer.src;

import java.util.*;
import jianzhioffer.src.ListNode;

public class FindKthToTail {
    public static void main(String[] args){
        ListNode A = new ListNode(1);
        A.next = new ListNode(2);
        A.next.next = new ListNode(3);
        A.next.next.next = new ListNode(4);
        System.out.println(FindKthToTail(A, 2).val);
    }

    public static ListNode FindKthToTail(ListNode head, int k){
        if (head == null || k == 0)
            return null;
        ListNode temp = head;
        for(int i = 0; i < k - 1; i++ ){
            if(temp.next != null){
                temp = temp.next;
            }else{
                return null;
            }
        }

        ListNode pA = head;
        ListNode pB = head;
        for(int i = 0; i < k - 1; i++){
            pA = pA.next;
        }

        while(pA.next != null){
            pA = pA.next;
            pB = pB.next;
        }

        return pB;
    }

}