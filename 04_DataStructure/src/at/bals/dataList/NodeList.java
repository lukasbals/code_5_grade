package at.bals.dataList;

public class NodeList {
	private Node root;

	public NodeList() {

	}

	public void outline() {
		boolean i = true;

		Node actNode;
		actNode = root;

		while (actNode != null) {
			int value = actNode.getValue();
			actNode = actNode.getNext();
			System.out.println(value);

		}
	}

	public void add(int value) {
		Node n = new Node(value);
		if (root == null) {
			root = n;
			return;
		}

		Node actNode;
		actNode = root;
		while (actNode.getNext() != null) {
			actNode = actNode.getNext();

		}
		actNode.setNext(n);
	}
}
