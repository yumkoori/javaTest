package days07;

public class pr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. -1/2+2/3-3/4+..+6/7-7/8+8/9=??? 출력하는 코딩을 하세요. ( 반복문 사용 )
		//1. -1/2+2/3-3/4+..+6/7-7/8+8/9=??? 출력하는 코딩을 하세요. ( 반복문 사용 )
//	
//		int result = 0;
//		
//		for (int i = 1, j = 2; i < 9; i++) {
//			
//			if(i % 2 == 0) {
//				result += i / j;
//				System.out.print("+" + i + "/" + j);
//			} else {
//				result += (i * -1) / j;
//				System.out.print("-" + i + "/" + j);
//			}
//			j++;
//			
//		} //for i
//		System.out.print("=" + result);
		
		boolean sw = true;
		double sum = 0;
		for (int i = 1; i <= 8; i++) {
			System.out.print(sw ? "-" : "+");
			System.out.printf("%d/%d", i, i+1);
			sw = sw ? false : true;
			
			sum += sw ? (double) -i / (i+1) :(double) (i / (i+1)); 
		} //for i
		
		System.out.printf("\b=%f\n", sum);
		
//	     항(Term)
	      // 1. -1/2+2/3-3/4+..+6/7-7/8+8/9=??? 출력하는 코딩을 하세요. ( 반복문 사용 )
	      //   분자/분모 =   i/(i+1)
	      // System.out.println(  2/3 );
	      // 분자
	      boolean sw = false; 
	      double sum = 0;      
	      for (int i = 1; i <= 8; i++) {
	         double term = (double)i/(i+1);
	         sum += sw ? term : -term;
	         System.out.printf( (sw?"+":"-") + "%d/%d", i, i+1);
	         // sum 계산
	         sw = !sw;
	      } // for i
	      System.out.printf("\b=%f\n", sum);
	}

}
