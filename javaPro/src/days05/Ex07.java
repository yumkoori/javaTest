package days05;

public class Ex07 {

	public static void main(String[] args) {
		//�ڹٿ��� ������ ���� �߻���Ű�� �ڵ�.
		//1) Math.random() �޼��� 
		//2) RandomŬ����
		
		//MathŬ���� : ���а� ���õ� ����� ������ Ŭ����
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
