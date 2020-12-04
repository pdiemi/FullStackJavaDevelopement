package collectiondemos;

public class DoublyLinkedList {

	Node head;
	Node tail;
	
	static class Node {
		int data;
		Node previous;
		Node next;
		
		public Node(int data) {
			this.data = data;
			previous = null;
			next = null;
		}
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		//if list is empty
		if (head == null) {
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		}
		else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	
	public void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {

		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.addNode(101);
		doublyLinkedList.addNode(102);
		doublyLinkedList.addNode(103);
		doublyLinkedList.addNode(104);
		doublyLinkedList.addNode(105);
		
		doublyLinkedList.display();
	
	}

}
