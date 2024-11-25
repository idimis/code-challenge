class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    
    public static ListNode deserialize(String data) {
        if (data == null || data.isEmpty()) return null;
        String[] values = data.replace("[", "").replace("]", "").split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value.trim()));
            current = current.next;
        }
        return dummy.next;
    }

   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode current = this;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode current = head.next; 
        ListNode result = new ListNode(0);
        ListNode tail = result; 
        int sum = 0;

        while (current != null) {
            if (current.val == 0) {
               
                tail.next = new ListNode(sum);
                tail = tail.next;
                sum = 0; 
            } else {
                sum += current.val; 
            }
            current = current.next;
        }

        return result.next; 
    }
}

public class Main {
    public static void main(String[] args) {
       
        String input = "[0,3,1,0,4,5,2,0]";
        ListNode head = ListNode.deserialize(input);

        Solution solution = new Solution();
        ListNode result = solution.mergeNodes(head);

       
        System.out.println(result.toString()); 
    }
}
