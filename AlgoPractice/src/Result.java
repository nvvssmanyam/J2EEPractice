import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'goodSegment' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY badNumbers
     *  2. INTEGER lower
     *  3. INTEGER upper
     */

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(37);
		list.add(7);
		list.add(22);
		list.add(15);
		list.add(49);
		list.add(60);
		
//		System.out.println(goodSegment(list, 3, 48));
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(4);
		list2.add(2);
		list2.add(15);
		
//		System.out.println(goodSegment(list2, 1, 10));

		List<Integer> list3 = new ArrayList<>();
		list3.add(4);
		list3.add(6);
		list3.add(8);
		list3.add(12);
		list3.add(20);
		System.out.println(goodSegment(list3, 1, 30));
	}
	
    public static int goodSegment(List<Integer> badNumbers, int lower, int upper) {
    
    	Collections.sort(badNumbers);
    	System.out.println(badNumbers);
    	
    	int startRange = lower;
    	int endRange = upper;
    	int maxRange = 0;
    	
    	for(int i=0; i<badNumbers.size(); i++) {
    		System.out.println(badNumbers.get(i) +" < "+upper);
    		endRange = badNumbers.get(i) < upper ? badNumbers.get(i) : upper+1;
    		System.out.println(startRange +" :: "+endRange);
    		if(maxRange < (endRange-1) - startRange) {
    			maxRange = endRange - startRange;
    		}
    		
    		startRange = badNumbers.get(i)+1;
    		if(startRange > upper) {
    			break;
    		}
    		System.out.println();
    	}
    	
    	return maxRange;

    }
    
}