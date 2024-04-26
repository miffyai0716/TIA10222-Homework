package hw2;

public class HomeWork2 {

	public static void main(String[] args) {

		// 請設計一支Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

		int sum = 0;

		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		}

		System.out.println("1 到 1000 的偶數和為: " + sum);

		// 請設計一支Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

		int product = 1;
		for (int i = 1; i <= 10; i++) {
			product *= i;

		}

		System.out.println("1~10的連乘積=" + product);

		// 請設計一支Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

		int product1 = 1;
		int i = 1;

		while (i <= 10) {
			product1 *= i;
			i++;

		}

		System.out.println("計算1~10的連乘積=" + product1);

		// 請設計一支Java程式,輸出結果為以下:
		// 1 4 9 16 25 36 49 64 81 100

		for (int x = 1; x <= 10; x++) {
			System.out.print(x * x + " ");
		}

		// 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
		// 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

		int count = 0; // 計數器，用於統計阿文可以選擇的數字的數量

		// 使用雙層迴圈列舉 1 到 49 的所有數字
		for (int y = 1; y <= 4; y++) {
			for (int z = 0; z <= 9; z++) {
				// 如果數字不含有 4，則輸出該數字
				if (y != 4 && z != 4) {
					System.out.print(y * 10 + z + " ");
					count++;
				}
			}
		}

		// 輸出統計結果
		System.out.println("\n總共有 " + count + " 個符合阿文需求的數字。");

//		請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1

		// 外層迴圈控制行數
		for (int m = 10; m >= 1; m--) {
			// 內層迴圈控制每行的數字
			for (int n = 1; n <= m; n++) {
				System.out.print(n + " ");
			}
			// 換行
			System.out.println();

		}

//		請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF

		// 外層迴圈控制行數
		for (char ch = 'A'; ch <= 'F'; ch++) {
			// 內層迴圈控制每行的字元重複次數
			for (int p = 0; p <= ch - 'A'; p++) {
				System.out.print(ch);
			}
			// 換行
			System.out.println();
		}

	}

}
