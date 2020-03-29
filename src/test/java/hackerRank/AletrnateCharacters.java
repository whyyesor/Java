package hackerRank;

public class AletrnateCharacters {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAABBB";
		
		System.out.println(alternatingCharacters(s));

	}
	
	 static int alternatingCharacters(String s) {
		 int result = 0;
		 char prevChar = s.charAt(0);
		 for (int i = 1; i < s.length(); i++) {
			 char currChar = s.charAt(i);
			 if (currChar == prevChar ) {
				 result ++;
			 } else {
				 prevChar = s.charAt(i);
			 }
			 
		 }
		 
		 return result;

	    }


}
