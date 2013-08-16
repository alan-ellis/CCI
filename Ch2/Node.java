
public class Node {
	Node next = null;
	int data;
	int length = 1;
	
	public Node(int d) {
		data = d;
	}
	
	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
		length ++;
	}
	
	Node deleteNode(Node head, int d) {
		Node n = head;
		
		if (n.data == d) {
			return head.next;
		}
		
		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				length --;
				return head;
			}
			n = n.next;
		}
		return head;
	}
	
	// only for test purpose
	public Object getAtIndex(int i) {
		Node n = this;
		
		if (i >= this.length)
			return null;

		while(n !=null && i != 0){
			n = n.next;
			i--;
		}
		return n.data;
	}
}

