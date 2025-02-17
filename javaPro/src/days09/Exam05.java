package days09;

public class Exam05 {
/*
 * 5. ┌      10개 항의 합     ┐을 아래와 같이 출력하는 코딩을 하세요.    
   1+2+4+7+11+16+22+29+...=???      
     1   2   3   4   5   6   
 * 
 * 
 * */
	
	
	public static void main(String[] args) {
		
		int term = 1;
		int inc = 1;
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d + ", term);
			sum += term;
			term += inc;
			inc++;
		} //for i
		
		System.out.printf("\b = %d ", sum);
	}

}
