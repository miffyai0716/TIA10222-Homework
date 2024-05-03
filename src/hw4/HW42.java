package hw4;

public class HW42 {
	
//	請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)

	    public static void main(String[] args) {
	        String s = "Hello World";
	        String reversed = reverseString(s);
	        System.out.println(reversed);
	    }
	    
	    public static String reverseString(String s) {
	        // 創建 StringBuilder 物件
	        StringBuilder sb = new StringBuilder();
	        
	        // 將字串轉換成字元陣列
	        char[] charArray = s.toCharArray();
	        
	        // 逐個將字元加入 StringBuilder 物件中
	        for (int i = charArray.length - 1; i >= 0; i--) {
	            sb.append(charArray[i]);
	        }
	        
	        // 將 StringBuilder 物件轉換回字串並返回
	        return sb.toString();
	    }
	}


