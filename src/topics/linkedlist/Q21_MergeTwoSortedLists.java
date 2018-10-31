package topics.linkedlist;

/**
 * 
 * @author FELIX
 *
 *         Question:Merge two sorted linked lists and return it as a new list.
 *         The new list should be made by splicing together the nodes of the
 *         first two lists.
 * 
 *         Example: Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4
 */
public class Q21_MergeTwoSortedLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode list = new Q21_MergeTwoSortedLists().mergeTwoLists(l1, l2);
		while (list != null) {
			System.out.print(list.val + " ");
			list = list.next;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode list = head;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				list.next = new ListNode(l1.val);
				list = list.next;
				l1 = l1.next;
			} else {
				list.next = new ListNode(l2.val);
				list = list.next;
				l2 = l2.next;
			}
		}
		if (l1 != null && l2 == null) {
			list.next = l1;
		}
		if (l1 == null && l2 != null) {
			list.next = l2;
		}
		return head.next;
	}
}
