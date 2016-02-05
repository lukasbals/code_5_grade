package at.bals.dataStack;

public class Node {
	private int value;
	private Node last;
	
	public Node(int value){
		this.value = value;
	
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	
}
