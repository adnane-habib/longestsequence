package linkedlists;

public class Node {
	private int data;
	public Node next; //Link
	public Node previous; //Link
	
	public Node(int data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}

	public int getData() {
		return data;
	}

}
