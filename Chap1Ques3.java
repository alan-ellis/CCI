public class Chap1Ques3 {

	public static boolean permutation(String s1, String s2) {
		if (s1.length() == s2.length()) {

			//String string = s1 + s2;

			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();

			int[] bucket = new int[256];
			
			for(int i = 0; i < 256; i++)
				bucket[i] = 0;

			for (int i = 0; i < charArray1.length; i++)
				bucket[charArray1[i]] ++;

			for (int i = 0; i < charArray2.length; i++) {

				if (bucket[charArray2[i]] == 0)
					return false;
				else
					bucket[charArray2[i]] --;
			}

			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String tester1 = "spine";
		String tester2 = "penis";
		String tester3 = "where";
		String tester4 = "at";

		System.out.println(permutation(tester1, tester2));
		System.out.println(permutation(tester2, tester3));
		System.out.println(permutation(tester3, tester4));
	}
}
