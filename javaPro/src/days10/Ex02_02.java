package days10;

public class Ex02_02 {

	public static void main(String[] args) {
		int money = 125760;
		int unit = 50000;
		int num = 0; 
		boolean sw = false;
		
		while (unit >= 1) {
			num = money / unit;
			System.out.printf("%d원 : %d개 \n", unit, num);
			money %= unit;
			unit = unit / (sw ? 2 : 5);
			sw = !sw;
			
		}

	}

}
