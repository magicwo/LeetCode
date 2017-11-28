package Arrays;

public class Solution2_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode root = new ListNode(0);
        ListNode r = root;
        int carry = 0;
        int s;
        while (p1 != null && p2 != null) {
            s = p1.val + p2.val + carry;
            carry = s / 10;
            p1.val = s % 10;
            r.next = p1;
            r = p1;
            p1 = p1.next;
            p2 = p2.next;
        }
        if (p1 != null) {
            r.next = p1;
        } else if (p2 != null) {
            r.next = p2;
        }
        if (carry == 1) {
            while (r.next != null) {
                s = r.next.val + carry;
                r.next.val = s % 10;
                carry = s / 10;
                r = r.next;
            }
            if (carry > 0) {
                r.next = new ListNode(1);
            }
        }
        return root.next;


    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

}
