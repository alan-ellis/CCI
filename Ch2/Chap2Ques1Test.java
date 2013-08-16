import static org.junit.Assert.*;

import org.junit.Test;


public class Chap2Ques1Test {

	@Test
	public void testRemoveDuplicates() {
		Node list = new Node(0);
		int input[] = {1,2,3,4,5,2,4,4,4,5,1,1};
		int output[] = {1,2,3,4,5};
		
		for (int i = 0; i < input.length; i++){
			list.appendToTail(input[i]);
		}
		
		Chap2Ques1.removeDuplicates(list);
		
		for (int i = 0; i < output.length; i++){
			assertEquals(output[i],list.getAtIndex(i+1));
		}
	}

}
