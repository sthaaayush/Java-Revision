package days2;

public class Array2D {
	public static void main(String[] args) {
		int[][] matrixDemo = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.print("Matrix\n");
		for (int i = 0; i < matrixDemo.length; i++) {
			for (int val : matrixDemo[i]) {
				System.out.print(val + " ");
			}
			System.out.print("\n");
		}

		System.out.print("Row Sum\n");
		for (int i = 0; i < matrixDemo.length; i++) {
			int rowSum = 0;
			for (int val : matrixDemo[i]) {
				rowSum += val;
			}
			System.out.println(rowSum);
		}

		System.out.print("Column Sum\n");
		for (int i = 0; i < matrixDemo[0].length; i++) {
			int columnSum = 0;
			for (int j = 0; j < matrixDemo[i].length; j++) {
				columnSum += matrixDemo[j][i];
			}
			System.out.println(columnSum);
		}
	}
}
