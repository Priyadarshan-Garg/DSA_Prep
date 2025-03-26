import java.util.HashMap;
import java.util.Map;

class removeZeroSumSublists {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode Function(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        
        // **First Pass: Store Prefix Sum & Remove Nodes**
        for (ListNode node = dummy; node != null; node = node.next) {
            sum += node.val;
            map.put(sum, node);
        }

        // **Second Pass: Adjust Pointers**
        sum = 0;
        for (ListNode node = dummy; node != null; node = node.next) {
            sum += node.val;
            node.next = map.get(sum).next;  // Jump over zero-sum sublist
        }

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}