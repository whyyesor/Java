import java.util.Arrays;

public class BreakingTheRecords2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {10,20,15,5,25,30,2,28,31};
		System.out.println(Arrays.toString(breakingRecords(scores)));

	}
	
	 static int[] breakingRecords(int[] scores) {
		 int[] breakRecord = new int[2];
		 int min = 999;
		 int max = 0;
		 int minBreaks = 0;
		 int maxBreaks = 0;
		 for (int i = 0; i < scores.length; i++) {
			 if (i == 0) {
				 min = scores[i];
				 max = scores[i];
			 } else {
				 if (scores[i] > max) {
					 max = scores[i];
					 maxBreaks += 1;
				 }
				 if (scores[i] < min) {
					 min = scores[i];
					 minBreaks += 1;
				 }
			 }
		 }
		 breakRecord[1] = minBreaks;
		 breakRecord[0] = maxBreaks;
		 return breakRecord;

	    }

}
