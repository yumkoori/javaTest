package days08;

public class Ex10 {
	
	public static void main(String[] args) {
		int x = 10, y = 20;
		int [] value = new int [2];
		
		print(x, y);
		
		swap(x, y, value);
		
		print(value[0], value[1]);
	}

	private static int[] swap(int x, int y, int[] value) {
		int temp = x;
		x =  y;
		y = temp;
		
		value[0] = x;
		value[1] = y;
		
		return value;
	}

	private static void print(int x, int y) {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
}
