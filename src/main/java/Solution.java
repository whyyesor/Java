import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the maximizingXor function below.
    

	static void plusMinus(int[] arr) {
		
		double pCount = 0;
		double nCount = 0;
		double zCount = 0;
		
		
		for (int i = 0; i < arr.length; i ++) {
			int number = arr[i];
			if(number > 0)
	        {
				pCount += 1;
	        }
	        else if(number < 0)
	        {
	        	nCount += 1;
	        }
	        else
	        {
	        	zCount += 1;
	        }
		}
		
		System.out.println(pCount / arr.length);
		System.out.println(nCount / arr.length);
		System.out.println(zCount / arr.length);
		
		
    }
	
	static void staircase(int n) {
        for (int i = 1; i <= n; i++){
        	for (int j = 1; j <= n; j++) {
        		if (j<=n-i) {
        		System.out.print(" ");
        		} else {
        			System.out.print("#");
        		}
        	}
            System.out.println("");
        }

    }
	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	Arrays.sort(arr);
    	int minSum = 0;
    	int maxSum = 0;
    	for (int i = 0; i <= arr.length -1; i++) {
    		if (i == 0) {
    			minSum = minSum + arr[i];
    		} else if (i == arr.length - 1) {
    			maxSum = maxSum + arr[i];
    		} else {
    			minSum = minSum + arr[i];
    			maxSum = maxSum + arr[i];
    		}
    	}
    	
    	System.out.println(minSum);
    	System.out.println(maxSum);
    }
    static int birthdayCakeCandles(int[] ar) {
    	int maxHeightofCalender = Integer.MIN_VALUE;
    	int maxHeightCounter = 0;
    	for (int i = 0; i < ar.length; i++) {
    		
    		if (ar[i]== maxHeightofCalender) {
    			maxHeightCounter++;
    		}
    		
    		if (ar[i] > maxHeightofCalender) {
    			maxHeightofCalender = ar[i];
    			maxHeightCounter = 1;
    		}
    		
    	}
    	return maxHeightCounter;

    }
    static String timeConversion(String time) {
    	String tArr[] = time.split(":");
        String AmPm = tArr[2].substring(2,4);
        String hh1,mm,ss;
        hh1 = tArr[0];
        mm = tArr[1];
        ss = tArr[2].substring(0,2);
        int hh = Integer.parseInt(hh1);
        String checkPM = "PM",checkAM ="AM";
        String h = hh1;
        if(AmPm.equals(checkAM) && hh==12)
        	h="00";
        else if(AmPm.equals(checkPM)&& hh<12) {
        	hh+=12;
        	h = Integer.toString(hh);
        }
        String timeOut = h+":"+mm+":"+ss;
        //System.out.printf("%02d:%02d:%02d",h,mm,ss);
        return timeOut;

    }
    
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
    	List<Integer> list=new ArrayList<Integer>();
    	Iterator<Integer> it = grades.iterator();
    	while(it.hasNext()) {
    		
    		int grade = it.next();
    		if (grade > 37) {
    			int reminder = grade % 10;
    			if (reminder == 3) {
    				grade = grade + 2;
    				list.add(grade);
    			} else if (reminder == 8) {
    				grade = grade + 2;
    				list.add(grade);
    			} else if (reminder == 4) {
    				grade = grade + 1;
    				list.add(grade);
    			} else if (reminder == 9) {
    				grade = grade + 1;
    				list.add(grade);
    			} else {
    				list.add(grade);
    			}
    		} else {
    			list.add(grade);
    		}
    	}
    	
    	
    	
    	return list;

        }
 // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    	int lengthA = apples.length;
    	int lengthO = oranges.length;
    	int totalApples = 0;
    	int totalOranges = 0;
    	for (int i = 0; i <lengthA;i++) {
    		if ((apples[i] + a) >= s && (apples[i] + a) <= t) {
    			totalApples += 1;
    		}
    	}
    	
    	for (int i = 0; i <lengthO;i++) {
    		if ((oranges[i] + b) >= s && (oranges[i] + b) <= t) {
    			totalOranges += 1;
    		}
    	}
    	
    	System.out.println(totalApples);
    	System.out.println(totalOranges);
    }
    
 // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	int noOfPairs = 0;
    	int pCount = 0;
    	
    	int temp = 0;
    	int f = 1;
		for (int j = 0; j < n; j++) {

			for (int i = 0; i < n; i++) {
				if (ar[i] == 0) {
					continue;
				} else {
					if (f == 1) {
						temp = ar[i];
						f = 0;
						pCount += 1;
						ar[i] = 0;
					} else {
						if (ar[i] == temp) {
							System.out.println(ar[i]);
							pCount += 1;
							ar[i] = 0;
						}

					}
				}
			
			}

			noOfPairs = noOfPairs + pCount / 2;
			pCount = 0;
			f = 1;
		}
    	
    	return noOfPairs;

    }
    
    static int factorial(int n) {
    	
    	if (n <= 1) {
    		return 1;
    	}else {
    		return n * factorial(n - 1);
    	}
    	

    }
    static void minimumBribes(int[] q) {
        int swapCount = 0;

        for (int i = q.length -1; i >=0; i--){

            if (q[i] != i + 1){

                if (((i - 1) >= 0) && q[i - 1] == (i + 1)){
                    swapCount ++;
                    
                    swap(q,i - 1,i);
                } else if (((i - 2) >= 0) && q[i - 2] == (i + 1)){
                    swapCount += 2;
                    swap(q,i - 2, i -1);
                    swap(q,i - 1,i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }


            }


        }
        System.out.println(swapCount);

    }
    
    private static void swap(int[] q, int i, int i2) {
		
    	int temp = q[i];
    	q[i] = q[i2];
    	q[i2] = temp;
	}
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	String meet = "No";
    	if (x1 > x2) {
    		if (v1 < v2) {
    			int i = x2;
    			while (i <= 100000000) {
    				x1 = x1 + v1;
    				x2 = x2 + v2;
    				System.out.println("X1 is : "+ x1);
    				System.out.println("X2 is : "+ x2);
    				System.out.println("###########");
    				if (x1 == x2) {
    					meet = "Yes";
    					i = 111111000;
    				} else if (x2 > x1) {
    					meet = "No";
    					i = 111111000;
    				}
    				i = i + v2;
    			}
    		} else {
    			meet = "No";
    		}
    	} else if (x2 > x1) {
    		if (v2 < v1) {
    			int i = x1;
    			while (i <= 100000000) {
    				x1 = x1 + v1;
    				x2 = x2 + v2;
    				System.out.println("X1 is : "+ x1);
    				System.out.println("X2 is : "+ x2);
    				System.out.println("###########");
    				if (x1 == x2) {
    					meet = "Yes";
    					i = 111111000;
    				} else if (x1 > x2) {
    					meet = "No";
    					i = 111111000;
    				}
    				i = i + v1;
    			}
    		} else {
    			meet = "No";
    		}
    	} else {
    		if ((v1 > v2)|(v2 > v1)) {
    			meet = "No";
    		} else {
    			meet = "Yes";
    		}
    	}
    	
    	return meet;

    }
	public static void main(String[] args) throws IOException {
		
		System.out.println(kangaroo(2081,8403,9107,8400));
//    	System.out.println(factorial(3));
//    	int n = 65535;
//    	String s = Integer.toBinaryString(n);
//    	System.out.println(s);
//    	int max = 0;
//    	int temp = 0;
//    	for (int i = 0; i < s.length();i++) {
//    		char a = ;
//    		if (s.charAt(i)=='1') {
//    			temp += 1;
//    			System.out.println("1");
//    		} else {
//    			if (temp > max) {
//    				max = temp;
//    			}
//    			temp = 0;
//    			System.out.println("0");
//    			
//    		}
//    	}
//    	if (temp > max) {
//			max = temp;
//		}
//    	System.out.println(max);
    	
//    	sockMerchant
//    	int n = 9;
//    	int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
//    	int result = sockMerchant(n, ar);
//    	System.out.println(result);
//    	int [][] ar1 = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,9,2,-4,-4,0},{0,0,0,-2,0,0,},{0,0,-1,-2,-4,0}};
//    	int len = ar1.length;
//    	int max = -45;
//    	for (int i = 0; i < len-2; i++) 
//            for (int j = 0; j < len-2; j++) { 
//            	
//            	int sum = 0;
//            	for (int k = 0; k <3;k++)
//            		for (int l = 0; l < 3;l++) {
//            				int a = i+k;
//            				int b = j+l;
//            				System.out.println("arr[" + a + "][" + b + "] = "
//                                   + ar1[a][b]); 
//            				if ((k == 1 && l == 0) | (k == 1 && l == 2) ) {
//            					continue;
//            				} else {
//            					sum = sum + ar1[a][b];
//            				}
//            		}
//            	System.out.println("#####################");
//            	if (sum > max) {
//            		max = sum;
//            		System.out.println(max);
//            		System.out.println("*****************");
//            	}
//            }
//    	System.out.println("Sum is : "+ max);
    	//    	//countApplesAndOranges
//    	int s = 7;
//    	int t = 11;
//    	int a = 5;
//    	int b = 15; 
//    	int[] apples = {-2,2,1};
//    	int[] oranges = {5,-6};
//    	countApplesAndOranges(s, t, a, b, apples, oranges);
    	
//    	int[] arr = {1,2,3,0,-1,2,0,-3,5};
//    	int b = arr[0];
//        int a = arr.length;
//        System.out.println(a);
//        System.out.println(b);
//        plusMinus(arr);
//    	staircase(3);
    	
//    	int[] arr = {1,2,3,7,5,4,7};
//    	miniMaxSum(arr);
//    	System.out.println(birthdayCakeCandles(arr));
//    	String input = "11:59:10PM";
//    	System.out.println(timeConversion(input));

//    	Grading Students
//    	List<Integer> grades = Arrays.asList(23,40,52,29,38,70,83,64);
//    	
//    	List<Integer> result = gradingStudents(grades);
//    	Iterator<Integer> it = result.iterator();
//    	while(it.hasNext()) {
//    		System.out.println(it.next());
//    	}
    	
    	
    	
    }
   }
