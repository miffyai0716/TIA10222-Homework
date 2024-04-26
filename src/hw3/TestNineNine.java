package hw3;

// 請建立一個TestNineNine.java程式，可輸入九九乘法表

// 1. 使用for迴圈 + while迴圈
// 2. 使用for迴圈 + do while迴圈
// 3. 使用while迴圈 + do while迴圈

public class TestNineNine {
	public static void main(String[] args) {
		// for+while
		for (int i = 1; i < 10; i++) {
			int j = 1;
			while (j < 10) {
				System.out.print("\t" + i + "x" + j + "=" + i * j);
				j++;
			}
			System.out.println();
		}
		System.out.println();
		// for + do while
		for (int x = 1; x < 10; x++) {
			int y = 1;
			do {
				System.out.print("\t" + x + "x" + y + "=" + x * y);
				y++;
			} while (y < 10);
			System.out.println();
		}
		System.out.println();

		// while + do while
		int a = 1;
		while (a < 10) {
			int b = 1;
			do {
				System.out.print("\t" + a + "x" + b + "=" + a * b);
				b++;
			} while (b < 10);
			a++;
			System.out.println();
		}
	}
}
