public class Chap1Ques1 {
  public static boolean uniqueString(String string) {

		char[] charArray = string.toCharArray();
		
		int[] bucket = new int[256];
		
		for(int i = 0; i < charArray.length; i++){
			bucket[charArray[i]] += 1;
			
			if (bucket[charArray[i]] > 1)
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		String[] tester = new String[4];
		tester[0] = "Where?";
		tester[1] = "abcdefghijk lmno pqrs tuv wxyz";
		tester[2] = "abcde";
		tester[3] = "aA";

		for (int i = 0; i < 4; i++) {

			if (uniqueString(tester[i]))
				System.out.println("This string has all unique characters.");
			else
				System.out.println("This string does not have all unique characters.");
		}

	}
}
