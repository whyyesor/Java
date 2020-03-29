package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> sq = 
				new ArrayList<Integer>();
		sq.add(4);sq.add(1);
		//sq.add(3);sq.add(2);sq.add(5);
		int bDay = 4;
		int bMonth = 1;
		System.out.println(birthday(sq,bDay,bMonth));
		

	}
	
	static int birthday(List<Integer> s, int d, int m) {
		int result = 0;
		int stop = s.size() - m;
		for (int i = 0; i < s.size(); i++) {
			int sum = 0;
			if (i < stop) {
				for (int j = 0; j < m; j++) {
					if (i + j < s.size()) {
						sum += s.get(i + j);
					}
				}
				if (sum == d) {
					result++;
				}
			}
		}

		return result;
	}

}
