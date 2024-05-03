package hw4;

public class HW43 {
	    public static void main(String[] args) {
	        String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
	        int vowelCount = countVowels(planets);
	        System.out.println("總共有 " + vowelCount + " 個母音。");
	    }
	    
	    public static int countVowels(String[] arr) {
	        int count = 0;
	        // 遍歷字串陣列
	        for (String str : arr) {
	            // 將字串轉換為小寫以方便比對
	            str = str.toLowerCase();
	            // 遍歷字串中的每個字元
	            for (int i = 0; i < str.length(); i++) {
	                // 檢查每個字元是否為母音
	                char ch = str.charAt(i);
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
	}


