import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(9);
		arr.add(6);
		List<Integer> brr = new ArrayList<Integer>();
		brr.add(36);
		brr.add(72);
		//brr.add(96);
		brr.sort(null);
		
		int total = getTotalX(arr,brr);
		System.out.println(total);

	}
	
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
	    // Write your code here
		int total = 0;
		int firstElement = b.get(0);
		System.out.println(firstElement);
		List<Integer> fact = new ArrayList<Integer>();
		int bSize = a.size();
		for (int i = 1; i <= firstElement; i++) {
			Boolean flag1 = true;
			for (int j = 0; j < bSize; j++) {
				if ((i % a.get(j) != 0)) {
					flag1 = false;
				}

			}
			if (flag1 == true)
				fact.add(i);
		}
		System.out.println(fact);

		for (int i = 0; i < fact.size(); i++) {
			Boolean isDivisable = true;
			for (int j = 0; j < b.size(); j++) {
				if ((b.get(j) % fact.get(i) == 0)) {
					System.out.println("b : " + b.get(j));
					System.out.println("fact : " + fact.get(i));
					continue;
				} else {
					System.out.println("false b : " + b.get(j));
					System.out.println("False fact : " + fact.get(i));
					isDivisable = false;
				}

			}

			total += isDivisable ? 1 : 0;

		}

		return total;

	}

}
