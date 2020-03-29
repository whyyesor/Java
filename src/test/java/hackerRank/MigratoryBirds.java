package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> count = new ArrayList<Integer>();
		//1 2 3 4 5 4 3 2 1 3 4
		count.add(1);count.add(2);count.add(3);count.add(4);count.add(5);
		count.add(4);
		count.add(3);
		count.add(2);
		count.add(1);
		count.add(3);
		count.add(4);
				System.out.println(migratoryBirds(count));

	}
	
	
	static int migratoryBirds(List<Integer> arr) {
		int max = Integer.MIN_VALUE;
		
		int[] noOfBirds = new int[5];
		List<Integer> count = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == 1) {
				noOfBirds[0]++;
			}
			if (arr.get(i) == 2) {
				noOfBirds[1]++;
			}
			if (arr.get(i) == 3) {
				noOfBirds[2]++;
			}
			if (arr.get(i) == 4) {
				noOfBirds[3]++;
			}
			if (arr.get(i) == 5) {
				noOfBirds[4]++;
			}
		}
		for (int i = 0; i < 5; i++) {
			if (noOfBirds[i] > max ) {
				max = noOfBirds[i];
			}
		}
		for (int i = 0; i <5;i++) {
			if (noOfBirds[i] == max ) {
				count.add(i+1);
			}
		}
		
		return count.get(0);

    }
	

}
