package ReplitTries;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		fib(num);

	}

	public static void fib(int num) {

		List<Integer> numbersList = new ArrayList<>();
		int first = 0, second = 1, fib, lastElement = 0;
		numbersList.add(first);
		numbersList.add(second);
		for (int i = 2; i < num+1; i++) {
			fib = second + first;
			first = second;
			second = fib;
			numbersList.add(fib);
			lastElement= numbersList.get(i);

		}
		if(num == 0) {
			System.out.println("0");
			
		}
		else if (num ==1) {
			System.out.println("1");
		}
		else if(num==2) {
			System.out.println("1");
		}
		else {
			System.out.println(lastElement);
		}

	}

}
