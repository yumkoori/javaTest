package days03;

public class Ex03 {

	public static void main(String[] args) {
		//�� �������� ���� �ٲٱ�
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
