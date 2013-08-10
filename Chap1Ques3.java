
public class Chap1Ques3 {

	public static boolean permutation(String s1, String s2) {
		if (s1.length() == s2.length()){
			
			String string = s1 + s2;
			
			char[] charArray = string.toCharArray();

			int[] bucket = new int[256];

			for(int i = 0; i < charArray.length; i++)
				bucket[charArray[i]] += 1;

			for(int i = 0; i < charArray.length; i++){
				
				if(bucket[charArray[i]] % 2 != 0)
					return false;
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
