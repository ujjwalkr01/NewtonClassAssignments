package LinkedList_Assignment;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class mergeTwoSortedLinkedList {

	public static void main(String[] args) {

		Node head1 = new Node(10);
		head1.next = new Node(20);
		head1.next.next = new Node(30);
		head1.next.next.next = new Node(40);

		Node head2 = new Node(20);
		head2.next = new Node(30);
		head2.next.next = new Node(50);
		head2.next.next.next = new Node(50);

		printList(head1, head2);
		Node head = mergeTwoList(head1, head2);
		System.out.println();
		printList(head);

	}

	private static void printList(Node head) {

		Node ptr1 = head;
		while (ptr1 != null) {
			System.out.print(ptr1.data + " ");
			ptr1 = ptr1.next;
		}
	}

	private static Node mergeTwoList(Node head1, Node head2) {
		Node head3 = new Node(-1);
		Node ptr1 = head1, ptr2 = head2, ptr3 = head3;

		while (ptr1 != null && ptr2 != null) {
			if (ptr1.data <= ptr2.data) {
				ptr3.next = ptr1;
				ptr3 = ptr3.next;
				ptr1 = ptr1.next;
				ptr3.next = null;
			} else {
				ptr3.next = ptr2;
				ptr3 = ptr3.next;
				ptr2 = ptr2.next;
				ptr3.next = null;
			}
		}
		while (ptr1 != null) {
			ptr3.next = ptr1;
			ptr3 = ptr3.next;
			ptr1 = ptr1.next;
			ptr3.next = null;
		}
		while (ptr2 != null) {
			ptr3.next = ptr2;
			ptr3 = ptr3.next;
			ptr2 = ptr2.next;
			ptr3.next = null;
		}
		return head3.next;
	}

	private static void printList(Node head1, Node head2) {

		Node ptr1 = head1;
		while (ptr1 != null) {
			System.out.print(ptr1.data + " ");
			ptr1 = ptr1.next;
		}
		System.out.println();
		Node ptr2 = head2;
		while (ptr2 != null) {
			System.out.print(ptr2.data + " ");
			ptr2 = ptr2.next;
		}
	}

}
