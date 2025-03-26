
//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/

import java.util.ArrayList;
import java.util.Stack;

class pairSum {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

        // O(N) and O(N)
    public int Function(ListNode head) {
        ListNode curr = head;
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }
        int l = list.size()-1;
        for(int i = 0;i<(list.size()/2);i++){
            int currSum = list.get(i) +list.get(l-i);
            max = Math.max(max,currSum);
        }
        return max;
    }
    // Or bhi bekar hai
    public int Function2(ListNode head){
        ListNode curr = head;
        int n = 0;
        Stack<ListNode> stack = new Stack<>();
        while(curr!=null){
         n++;
         stack.push(curr);
         curr = curr.next;
        }
        int i = 0;
        int res = 0;
        while(i<n/2){
            res = Math.max(res,stack.pop().val+ head.val);
            head = head.next;
            i++;
        }
    return res ;
    }


}