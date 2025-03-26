//https://leetcode.com/problems/swap-nodes-in-pairs/

class swapPairs {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

            // Iterative approach--> mine
    public ListNode Function1(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next!=null && curr.next.next!=null ){
            ListNode first = curr.next;
            ListNode second = first.next;
            first.next = second.next;
            second.next = first;
            curr.next = second;
            curr = first;
        }
   return dummy.next; }

}