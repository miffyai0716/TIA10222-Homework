package hw1;

public class hw1 {
	
	public static void main(String[] args) {
		
		// 請設計一支JAVA程式，計算12，6這兩個數值的和與積
		int num1 = 12;
		int num2 = 6;

		int sum = num1 + num2;
		int product = num1 * num2;

		System.out.println("12和6的和為:" + sum);
		System.out.println("12和6的積為:" + product);

		// 請設計一支JAVA程式，計算200顆雞蛋共是幾打幾顆? (一打為12顆)

		int eggsPerDoz = 12;
		int totalEggs = 200;

		int eggsDoz = totalEggs / eggsPerDoz;
		int eggsRemain = totalEggs % eggsPerDoz;

		System.out.println("200顆雞蛋共是" + eggsDoz + "打和" + eggsRemain + "顆");

		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒

		int ts = 256559;

		int spd = 60 * 60 * 24;
		int sph = 60 * 60;
		int spm = 60;

		int d = ts / spd;
		int rsd = ts % spd;

		int h = rsd / sph;
		int rsh = rsd % sph;

		int m = rsh / spm;
		int rsm = rsh % spm;

		System.out.println(ts + " 秒等於 " + d + " 天、" + h + " 小時、" + m + " 分鐘、" + rsm + " 秒");

		// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

		double pi = 3.1415;
		int r = 5;

		double ca = r * r * pi;
		String caFormatted = String.format("%.2f", ca);

		double cl = r * 2 * pi;
		String clFormatted = String.format("%.2f", cl);

		System.out.println("半徑為5的圓面積=" + caFormatted);
		System.out.println("半徑為5的圓周率=" + clFormatted);

		// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢

		int principal = 1500000;
		double rate = 0.02;
		int years = 10;

		for (int i = 1; i <= years; i++) {

			double interest = principal * rate;
			principal += interest;

		}

		principal = Math.round(principal);
		System.out.println("10年後的本金加利息共有：" + principal + " 元");

		// 請寫一支程式,利用System.out.println()印出以下三個運算式結果:
		// 5 + 5
		// 5 + ‘5’
		// 5 + “5”
		// 並請用註解各別說明答案的產生原因

		System.out.println(5 + 5); // 數字相加=10
		System.out.println(5 + '5'); // 數字與字元(53)相加=58
		System.out.println(5 + "5"); // 數字與字串相加=顯示出55

	}

}
