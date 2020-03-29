package hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SherlockAndValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbccddeefghi";
		isValid(s);

	
	}
	
	static String isValid(String s) {
		Map<Character, Integer> frequencies = new HashMap<Character, Integer>();
        
        for(char letter : s.toCharArray())
        {
            if(frequencies.containsKey(letter))
                frequencies.put(letter, frequencies.get(letter) + 1);
            else
                frequencies.put(letter, 1);
        }
        
        
        
        Set<Integer> st = new HashSet<Integer>();
        for(int freq : frequencies.values())
        {
            st.add(freq);
        }
        
        if(st.size() > 2)//More than 2 frequencies
            return "NO";
        else if(st.size() == 1)
            return "YES";
        else//2 different frequencies
        {
            int f1 = 0;
            int f2 = 0;
            int f1Count = 0;
            int f2Count = 0;
            int i = 0;
            for(int n : st)
            {
                if(i == 0) f1 = n;
                else f2 = n;
                i++;
            }
            
            for(int freq : frequencies.values())
            {
                if(freq == f1) f1Count++;
                if(freq == f2) f2Count++;
            }
            
            
            
            if((f1 == 1 && f1Count == 1 ) || (f2 == 1 && f2Count == 1 ))
            	return "YES";
            else if ((Math.abs(f1 - f2)  == 1) && (f1Count == 1 || f2Count == 1))
            	return "YES";
            else
            	return "NO";
        }
	}
	
	static String isValid1(String s) {
		int [] aMinFreq =new int[26];
		for (int i = 0; i < s.length(); i++) {
			char charAtI = s.charAt(i);
			int position = (int) charAtI - (int)'a';
			aMinFreq[position]++;
		}
		System.out.println(Arrays.toString(aMinFreq));
		int noOfChars = aMinFreq[0];
		Boolean isMoreThanZero = true;
		int count = 1;
		int c1 = 1;
		int onesCount = 0;
		int c2 = 0;
		int max = 0;
		for (int i = 0; i <25; i++) {
			
			if (noOfChars == 0 && isMoreThanZero) {
				noOfChars = aMinFreq[i];
				isMoreThanZero = false;
				
			}else if (aMinFreq[i]==1){
				onesCount ++;
			} 
			 else{
				for (int j = i+1;j < 26;j++) {
					if (aMinFreq[i]==aMinFreq[j]) {
						 	aMinFreq[j]=0;
						 	count ++;
					} else {
						c2++;
					}
					
					
				}
				if (count > 1)  c1++;
				count = 1;
			}
			
		}
		System.out.println("COunt is : "+count);
		System.out.println(Arrays.toString(aMinFreq));
		if ((c1 > 1 && onesCount >1)|c1>2) {
			return "NO";
		} else {
		   return "YES";
		}
    }

}
