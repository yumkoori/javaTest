package days08;

import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {
		
		new Random().ints(1, 46).distinct().limit(6).sorted().mapToObj(i -> i+ ",").forEach(System.out::print);
	}

}
