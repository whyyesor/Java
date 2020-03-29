package hackerRank;

public class MakingAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "cde";
		String b = "abc";
		System.out.println(makeAnagram(a,b));

	}
	
	static int makeAnagram(String a, String b) {
		int result = 0;
		int [] aMinFreq =new int[26];
		int [] bMinFreq = new int[26];
		
		for (int i = 0; i < a.length(); i++) {
			char charAtI = a.charAt(i);
			int position = (int) charAtI - (int)'a';
			aMinFreq[position]++;
		}
		
		for (int i = 0; i < b.length(); i++) {
			char charAtI = b.charAt(i);
			int position = (int) charAtI - (int)'a';
			bMinFreq[position]++;
		}
		
		
		for (int i = 0; i <26; i++) {
			int difference = Math.abs(aMinFreq[i] - bMinFreq[i]);
			result += difference;
			
		}
		
		
		
		return result;

    }

}
