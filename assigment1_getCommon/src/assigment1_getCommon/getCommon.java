package assigment1_getCommon;

import java.util.Arrays;
import java.util.HashMap;

public class getCommon  {

	public void getCommonNsquare(int firstList[], int secondList[]) {
	
	        if(firstList == null || secondList == null) {
	            return;
	        }
	        
	        for(int i = 0; i < firstList.length; i++) {
	            for(int j = 0; j < secondList.length; j++){
	                if(firstList[i] == secondList[j]) {
	                    System.out.println(firstList[i]);
	                }
	            }
	        }

	}


	public void getCommonNlogN(int firstList[], int secondList[]) {
		if(firstList == null || secondList == null) {
            return;
        }
       
        // Note the original array contents are changed and get sorted
        Arrays.sort(firstList);
        Arrays.sort(secondList);
        
        for(int firstListIndex = 0, secondListIndex = 0;
                firstListIndex < firstList.length && secondListIndex < secondList.length; /* No incremet/decrement statment*/) {
            if(firstList[firstListIndex] == secondList[secondListIndex]) {
                System.out.println(firstList[firstListIndex]);
                firstListIndex++;
                secondListIndex++;
            } else {
                 if(firstList[firstListIndex] < secondList[secondListIndex]) {
                     firstListIndex++;
                 } else {
                      secondListIndex++;
                 }
            }
        }
    }
	
	static void getCommonN(int firstList[], int secondList[]) {
        if(firstList == null || secondList == null) {
            return;
        }
        HashMap<Integer, Object> myHash = new HashMap<Integer, Object>();
        for(int i = 0; i < firstList.length; i++) {
            myHash.put(firstList[i], null);
        }   
        for(int i = 0; i <secondList.length; i++) {
            if(myHash.containsKey(secondList[i])) {
                System.out.println(secondList[i]);
            }
        }
    }



}
	

