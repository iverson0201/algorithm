package chapter1.exercise;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

/**
 * 关于矩阵的一些操作
 * 
 * @author liuduo
 * 
 */
public class MatrixOps {
	/**
	 * 构造一个M行N列的boolean型矩阵,矩阵中每个元素的值随机
	 */
	public static boolean[][] constructRandomBooleanMatrix(final int M,
			final int N) {
		boolean[][] a = new boolean[M][N];
		for (int i = 0; i < M; i++)
			for (int j = 0; j < N; j++) {
				a[i][j] = StdRandom.uniform(2) == 0 ? false : true;
			}
		return a;
	}

	/**
	 * 打印boolean型矩阵，其中，使用“*”表示真，“|”表示假，打印出行号和列号
	 */
	public static void printMatrix(boolean[][] a) {
		// 1. 打印矩阵头
		String tableHead = "  ";
		for (int i = 0; i < a[0].length; i++) {
			tableHead += i + " ";
		}
		tableHead = tableHead.substring(0, tableHead.length() - 1);
		StdOut.println(tableHead);
		// 2. 打印矩阵内容
		for (int i = 0; i < a.length; i++) {
			String row = i + " ";
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j])
					row += "*" + " ";
				else
					row += "|" + " ";
			}
			StdOut.println(row.substring(0, row.length() - 1));
		}
	}

	/**
	 * 打印出一个M行N列的二维数组的转置（交换行和列）
	 */
	public static void printTransposedMatrix(boolean[][] a) {
		final int transposedM = a[0].length;
		final int transposedN = a.length;
		boolean[][] transposedMatrix = new boolean[transposedM][transposedN];
		for (int i = 0; i < transposedM; i++)
			for (int j = 0; j < transposedN; j++)
				transposedMatrix[i][j] = a[j][i];

		printMatrix(transposedMatrix);
	}

	public static void main(String[] args) {
		boolean[][] matrix = constructRandomBooleanMatrix(2, 2);
		printMatrix(matrix);
		StdOut.println();
		printTransposedMatrix(matrix);
	}
}
