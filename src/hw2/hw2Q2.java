package hw2;

public class hw2Q2 {
	
	//請設計一支Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

	public static void main(String[] args) {
		
		int product = 1; 
		
		for(int i = 1 ; i <= 10 ; i++) {
			
			product *= i;
			
		}
		
		System.out.println("1~10的連乘積=" + product);
		
	}
	
}
