package days08;

public class Ex02 {

	public static void main(String[] args) { 
		int sum = 0;
		int term = 1;
		int number = 1;
		int first= 1, second = 1;
		
		while(term <= 10) {
			System.out.printf("%d + ", first);
			number = first + second;
			sum += first;
			first = second;			
			second = number;
			term++;	
		} 
		System.out.printf("=%d",sum);
	}
}
