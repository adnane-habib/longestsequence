package linkedlists;

public class Node {
	private int index;
	private int count;
	public Node next; //Link
	public Node previous; //Link
	
	public Node(int index, int count) {
		this.index = index;
		this.count = count;
		this.next = null;
		this.previous = null;
	}

	public int getIndex() {
		return index;
	}
	
	public int getCount() {
		return count;
	}

}
