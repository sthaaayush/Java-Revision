package days2;

public class Array {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		float average;
		for (int num : number) {
			System.out.print(num + " ");
			sum += num;
		}

		average = (float) sum / number.length;
		System.out.println("\nSum:" + sum);
		System.out.println("Average:" + average);
	}
}
