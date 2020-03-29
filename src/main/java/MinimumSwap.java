
public class MinimumSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,5,4};
		System.out.println(minimumSwaps(arr));
		System.out.println(arr);
	}
	
	
	
	static int minimumSwaps(int[] arr) {
		int swapCount = 0;
		int n = arr.length - 1;
		for (int i = 0; i < n;i++) {
			if (i < arr[i] - 1) {
				System.out.println("i is : "+ i);
				System.out.println("swap with : "+ (arr[i] - 1));
				System.out.println("arr : "+ arr[i]);
				swap(arr,i,Math.min(n, arr[i] - 1));
				
				swapCount++;
				i--;
			}
		}
		
		return swapCount;


    }
private static void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
}
