package LinkedList_Assignment;

class Nodess {
	int data;
	Nodess prev;
	Nodess next;

	public Nodess(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
}

public class InsertinSortedDoublyLinkList {

	public static void main(String[] args) {

		Nodess head = new Nodess(10);
		Nodess temp = new Nodess(20);
		Nodess temp1 = new Nodess(30);
		Nodess temp2 = new Nodess(40);

		head.next = temp;
		temp.prev = head;
		temp.next = temp1;
		temp1.prev = temp;
		temp1.next = temp2;
		temp2.prev = temp1;

		printList(head);
		System.out.println("After removing the first node");
		Nodess obj = new Nodess(25);
		head = insertelement(head, obj);
		printList(head);
	}

	private static Nodess insertelement(Nodess head, Nodess obj) {
		
		if (obj.data < head.data) {
			head.prev = obj;
			obj.next = head;
			return obj;
		}
		Nodess curr = head;
		while (curr.next != null && curr.next.data <= obj.data) {
			curr = curr.next;
		}
		System.out.println(curr.data);
		obj.next = curr.next;
		curr.next = obj;				
		obj.prev = curr;
		return head;
	}

	private static void printList(Nodess head) {

		Nodess curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}
