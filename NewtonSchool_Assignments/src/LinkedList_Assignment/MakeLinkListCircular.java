package LinkedList_Assignment;

class Node1 {
	int data;
	Node1 next;

	public Node1(int data) {
		this.data = data;
		next = null;
	}
}

public class MakeLinkListCircular {

	public static void main(String[] args) {

		Node1 head = new Node1(10);
		head.next = new Node1(20);
		head.next.next = new Node1(30);
		head.next.next.next = new Node1(40);
		printList(head);
		head=makeitCircular(head);

	}
	private static Node1 makeitCircular(Node1 head) {
       Node1 curr=head;
       while(curr.next!=null) {
    	   curr=curr.next;
       }
       curr.next=head;
       System.out.println(curr.next.data);
		return null;
	}
	private static void printList(Node1 head) {

		Node1 ptr1 = head;
		while (ptr1 != null) {
			System.out.print(ptr1.data + " ");
			ptr1 = ptr1.next;
		}
	}

}
