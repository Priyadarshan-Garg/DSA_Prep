//https://leetcode.com/problems/add-two-numbers-ii/

//import pairSum;
class addTwoNumbers {
            // My approach --> O(N + N + N + N) = O(N)
    public  ListNode Function1(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode rev1 = reverse(l1);
        ListNode rev2 = reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(rev1!=null || rev2!=null || carry>0){
            int val1 = (rev1!=null)? rev1.val : 0;
            int val2 = (rev2!=null)? rev2.val :0;
            sum = val1 +val2 + carry;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(rev1!=null) {
                rev1 = rev1.next;
            }
            if(rev2!=null){
                rev2 = rev2.next;
            }

        }
        return reverse(dummy.next) ;
    }
            // Yeh or bhi better last me reverse nahi karna nahi pad rha
    public  ListNode Function2(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode rev1 = reverse(l1);
        ListNode rev2 = reverse(l2);
        ListNode ans = new ListNode(-1);
        while(rev1!=null || rev2!=null || carry>0){
            int val1 = (rev1!=null)? rev1.val : 0;
            int val2 = (rev2!=null)? rev2.val :0;
            sum = val1 +val2 + carry;
            carry = sum/10;
            ans.val = sum%10;
           ListNode newNode = new ListNode(carry);
            newNode.next = ans;
            ans = newNode;
            sum = carry;
            if(rev1!=null) {
                rev1 = rev1.next;
            }
            if(rev2!=null){
                rev2 = rev2.next;
            }

        }
        return ans.next ;
    }

    ListNode reverse(ListNode L){
        ListNode dummy =null;
        ListNode curr = L;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = dummy;
            dummy = curr;
            curr = temp;
        }
   return dummy; }
}