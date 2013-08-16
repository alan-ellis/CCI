import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {

	@Test
	public void testAppendToTail() {
		Node list = new Node(0);
		int input[] = {1,2,3,4,5};
		
		for (int i = 0; i < input.length; i++){
			list.appendToTail(input[i]);
		}
		for (int i = 0; i < input.length; i++){
			assertEquals(input[i],list.getAtIndex(i+1));
		}
	}

}
