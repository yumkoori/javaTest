package days03;

public class Ex03 {

	public static void main(String[] args) {
		//두 기억공간의 값을 바꾸기
		int x = 10, y =20;
		System.out.printf("> x=%d, y=%d\n", x, y);
		{
			int temp = x;
			x =  y;
			y = temp;
		}		
		System.out.printf("> x=%d, y=%d\n", x, y);
		
	}
}
