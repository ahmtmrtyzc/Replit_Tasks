package ReplitTries;

import java.util.Arrays;
import java.util.Scanner;

public class FindSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
		int ave = (nums[0]+nums[1]+nums[2]+nums[3]+nums[4]);
		System.out.println(Arrays.toString(nums)+"→"+ave);
		System.out.println(ave);
	}

}
