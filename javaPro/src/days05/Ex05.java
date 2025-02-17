package days05;

public class Ex05 {

	public static void main(String[] args) {
//		for (int i = 1, sum = 0; i <= 10; i++) {		
////			if(i != 10) {
////				System.out.printf("%d+", i);
////			} else {
////				System.out.printf("%d", i);
////			}
//			
//			System.out.printf(i==10 ? "%d" : "%d+", i);
//			sum += i;
//			
//		} 
//		System.out.printf("=%d", sum);
		
		//Unreachable code
		
		int sum = 0;
		int i = 10;
		for (; ; ) {
			if(i < 1) break;
			System.out.printf("%d+", i);
			sum += i;
			i--;
		} //for i
		System.out.printf("=%d", sum);
		
	}
}
