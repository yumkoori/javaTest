package days10;

public class Ex01 {

	public static void main(String[] args) {
		
		
	}

	public static String binaryConvert(int n) {
	      
	      int share, rest; // 몫, 나머지 변수
	      String binary = "";
	      while ( n != 0 ) {
	    	  rest = n % 2;
	         share = n / 2;
	         System.out.println( rest );
	         binary = rest + binary;
	         
	      } // while
	      
	      // System.out.println( binary );
	      //                  1010
	      return String.format("%s%s"
	            , "0".repeat( 8- binary.length()), binary);
	   }
	   
}
