
public class Chap1Ques4 {
	
	public static String replaceSpace(String s){
		
		char[] sArray = s.toCharArray();
		StringBuffer result = new StringBuffer();
		
		for(int i = 0; i < sArray.length; i++){
			
			result.append(sArray[i]);
			
			if(sArray[i] == ' '){
				
//				for(int x = 0; x < i; x++)
//					result.append(sArray[i]);
				result.replace(result.length() - 1, result.length(), "%20");
			}
		}
		
		String newString = result.toString();
		return newString;
	}
	
	public static void main(String[] args){
		String tester1 = "Where?";
		String tester2 = "See Spot run.";
		String tester3 = "You followed a white rabbit, and found a hookah smoking caterpillar.";
		
		System.out.println(replaceSpace(tester1));
		System.out.println(replaceSpace(tester2));
		System.out.println(replaceSpace(tester3));
	}
}
