package days03;

public class Ex07_06 {

	public static void main(String[] args) {
		// ?: 삼항연산자 또는 조건연산자
		
		int x= 30, y;
		//y = x > 10 ? 1 : 2;
		y = (x > 5 ? (x < 10 ? 1 : 2) : 200);
		System.out.println(y);
	}

}
