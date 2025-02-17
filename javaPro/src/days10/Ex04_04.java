package days10;

import java.util.Arrays;

public class Ex04_04 {

	public static void main(String[] args) {
		int[] m = {1, 2, 3};
		int [] temp = new int[m.length + 3];
		
		
		System.arraycopy(m, 0, temp, 2, m.length);
		
		Arrays.copyOf(m, m.length);
		
		int [] mClone = m.clone();
	}

}
