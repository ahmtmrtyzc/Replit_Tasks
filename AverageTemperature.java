//Given an array **temps** with temperature values find and print the average value
package ReplitTries;

import java.util.Scanner;

public class AverageTemperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble() };

		double ave = (temps[0]+temps[1]+temps[3]+temps[4]+temps[5]+temps[6]+temps[7])/8;
		System.out.println(ave);
	}

}
