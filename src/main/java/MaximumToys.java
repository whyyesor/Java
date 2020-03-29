import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaximumToys {
	Stack<Character> stack = new Stack<Character>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices = {1,5,100,10,20};
		int k = 100;
		System.out.println(maximumToys(prices, k));
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		
		
	}
	void pushCharacter(char ch) {
		stack.push(ch);
	}
	
	// Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
    	int count = 0;
    	Arrays.sort(prices);
    	
		for (int i = 0; i < prices.length; i++) {
			k -= prices[i];
			if (k < 0) {
				System.out.println(k);
				return count;
			} else {
				System.out.println(k);
				count += 1;
			}

		}
    	return count;
    	
    }

}
class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
		if (a.score == b.score){
            a.name.compareTo(b.name);
        }
        return b.score - a.score;
    
    }
}
