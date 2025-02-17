package days08_class;

import java.util.Random;
import java.util.stream.IntStream;

public class Practice_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lotto = new int[6];

		fillLotto(lotto);
		//dispLotto(lotto);
	}

	private static void fillLotto(int[] lotto) {
		int n =0;
		
		 
		for (int i = 0; i < lotto.length; i++) {
			
			n = getRandomInteger(1, 45);
			
			if(!isDuplicate(lotto, n, i)) {
				
				lotto[i] = n;
			}
			
			
			
			
			
		} //for i
		
	}
	
	private static boolean isDuplicate(int[] lotto, int n, int i) {
		boolean flag = false;
		
		for (int j = 0; j < i; j++) {
			if (lotto[j] == n) {
				flag = true;
				break;
			}
		} //for j
		return flag;
	}

	private static int getRandomInteger(int min, int max) {
		return (int)(Math.random() * (max - min + 1)) + min;
	}

}
