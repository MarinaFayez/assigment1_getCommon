package assigment1_getCommon;

import java.util.Arrays;
import java.util.HashMap;

public class repeated_elements {


		public void repeatedNsquare(int myarray[]) {
			
	        if(myarray == null ) {
	            return;
	        }

	        for(int i = 0; i < myarray.length; i++) {
	            for(int j = i+1; j < myarray.length; j++){
	                if(myarray[i] == myarray[j]) {
	                    System.out.println(myarray[i]);
	                }
	            }
		}
	        
		}
		
public void repeatedNlogN(int myarray[]) {
			
	        if(myarray == null ) {
	            return;
	        }
	        Arrays.sort(myarray);
	        for(int i = 0; i < myarray.length-1; i++) {
	            
	                if(myarray[i] == myarray[i+1]) {
	                    System.out.println(myarray[i]);
	                }
	            
		}
	        
		}

public void repeatedN(int myarray[]) {
	
    if(myarray == null ) {
        return;
    }
    HashMap<Integer, Object> myHash = new HashMap<Integer, Object>();
    for(int i = 0; i <myarray.length; i++) {
        if(myHash.containsKey(myarray[i])) {
            System.out.println(myarray[i]);
        }else
        myHash.put(myarray[i], null);
    
}
		

}
}
