import java.util.Hashtable;

public class Chap2Ques1 {
	public static void removeDuplicates(Node n){
		Hashtable table = new Hashtable();
		Node previous = null;
		while (n != null) {
			if (table.containsKey(n.data)) {
				previous.next = n.next;
			}
			else {
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}
	}
}
