package hw1;

public class hw1Q2 {
		
		//請設計一支JAVA程式，計算200顆雞蛋共是幾打幾顆? (一打為12顆)
		
		public static void main(String[] args) {
			
			int eggsPerDoz = 12;
			int totalEggs = 200;
			
			int eggsDoz = totalEggs / eggsPerDoz;
			int eggsRemain = totalEggs % eggsPerDoz;
			
			System.out.println("200顆雞蛋共是" + eggsDoz + "打和" + eggsRemain + "顆");
			
		}
	}
