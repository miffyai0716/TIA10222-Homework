package hw4;

public class HW41 {

//	有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)

	public static void main(String[] args) {
		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		// 計算陣列的平均值
		double sum = 0;
		for (int num : array) {
			sum += num;
		}

		double average = sum / array.length;
		System.out.println("陣列的平均值為：" + average);

		// 列印大於平均值的元素
		System.out.println("大於平均值的元素為：");
		for (int num : array) {
			if (num > average) {
				System.out.print(num + " ");
			}
		}

		System.out.println();




	}
}
