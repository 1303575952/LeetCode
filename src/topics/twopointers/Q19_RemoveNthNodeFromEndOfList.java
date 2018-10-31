package topics.twopointers;

/**
 * 
 * @author FELIX
 *
 *         Question: Given a linked list, remove the n-th node from the end of
 *         list and return its head.
 * 
 *         Example: Given linked list: 1->2->3->4->5, and n = 2. After removing
 *         the second node from the end, the linked list becomes 1->2->3->5.
 * 
 *         Note: Given n will always be valid.
 * 
 *         Follow up: Could you do this in one pass?
 */
class ListNode {
	int val;
	ListNode next = null;

	public ListNode(int val) {
		this.val = val;
	}
}

public class Q19_RemoveNthNodeFromEndOfList {
	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		list.next.next.next = new ListNode(4);
		list.next.next.next.next = new ListNode(5);
		ListNode head = new Q19_RemoveNthNodeFromEndOfList().removeNthFromEnd(list, 2);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode quick = head;
		ListNode slow = head;
		for (int i = 0; i < n; i++) {
			quick = quick.next;
		}
		while (quick.next != null) {
			quick = quick.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}
}
