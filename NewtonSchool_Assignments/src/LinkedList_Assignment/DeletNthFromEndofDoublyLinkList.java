package LinkedList_Assignment;

class Node3 {
	int data;
	Node3 prev;
	Node3 next;

	public Node3(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
}

public class DeletNthFromEndofDoublyLinkList {

	public static void main(String[] args) {

		Node3 head = new Node3(10);
		Node3 temp = new Node3(20);
		Node3 temp1 = new Node3(40);
		Node3 temp2 = new Node3(30);
		Node3 temp3 = new Node3(50);

		head.next = temp;
		temp.prev = head;
		temp.next = temp1;
		temp1.prev = temp;
		temp1.next = temp2;
		temp2.prev = temp1;
		temp2.next = temp3;
		temp3.prev = temp2;

		printList(head);
		System.out.println("After removing the Kth node from end");
		int k = 5;
		head = removeEleFromEnd(head, k);
		printList(head);
	}

	private static Node3 removeEleFromEnd(Node3 head, int k) {
		if (head == null) {
			return head;
		}
		Node3 curr = head;
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		if (k == count) {
			head = head.next;			
			head.prev = null;
			return head;
		}
		if(k>count) {
			return curr.next;
		}
		System.out.println(count);
		curr = head;
		for (int i = 1; i < count - k; i++) {
			curr = curr.next;
		}
		// System.out.println(curr.data);
		curr.next = curr.next.next;
		if (curr.next == null) {
			return head;
		}
		curr.next.prev = curr;

		return head;
	}

	private static void printList(Node3 head) {

		Node3 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}
