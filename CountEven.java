//Given an array **nums**, count and print the number of even numbers in the array//package ReplitTries;

public class CountEven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
		

		int even = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				even++;
			}
			System.out.println(even);

		}
	}

}
