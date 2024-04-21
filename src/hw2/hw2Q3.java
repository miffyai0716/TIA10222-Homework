package hw2;

public class hw2Q3 {
	
	//請設計一支Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	
	public static void main(String[] args) {
		
		int product = 1;
		int i = 1;
		
		while(i<=10) {
			product *= i;
			i++;
			
		}
		
		System.out.println("計算1~10的連乘積=" + product);
		
	}

}
