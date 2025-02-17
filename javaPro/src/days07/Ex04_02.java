package days07;

public class Ex04_02 {

	public static void main(String[] args) {
//		for (int i = 1; i <= 9 ; i++) {
//			
//			for (int j = 2; j <= 5; j++) {
//				System.out.printf("%d * %d = %2d ", j, i, i * j);	 	
//			} //for j
//			System.out.println();
//
//			
//		} //for i
//		System.out.println();
//		
//		for (int i = 1; i <= 9 ; i++) {
//			
//			for (int j = 6; j <= 9; j++) {
//				System.out.printf("%d * %d = %2d ", j, i, i * j);	 	
//			} //for j
//			System.out.println();
//			
//		}
		
	      for (int k = 1; k <=3 ; k++) {
	          for (int i = 1; i <= 9; i++) {
	             for (int d = 3*k-1; d <= 3*k-1+2; d++) {  // 단
	                System.out.printf("%d*%d=%2d ", d, i, d*i);
	             } // for d
	             System.out.println();
	          } // for i   
	          System.out.println();
	       } // for k

	}
	}


