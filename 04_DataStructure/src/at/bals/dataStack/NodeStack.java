package at.bals.dataStack;

import at.bals.dataStack.Node;

public class NodeStack {
	private Node root;
	
	public NodeStack() {

	}

	public void outline() {
		
		Node actNode = root;

		while (actNode != null) {
			int value = actNode.getValue();
			actNode = actNode.getLast();
			System.out.println("Das ist noch übrig: " + value);

		}
	}
	
	public Node pop(){
		Node n = root;
		root = n.getLast();
		return n;
	}

	public void push(int value) {
		Node n = new Node(value);
		if (root == null) {
			root = n;
			return;
		} else {
			n.setLast(root);
			root = n;
		}
	}
}
