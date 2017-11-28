package Arrays;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x = l1.val + l2.val;
        int i = 0;
        if (x >= 10) {
            x = x % 10;
            i = 1;
        }
        ListNode listNode = new ListNode(x);
        if (l1.next != null || l2.next != null || i != 0)
            listNode.next = addTwoNumbersx(l1.next, l2.next, i);
        return listNode;
    }

    private ListNode addTwoNumbersx(ListNode l1, ListNode l2, int j) {
        int x;
        int i = 0;
        ListNode listNode;
        int k1, k2;
        ListNode next1;
        ListNode next2;
        if (l1 == null) {
            k1 = 0;
            next1 = null;
        } else {
            k1 = l1.val;
            next1 = l1.next;
        }
        if (l2 == null) {
            k2 = 0;
            next2 = null;
        } else {
            k2 = l2.val;
            next2 = l2.next;
        }
        x = k1 + k2 + j;
        if (x >= 10) {
            x = x % 10;
            i = 1;
        }
        listNode = new ListNode(x);
        if (next1 != null || next2 != null || i != 0)
            listNode.next = addTwoNumbersx(next1, next2, i);
        return listNode;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}