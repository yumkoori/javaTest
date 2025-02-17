package days10;

public class Ex03_6 {

	public static void main(String[] args) {
		int term = 1;
		
		for (int i = 0; i < 3; i++) {
			for (int j = i; j < 2 - i; j++) {
				System.out.print(" ");
			} 
			for (int k = 1; k <2*i-1 ; k+=2) {
				System.out.print("*");
				
			} //for k
			System.out.println();
			
		} 
		
		
	}

}
