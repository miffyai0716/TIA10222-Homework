package hw1;

public class hw1Q5 {
	
	//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢

	public static void main(String[] args) {
        int principal = 1500000;  
        double rate = 0.02;          
        int years = 10;              

        for (int i = 1; i <= years; i++) {
        	
            double interest = principal * rate;
            principal += interest;
            
        }	
        
        principal = Math.round(principal);

        System.out.println("10年後的本金加利息共有：" + principal + " 元");
    }
}
