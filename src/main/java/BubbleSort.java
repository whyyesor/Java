
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {6,4,1};
		countSwaps(a);

	}

	static void countSwaps(int[] n) {
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			
			for (int j = 0; j < n.length - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (n[j] > n[j + 1]) {
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
					count += 1;
				}
			}
			

		}
		System.out.println("Array is sorted in "+count+" swaps.");
		System.out.println("First Element: "+n[0]);
		System.out.println("Last Element: "+n[n.length - 1]);
		

    }

	
}
