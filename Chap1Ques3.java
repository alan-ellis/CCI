import java.util.Arrays;


public class Chap1Ques3 {
	
	public static String sorted(String s){
		
		char[] sArray = s.toCharArray();
		StringBuffer result = new StringBuffer();
		
		Arrays.sort(sArray);
		
		for (int i = 0; i < sArray.length; i++){
			result.append(sArray[i]);
		}
		
		String sortedString = result.toString();
		
		return sortedString;
	}
	
	public static boolean permutation(String s1, String s2){
		
		if (s1.length() != s2.length())
			return false;
		
		else if (sorted(s1).equals(sorted(s2)))
			return true;
		
		else
		return false;
	}
	
	public static void main(String[] args){
		String tester1 = "spine";
		String tester2 = "penis";
		String tester3 = "where";
		String tester4 = "at";
		
		System.out.println(permutation(tester1, tester2));
		System.out.println(permutation(tester2, tester3));
		System.out.println(permutation(tester3, tester4));
		System.out.println(1%2);
		}
}
