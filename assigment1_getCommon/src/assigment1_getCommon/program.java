package assigment1_getCommon;
import java.util.*;


public class program {
		public static void main(String[] args) {
	
			int firstList[]={
					1,2,5,6
			};
			int secondList[]={
					3,4,5,6
			};
			int myarray[]={
					1,2,5,4,9,7,10,52,48,30,20,20,70,2,4,10
			};
		
//getCommon arr=new getCommon();
		//arr.getCommonNsquare(firstList, secondList);
		//arr.getCommonNlogN(firstList, secondList);
		//arr.getCommonN(firstList, secondList);
		
repeated_elements repeat=new repeated_elements();
System.out.println("O(Nsquare):");
		repeat.repeatedNsquare(myarray);
		System.out.println("O(N):");
		repeat.repeatedN(myarray);
		System.out.println("O(NlogN):");
		repeat.repeatedNlogN(myarray);
		}
}
