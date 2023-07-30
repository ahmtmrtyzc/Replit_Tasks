package ReplitTries;

import java.util.Scanner;

public class ArcadeCoupons {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		int coupon = input.nextInt();
		int gumballs = 3;
		int candybar = 10;

		
		
		
		if (coupon / candybar != 0) {
			int rem = coupon % candybar;
			System.out.println("Number of Gumballs:" + coupon/candybar);

			if (rem >= 3) {
				System.out.println("Number of Candies:" + rem / 3);
			}
		} else if (coupon < 3) {
			System.out.println("Not enough coupons");
		}

	}

}
