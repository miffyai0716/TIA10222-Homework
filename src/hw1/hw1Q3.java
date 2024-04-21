package hw1;

public class hw1Q3 {

	//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	
	public static void main(String[] args) {
		
		int ts = 256559;
		
		int spd = 60 * 60 * 24;
		int sph = 60 * 60;
		int spm = 60;
		
		int d = ts / spd;
		int rsd = ts % spd;
		
		int h =  rsd / sph;
		int rsh = rsd % sph;
		
		int m = rsh / spm;
		int rsm = rsh % spm;
		
		System.out.println(ts + " 秒等於 " + d + " 天、" + h + " 小時、" + m + " 分鐘、" + rsm + " 秒");
		
	}
	
}
