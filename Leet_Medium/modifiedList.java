import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class modifiedList {
    public ListNode myFunction (int[] nums, ListNode head) {
        List<int[]> list = Collections.singletonList(nums);
        ListNode curr = new ListNode(0);
        ListNode ptr = curr;
        // curr.next = head;
        while(head!=null){
            if(!list.contains(head.val)){
                curr.next = head;
                curr = curr.next;
            }
             head = head.next;
        }
   return ptr.next; }
    public ListNode Function(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (head != null) {
            if (!set.contains(head.val)) {
                curr.next = head;
                curr = curr.next;
            }
            head = head.next;
        }
        curr.next = null;  // Last node ka next null set karna zaroori hai

        return dummy.next;
    }

    public static void main(String[] args) {
//        ListNode L1 = new ListNode(1);
//        for (int i = 2; i < 5; i++) {
//           ListNode newNode = new ListNode(i);
//        }
//        int [] arr = {1,2,3};
////        System.out.println(arr,L1);
//        fork()
    }
}