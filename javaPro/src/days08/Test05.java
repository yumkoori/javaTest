package days08;

public class Test05 {

	public static void main(String[] args) {
	      int d = 2, i = 1;
	      while ( d <= 9 ) {         
	         while (i<=9) {
	            System.out.printf("%d*%d=%2d ", d, i, d*i);
	            i++;
	         } // while i
	         System.out.println(); // 개행
	         d++;
	      } // while d

	}

}
