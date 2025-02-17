package days06;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		int lottoNumber = 0;
		int index = 0, n;
		int[] pick = new int[6];
					

		while (index <= 5) {
			n = (int)(Math.random()*45)+1;
			boolean check = false;
			
			for (int i = 0; i < index; i++) {
				if (pick[i] == n) {
					check = true;
					break;
				}
			}
			
			if (!check) {
				pick[index++] = n;
			}
		}
		
		
		
	}
}
