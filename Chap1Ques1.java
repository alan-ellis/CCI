public class Chap1Ques1 {
	public static boolean uniqueString(String string) {

//		int unique = 3;
//		int br = 3;
		char space = ' ';

		for (int i = 0; i < string.length() - 1; i++) {
//			if (br == 0)
//				break;
//			
			if (string.charAt(i) == space)
				continue;
//			
			else {
				for (int x = i + 1; x < string.length(); x++) {

					if (string.charAt(i) == string.charAt(x)) {
						return false;
//						unique = 0;
//						br = 0;
//						break;
					}

//					else
//						unique = 1;
				}
			}
		}
//		if (unique == 0)
//			return false;
//		else
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
