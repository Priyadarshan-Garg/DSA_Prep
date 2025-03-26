//https://leetcode.com/problems/partition-list/

class partition {
    public ListNode Function(ListNode head, int x) {
        ListNode S = new ListNode(0); // null asign nahi kar sakte next retreive karne me problem hogi
        ListNode L = new ListNode(0);
        ListNode Sptr = S;
        ListNode Lptr = L;
        while(head!=null){
            if(head.val<x){
               ListNode newNode = new ListNode(head.val);
                Sptr.next = newNode;
                Sptr = newNode;
                
            }
            else{
               ListNode newNode = new ListNode(head.val);
                Lptr.next = newNode;
                Lptr = newNode;
            }
        head = head.next;
        }
        Lptr.next = null;
        Sptr.next = L.next;
        return S.next;
    }
}