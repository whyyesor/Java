import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] queries = {{1,5,3},{4,8,7},{6,9,2}};
		int n = 10;
		
		 System.out.println(arrayManipulation(n,queries));
		 

	}
	
	static long arrayManipulation(int n, int[][] queries) {
		long result = 0;
		long [] arr = new long[n+2];
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < queries.length;i++) {
			int a = queries[i][0];
			int b = queries[i][1];
			int k = queries[i][2];
			arr[a] += k;
			arr[b+1]-= k;
			
			}
			
		result = getMax(arr);
		return result;
		
		
    }
	
	static long getMax(long[] arr) {
		long result = Long.MIN_VALUE;
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			result = Math.max(sum, result);
		}
		
		return result;
	}

}
