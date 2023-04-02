package linkedlists;

public class SinglyLinkedList {
	
	Node head;

	int indexMax = -1;
	int countMax = 0;
	
	
	public void clearAll() {
		indexMax = -1;
		countMax=0;
		if (head == null) {

			//return;
		} else {
			this.head = null;
			//return;			
		}
		
	}
	
	int getCountMax() {
		return countMax;
	}
	
	int getIndexMax() {
		return indexMax;
	}	
	
	public void append(int data, int count) {
		Node newNode = new Node(data, count);
		if (head == null) {
			head = newNode;
			countMax = count;
			indexMax = data;
			return;
		}
		
		Node current = head;
		
		while(current.next !=null) {
			current = current.next;
					}
		current.next = newNode;
		 if (countMax <count)
		 {
			 countMax = count;
			 indexMax = data;
		 }

		}
	public void display() {
		Node current = head;
		
		while(current!=null) {
			System.out.println(current.getIndex()+"-"+current.getCount());
			current = current.next;
		}
		System.out.println("null");
		
	}
	
	public void prepend(int data, int count) {
		Node newNode = new Node(data, count);
		newNode.next = head;
		head = newNode;
		 if (countMax <count)
		 {
			 countMax = count;
			 indexMax = data;
		 }
		
	}
	public void insertAt(int data, int count, int position) {
		Node newNode = new Node(data, count);
		if(position <= 0) { // accommodate negative index position
			prepend(data, count);
			 if (countMax <count)
			 {
				 countMax = count;
				 indexMax = data;
			 }
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
			append(data, count); // accommodate out of bounds
		} else {
			newNode.next = current.next;
			current.next = newNode;
			 if (countMax <count)
			 {
				 countMax = count;
				 indexMax = data;
			 }
		}
		
	}
	public void delete(int data) {
		if (head==null) {
			System.out.println("Linked list is empty, nothing to delete");
			return;
		}
		
		if (head.getIndex()==data) {
			head = head.next;

		}
		
		Node current = head;
		Node previous = null;
		
		while(current!=null && current.getIndex()!=data) {
			
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

