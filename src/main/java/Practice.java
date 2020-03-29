
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String test = "abcd";
//		int inputNumber = 123405;
//		String rString = reverseString(test);
//		
//		System.out.println("String reversed "+rString);
//		System.out.println("Reverse of Number "+inputNumber + " is :"+ reverseNumber(inputNumber));
//		
		
		///rotate String
		
//		System.out.println(rotate("hello", 1));
//		// System.out.println("1");
//		System.out.println(rotate("hello", 2));
//    		// System.out.println("2");
//		System.out.println(rotate("hello", 35));
//    		// System.out.println("34");
		
		// Reverse Array
		int n =1;
		 int[] arr = {1,2,3,4};
//		 System.out.println(reverseArray(arr,n));
		 
		 //Rotate left array
		 System.out.println(rotLeft(arr,n));

	}
	
	 static int[] rotLeft(int[] a, int d) {
		 int size = a.length;
		 int[] rArray = new int[size];
		 
		 if (d > size) {
			 d = d % size;
		 }
		  for (int i = 0; i < d; i++) {
			  int temp = a[0];
			  for (int j = 1;j < size; j++) {
				  rArray[j-1] = a[j];
			  }
			  rArray[size-1] = temp;
			  a = rArray;
		  }
		  for (int i = 0; i < size; i++) {
			  System.out.println(rArray[i]);
		  }
		 return rArray;
		 

	    }
	
	public static int[] reverseArray(int[] arr, int size) {
		
		int[] reverse = new int[size];
		int rIndex = 0;
		String rString = "";
		for  (int i = size -1; i >= 0; i--) {
			System.out.print(arr[i]);
			reverse[rIndex] = arr[i];
			System.out.print(" ");
			rIndex += 1;
		}
		System.out.println(reverse);
		return reverse;
	}
	
	public static String reverseString(String source) {
		String reverse="";
		for (int i = source.length()-1;i >=0; i--) {
			reverse = reverse+source.charAt(i); 
		}
		return reverse;
	}
	
	public static int reverseNumber(int source) {
		int reverse=0;
		int reminder=0;
		do {
			reminder = source%10;
			reverse=reverse*10+reminder;
			source=source/10;
		} while (source > 0);
		return reverse;
	}
	
	public static String rotate(String str, int n){
	       int lengthofString = str.length();
	        if (n > lengthofString){
	          n = n % 5;
	        }
	        
	  String rotateStr = str.substring(lengthofString - n,lengthofString) + str.substring(0,lengthofString - n);
	  
	    return rotateStr;
	  }

}
