package ReplitTries;

import java.util.ArrayList;

public class AddArrayList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ahmet");
		names.add("Melike");
		names.add("Murat");

		ArrayList<String> strs = new ArrayList<String>();
		for (int i = 0; i < names.size(); i++) {
			names.get(i);
			strs.add(names.get(i) + " Hello");
		
		}
System.out.println(strs);
System.out.println(names.size());
	}

}
