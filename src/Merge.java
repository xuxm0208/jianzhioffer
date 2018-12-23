package jianzhioffer.src;

import java.util.*;
import jianzhioffer.src.ListNode;

public class Merge {
    public static void main(String args[]){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        ListNode merged = Merge(list1, list2);
        System.out.printf("%d -> %d -> %d -> %d -> %d -> %d ", merged.val, merged.next.val, merged.next.next.val,
                merged.next.next.next.val, merged.next.next.next.next.val, merged.next.next.next.next.next.val);
    }

    public static ListNode Merge(ListNode A, ListNode B){
        if(A == null){
            return B;
        }else if(B == null){
            return A;
        }

        ListNode cur = null;
        if(A.val < B.val){
            cur = A;
            A = A.next;
        }else{
            cur = B;
            B = B.next;
        }
        ListNode merged = cur;
        while(A != null && B != null){
            if(A.val < B.val){
                cur.next = A;
                A = A.next;
            }else{
                cur.next = B;
                B = B.next;
            }
            cur = cur.next; //注意点
        }

        if(A == null){
            cur.next = B;
        }else{
            cur.next = A;
        }

        return merged;
    }
}
