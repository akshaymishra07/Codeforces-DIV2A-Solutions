import java.util.Scanner;

public class FiveFourSixA {

	public static int calculateRequirement(int k, int n, int w) {
		int difference;

		// Here the logic is : if we calculate the sum from 1 to w and multiply it with
		// k then
		// it will give us the total amount required to buy n bananas.
		// calculations of difference doesnt need any explanation

		int sum = (w * (w + 1)) / 2;
		int requiredAmount = sum * k;

		difference = requiredAmount - n;
                if(difference<0) {difference = 0;}
		return difference;

	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int k = kb.nextInt();
		int n = kb.nextInt();
		int w = kb.nextInt();

		int result = calculateRequirement(k, n, w);
		System.out.println(result);

	}

}
