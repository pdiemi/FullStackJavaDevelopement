package collectiondemos;


public class CircularLinkedList {
	Node head;
	Node tail;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		//if list is empty
		if (head == null) {
			head = tail = newNode;
			tail.next = null;
		}
		else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	public void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node current = head;
		do {
			System.out.println(current.data);
			current = current.next;
		} while (current != head);
	}
	
	public static void main(String[] args) {

		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.addNode(101);
		circularLinkedList.addNode(102);
		circularLinkedList.addNode(103);
		circularLinkedList.addNode(104);
		circularLinkedList.addNode(105);
		
		circularLinkedList.display();
	
	}

}
