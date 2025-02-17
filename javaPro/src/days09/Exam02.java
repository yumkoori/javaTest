package days09;

public class Exam02 {
	/*
	 * 2. 1 ~ n 까지의 합을 구해서 반환하는   [재귀함수]를 선언하세요. 
	 * 
	 * */
	public static void main(String[] args) {
		int sum = 0;
		sum(10, sum);
	}
	
	public static int sum(int number, int sum) {

		sum += number;
		number--;
		sum(number, sum);
				
		return sum;
	}

}
