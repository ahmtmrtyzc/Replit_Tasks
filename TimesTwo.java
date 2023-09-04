package ReplitTries;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesTwo {
	public static ArrayList<Integer> timesTwo(ArrayList<Integer> list){
		ArrayList<Integer> temps = new ArrayList<Integer>();
	
		for (int i : list) 
		{
			temps.add(i*2);
			
		}
		return temps;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.nextInt());
	    }

	    System.out.println(timesTwo(list));

	}

}
