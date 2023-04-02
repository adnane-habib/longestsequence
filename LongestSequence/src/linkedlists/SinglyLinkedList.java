package linkedlists;

public class SinglyLinkedList {
	
	Node head;
	int counts=0;
	
	public void clearAll() {
		if (head == null) {
			counts=0;
			//return;
		} else {
			this.head = null;
			this.counts=0;
			//return;			
		}
		
	}
	
	int getCount() {
		return counts;
	}
	
	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			counts++;
			return;
		}
		Node current = head;
		
		while(current.next !=null) {
			current = current.next;
					}
		current.next = newNode;
		counts++;
		}
	public void display() {
		Node current = head;
		
		while(current!=null) {
			System.out.print(current.getData()+" -> ");
			current = current.next;
		}
		System.out.println("null");
		
	}
	
	public void prepend(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		counts++;
		
	}
	public void insertAt(int data, int position) {
		Node newNode = new Node(data);
		if(position <= 0) { // accommodate negative index position
			prepend(data);
			counts++;
			return;
		}
		Node current = head;
		int currentPosition = 0;
		while(current !=null && currentPosition < position -1) {
			current = current.next;
			currentPosition++;
		}
		if (current == null) {
			System.out.println("position out of bounds");
			append(data); // accommodate out of bounds
		} else {
			newNode.next = current.next;
			current.next = newNode;
			counts++;
		}
		
	}
	public void delete(int data) {
		if (head==null) {
			System.out.println("Linked list is empty, nothing to delete");
			return;
		}
		
		if (head.getData()==data) {
			head = head.next;
			counts--;
		}
		
		Node current = head;
		Node previous = null;
		
		while(current!=null && current.getData()!=data) {
			
				previous = current;
				current = current.next;	

		}
				if 	(current!=null) {
					previous.next = current.next;
				} else {
					System.out.println("Data not found, nothing to delete");
				}		
					
		}
			
		
	
	
}

