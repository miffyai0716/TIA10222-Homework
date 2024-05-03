package hw4;
	
import java.util.Scanner;

	public class HW45 {
		
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//		(提示1:Scanner,陣列)
//		(提示2:需將閏年條件加入)
//		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
		
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("請輸入西元年份:");
	        int year = scanner.nextInt();
	        System.out.println("請輸入月份:");
	        int month = scanner.nextInt();
	        System.out.println("請輸入日期:");
	        int day = scanner.nextInt();
	        
	        // 檢查月份是否合法
	        if (month < 1 || month > 12) {
	            System.out.println("錯誤：月份輸入不正確。");
	            return;
	        }
	        
	        // 檢查日期是否合法
	        if (day < 1 || (month == 2 && isLeapYear(year) && day > 29) ||
	            (month == 2 && !isLeapYear(year) && day > 28) ||
	            ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) ||
	            (day > 31)) {
	            System.out.println("錯誤：日期輸入不正確。");
	            return;
	        }
	        
	        // 計算該日期是該年的第幾天
	        int dayOfYear = calculateDayOfYear(year, month, day);
	        
	        System.out.println("輸入的日期為該年第" + dayOfYear + "天");
	    }
	    
	    // 判斷是否為閏年
	    public static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }
	    
	    // 計算該日期是該年的第幾天
	    public static int calculateDayOfYear(int year, int month, int day) {
	        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        int dayOfYear = day;
	        for (int i = 0; i < month - 1; i++) {
	            dayOfYear += daysInMonth[i];
	        }
	        return dayOfYear;
	    }
	}
