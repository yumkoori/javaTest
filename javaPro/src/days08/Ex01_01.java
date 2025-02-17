package days08;

public class Ex01_01 {

	public static void main(String[] args) {
//		int i = 1;
//		int j = 0;
//		int sum = 0;
//		while(sum <= 100) {
//			if(sum + ++j > 100) {
//				break;
//			}
//			sum += j;
//			System.out.printf("sum = %d\n", sum);
//			System.out.printf("+%d\n", j);
//			i++;
//			j++;
//		}
//		System.out.printf("결과 = %d", sum);
		
		
		int sum = 0;
		int term = 1;
		int lnc = 1;
		
		while(term <= 100) {
			sum += term;
			
			term += lnc++;
			
		}
		
		System.out.printf("%d", sum);
	}

}
