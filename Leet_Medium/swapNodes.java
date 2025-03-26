import java.util.ArrayList;

import static java.util.Collections.swap;

// * Definition for singly-linked list.


class swapNodes {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

      // My Approach --> O(N) and O(N)
    public ListNode Function1(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int firstIdx = k - 1;
        int secondIdx = list.size() - k;

        int temp = list.get(firstIdx);
        list.set(firstIdx, list.get(secondIdx));
        list.set(secondIdx, temp);
        ListNode dummy = new ListNode(-1);
        ListNode newHead = dummy;

        for(int val : list){
            newHead.next = new ListNode(val);
            newHead= newHead.next;
        }

    return dummy.next;
    }
    public static ListNode Function2(ListNode head,int k){
        int L = length(head);
        ListNode n1 = head;
        for (int i = 1; i < k ; i++) {
            n1 = n1.next;
        }
        ListNode n2 = head;
        for (int i = 1; i <L -k+1 ; i++) {
            n2 = n2.next;
        }
        swap(n1,n2);
        return head;
    }

    private static void swap(ListNode n1, ListNode n2) {// Manually swapping values in Java
        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;


    }

    private static int length(ListNode head) {
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
  return count;  }

    public static void main(String[] args) {

    }
}