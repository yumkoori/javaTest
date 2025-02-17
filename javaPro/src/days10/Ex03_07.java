package days10;

public class Ex03_07 {

	// __*
    // _***
    // *****
    // _***
    // __*
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
	         for (int j = 1; j <= 5; j++) {
	            //System.out.print( i+j==4 || i==3|| j-i==2?"*":" ");
	            //System.out.print( i+j>=4   ?"*":" ");
	            //System.out.print( j-i<=2 ?"*":" ");
	            System.out.print( i+j>=4 && j-i<=2  ?"*":" ");
	         } // for j
	         System.out.println();
	      } // for i 
		
	}

}
