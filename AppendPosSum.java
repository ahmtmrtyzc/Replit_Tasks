//Create a static method that:

//- is called `appendPosSum`
//- returns an `ArrayList` of Integers
//- takes one parameter: an ArrayList of Integers


//This method should:

//- Create a new ArrayList of Integers
//- Add only the positive Integers to the new ArrayList
//- Sum the positive Integers in the new ArrayList and _**add the Sum as the last element**_

package ReplitTries;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPosSum {
	
	public static ArrayList<Integer> appendPosSum (ArrayList<Integer> list){	
		ArrayList<Integer> temp = new ArrayList<>();				
		int total = 0;
		for(int i : list) {
			if(i > 0) {
				temp.add(i);
				total += i;
			}
		}		
		temp.add(total);		
		return temp;
	}
		
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.nextInt());
	      System.out.println(appendPosSum(list));
	      
	    }

	}

}
