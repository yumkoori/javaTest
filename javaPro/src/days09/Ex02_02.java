package days09;

public class Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = power(2,-3);
		System.out.println(result);
	}

	private static int power(int i, int j) {
		int result = i;
		for (int k = 1; k < j; k++) {
			result *= i;
		} 
		return result;
	}

}
