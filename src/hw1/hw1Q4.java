package hw1;

public class hw1Q4 {
	
	//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	
	public static void main(String[] args) {
		
		double pi = 3.1415;
		int r = 5;
		
		double ca = r * r * pi;
		String caFormatted = String.format("%.2f", ca);
		
		double cl = r * 2 * pi;
		String clFormatted = String.format("%.2f", cl);
		
		System.out.println("半徑為5的圓面積=" + caFormatted);
		System.out.println("半徑為5的圓周率=" + clFormatted);
		
	}

}
