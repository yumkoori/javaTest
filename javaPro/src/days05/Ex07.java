package days05;

public class Ex07 {

	public static void main(String[] args) {
		//자바에서 임의의 수를 발생시키는 코딩.
		//1) Math.random() 메서드 
		//2) Random클래스
		
		//Math클래스 : 수학과 관련된 기능이 구현된 클래스
//		System.out.println(Math.abs(10));
//		System.out.println(Math.abs(-10));
//		
//
//		for (int i = 0; i < 10; i++) {			
//			System.out.println(Math.random());
//		} //for i
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println((int)(Math.random() * 100));			
//		} //for i
		
//		System.out.println((int)(Math.random() * 101));
		
//		int lottoNumber;
//		for (int i = 0; i <= 6; i++) {
//			lottoNumber = (int)(Math.random() * 45) +1;
//			System.out.printf("[%d]", lottoNumber);
//		} //for i
		
		for (int i = 0; i < 50; i++) {
			
			System.out.printf("%d\n", (int)(Math.random() * 17) + 3);
		} //for i
		
	}

}
