package days07;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class pr06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 6. int [] m = new int[10];
  m 배열에 1~100까지의 정수를 중복되지 않게 채워넣고
  가장 큰 값을 찾아서 출력하세요.
6-2. 위의 코딩을 람다식과 스트림을 사용해서 코딩하세요. 
		 * 
		 * */
		
		IntStream m = new int[10];
		
		OptionalInt max = IntStream.of(m).limit(100).distinct().max();
		
		m = new Random().ints().distinct().limit(100);
		
		if (max.isPresent()) {
			System.out.println(max.getAsInt());
		}
	}

}
