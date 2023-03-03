package LinkedList_Assignment;

class Nodes {
	int data;
	Nodes next;

	public Nodes(int data) {
		this.data = data;
		next = null;
	}
}

public class DeleteEvenNodesFromList {

	public static void main(String[] args) {

		Nodes head = new Nodes(1);
		head.next = new Nodes(4);
		head.next.next = new Nodes(6);
		head.next.next.next = new Nodes(50);
		head.next.next.next.next = head;

		printList(head);
		System.out.println("After removing the even nodes");
		head = delEvenNode(head);
		printList(head);
	}

	private static Nodes delEvenNode(Nodes head) {
		if (head == null) {
			return head;
		}
		Nodes curr = head;
		while (curr.next != head) {
			if (curr.next.data % 2 == 0) {
				curr.next = curr.next.next;
			} else
				curr = curr.next;
		}

		return head;
	}

	private static void printList(Nodes head) {

		Nodes curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		} while (curr != head);
	}

}
