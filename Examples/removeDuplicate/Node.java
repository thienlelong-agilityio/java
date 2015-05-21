// Cracking the Coding Interview: Linked List

class Node<Item> {
	Item item;
	Node next = null;

	Node(Item item) {
		this.item = item;
	}

	public void appendToTail(Item item) {
		Node end = new Node(item);
		Node current = this;

		while(current.next != null) {
			current = current.next;
		}
		current.next = end;
	}

	public Node deleteNode(Node head, Item d) {
		Node n = head;
		if(n.item == d) {
			return head.next;
		}

		while(n.next != null) {
			if(n.item == d) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}

		return head;
	}

	public static void main(String args[]) {
		Node<Integer> node = new Node<Integer>(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(4);
		node.appendToTail(5);

		System.out.println(node.item);
		System.out.println(node.next.item);

		node = node.deleteNode(node, 2);
		System.out.println(node.item);
		System.out.println(node.next.item);
	}
}