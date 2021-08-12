package practice3;

public class Qus1 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));
	}
	
	
	
	public static String getMiddle(String word) {
		int len = word.length();
		int middle = len/2;
		String result = "";
		
		if (len%2==0) {
			result = String.valueOf(word.charAt(middle-1)) +
					 String.valueOf(word.charAt(middle));
		}else {
			result = String.valueOf(word.charAt(middle));
		}
		
		return result;
	}



}
