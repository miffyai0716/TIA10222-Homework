package hw4;

public class HW46 {
	
//	班上有8位同學,他們進行了6次考試結果如下表
//
//		請算出每位同學考最高分的次數
//		(提示:二維陣列)

	    private int[][] stuExer;
	    int[] highScoreCount = new int[8];

	    public HW46(){
	        stuExer = new int[][]{{10, 35, 40, 100, 90, 85, 75, 70},
	                {37, 75, 77, 89, 64, 75, 70, 95},
	                {100, 70, 79, 90, 75, 70, 79, 90},
	                {77, 95, 70, 89, 60, 75, 85, 89},
	                {98, 70, 89, 90, 75, 90, 89, 90},
	                {90, 80, 100, 75, 50, 20, 99, 75}};
	    }

	    public void compareHighScore() {
	        for (int i = 0; i < stuExer.length; i++) {
	            int highScore = Integer.MIN_VALUE;
	            for (int j = 0; j < stuExer[i].length; j++) {
	                if (highScore < stuExer[i][j]) {
	                    highScore = stuExer[i][j];
	                }
	            }
	            for (int j = 0; j < stuExer[i].length; j++) {
	                if (stuExer[i][j] == highScore) {
	                    highScoreCount[j]++;
	                }
	            }
	        }
	    }
	        public void printHighScoreCount(){
	            for (int i = 0; i < highScoreCount.length; i++) {
	                System.out.println(i + 1 + "號同學考最高分的次數是" + highScoreCount[i] + "次");
	        }
	    }
	    public static void main(String[] args) {
	        HW46 ess = new HW46();
	        ess.compareHighScore();
	        ess.printHighScoreCount();
	    }
	}
	

