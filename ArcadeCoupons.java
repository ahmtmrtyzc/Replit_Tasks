//The video games machines at your local arcade outputs coupons according to how well you play the game. 
//  - You can redeem 10 coupons for a candy bar or you can redeem 3 for a gumball
//- Write a program that displays how many candy bars and gumballs you can get. You perfer candy bars. 

//- if you the coupons are not enough for any redeem, display message:

// `"Not enough coupons"`

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
			System.out.println("Number of Gumballs:" + coupon / candybar);

			if (rem >= 3) {
				System.out.println("Number of Candies:" + rem / 3);
			}
		} else if (coupon <= 9 && coupon > 3) {
			System.out.println("Number of Candies: 0");
			System.out.println("Number of Gumballs: " + coupon / 3);
		} else if (coupon < 3) {
			System.out.println("Not enough coupons");
		}

	}

}
