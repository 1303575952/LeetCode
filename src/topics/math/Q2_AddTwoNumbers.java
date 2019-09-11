package topics.math;

/**
 * @author FELIX
 * <p>
 * Question:You are given two non-empty linked lists representing two
 * non-negative integers. The digits are stored in reverse order and
 * each of their nodes contain a single digit. Add the two numbers and
 * return it as a linked list. You may assume the two numbers do not
 * contain any leading zero, except the number 0 itself.
 * <p>
 * Example: Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * <p>
 * 给出的例子太误导人了，243+564=807，342+465=807，要不是Explanation都不知道从高位还是低位加
 */
class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Q2_AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(0);
        l1.next.next = new ListNode(8);
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(9);
        ListNode l = new Q2_AddTwoNumbers().addTwoNumbers(l1, l2);
        while (l != null) {
            System.out.println(l.val + " ");
            l = l.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;
        while (p != null || q != null) {
            int x = p == null ? 0 : p.val;
            int y = q == null ? 0 : q.val;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
            int sum = x + y + carry;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            carry = sum / 10;
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
