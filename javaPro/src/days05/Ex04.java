package days05;

public class Ex04 {

	public static void main(String[] args) {		
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			System.out.printf("%d + ", i);
//			sum += i;
//		}
//		System.out.println("= " + sum);
//	}
	
		//while문 condition이 참일 동안 {}블럭을 실행하는 반복문
//		while (condition) {
//			
//		}
//		
//		do {
//			
//		} while (condition);
		
		int i = 0;
		int sum = 0;
		
		while( ++i <= 10 ) {
			System.out.printf("%d+", i);
			sum += i;
			//i++;
		}
		System.out.printf("=%d", sum);
	}
}
