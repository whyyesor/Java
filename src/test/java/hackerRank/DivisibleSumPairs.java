package hackerRank;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int k = 3;
		int [] ar = {1,3,2,6,1,2};
		System.out.println(divisibleSumPairs(n,k,ar));

	}
	static int divisibleSumPairs(int n, int k, int[] ar) {
		int result = 0;
		
		for (int i = 0; i < ar.length -1; i++) {
			for (int j = i+1; j < ar.length; j++) {
				
				if (((ar[i]+ar[j])%k) == 0) {
					result ++;
					
				}
			}
		}
		
		return result;

    }

}
